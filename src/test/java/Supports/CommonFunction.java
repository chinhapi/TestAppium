package Supports;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonFunction {
   public  AppiumDriver driver;


   public static AppiumDriver connetAndroid(AppiumDriver driver,String deviceName, String platformVersion, String platformName, String appPackage, String appActivity) throws Exception {
////       AppiumStartAndStop srv = new AppiumStartAndStop();
//       // Stop appium server If It Is already running.
//       srv.appiumStop();
//       // Start appium server.
//       srv.appiumStart();
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName",deviceName);
        capabilities.setCapability("platformVersion",platformVersion);
        capabilities.setCapability("platformName",platformName);
        capabilities.setCapability("appPackage",appPackage);
        capabilities.setCapability("appActivity",appActivity);
        capabilities.setCapability("noReset","true");
//        capabilities.setCapability("unicodeKeyboard", true);
//        capabilities.setCapability("resetKeyboard", true);
        driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
//        driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
//        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        return driver;
    }


    public String returnListV2(AppiumDriver driver, String s1, String elementParent, String elementChidren, String elementChidren2) {
        AndroidElement temp = null;
        boolean flag = false;
        int dem = 0;
        String kq = null;
        try {
            for(int i=0; i<=3; i++){
                temp = (AndroidElement) driver.findElements(By.id(elementParent)).get(i);
                if(temp.findElement(By.id(elementChidren)).getAttribute("text").equals(s1)){
                    flag = true;
                    kq = temp.findElement(By.id(elementChidren2)).getAttribute("text");
                    temp.findElement(By.id(elementChidren)).click();
                    break;
                }
                dem ++;
                if(flag==false && i==3 && dem<=70){
                    i = 0;
                    swipeVerical(driver,0.6,0.5);
                }
                String kq1=temp.findElement(By.id(elementChidren)).getAttribute("text");
                System.out.println("bien lap "+dem+" - chi so i = " +i+"  content: " +kq1);
            }
        }catch (Exception e){System.out.println("khong tim thay phan tu can tim");}
        return kq;
    }

    public String returnListV3(AppiumDriver driver, String s1, String elementParent, String elementClass, String elementChidren, String elementChidren2, String Id_or_Class){
        AndroidElement temp = null;
        String s2 = null;
        String kq = null;
        int n = 0;
        boolean flag = false;
        int dem=0;
            for(int i=0; i<=3; i++) {
                if(Id_or_Class.equals("id")){
                    temp = (AndroidElement) driver.findElement(By.id(elementParent)).findElements(By.id(elementClass)).get(i);
                }else{
                    temp = (AndroidElement) driver.findElement(By.id(elementParent)).findElements(By.className(elementClass)).get(i);
                }
                if (temp.findElement(By.id(elementChidren)).getAttribute("text").equals(s1)) {
                    flag = true;
                    temp.findElement(By.id(elementChidren2)).click();
                    break;
                }
                dem ++;
                if(flag==false && i==3 && dem<=70){
                    i = 0;
                    swipeVerical(driver,0.6,0.5);
                }
                kq=temp.findElement(By.id(elementChidren)).getAttribute("text");
                System.out.println("bien lap "+dem+" - chi so i = " +i+"  content: " +kq);
            }
            return  kq;
    }

    public String returnListV5(AppiumDriver driver, String s1, String elementParent, String elementChidren) {
        AndroidElement temp = null;
        boolean flag = false;
        int dem = 0;
        String kq = null;
        for(int i=0; i<=3; i++){
            temp = (AndroidElement) driver.findElements(By.id(elementParent)).get(i);
            if(temp.findElement(By.id(elementChidren)).getAttribute("text").equals(s1)){
                flag = true;
                kq = temp.findElement(By.id(elementChidren)).getAttribute("text");
                temp.findElement(By.id(elementChidren)).click();
                break;
            }
            dem ++;
            if(flag==false && i==3 && dem<=70){
                i = 0;
                swipeVerical(driver,0.6,0.5);
            }
            String kq1=temp.findElement(By.id(elementChidren)).getAttribute("text");
            System.out.println("bien lap "+dem+" - chi so i = " +i+"  content: " +kq1);
        }
        return kq;
    }

    public AndroidElement returnListV1(AppiumDriver driver, String s1, String elementParent, String elementChidren) {
        List<AndroidElement> list= driver.findElements(By.id(elementParent));
        String s2 = "";
        AndroidElement element = null;

        for(int i=0; i<list.size();i++){
            if(s2.equalsIgnoreCase(s1)){
                System.out.println("đã tìm thấy phần tử cần tìm");
            }
            else{
                System.out.println("kich thuoc lon nhat của screen: " +list.size());
                System.out.println("chi so index: " +i);
                AndroidElement listItem = (AndroidElement) list.get(i);
                element = (AndroidElement) listItem.findElement(By.id(elementChidren));
                s2=listItem.findElement(By.id(elementChidren)).getText();
                System.out.println(s2);
                swipeVerical(driver,0.6,0.5);
            }
            if(!s2.equalsIgnoreCase(s1) && i==list.size()-1){
                i = -1;
            }

        }
        return element;
    }

    public AndroidElement returnList(AppiumDriver driver, String s1, String elmentParent, String elementChidren) {
        List<AndroidElement> list= driver.findElements(By.className(elmentParent));
        String s2 = "";
        AndroidElement element = null;

        for(AndroidElement children : list){
            if(!s1.equalsIgnoreCase(s2)){
                s2 = children.findElement(By.id(elementChidren)).getText();
                System.out.println(children.findElement(By.id(elementChidren)).getText());
                element=children;
            }
            swipeVerical(driver,0.55,0.5);
        }
        if(!s1.equalsIgnoreCase(s2)){
            swipeVerical(driver,0.9,0.1);
            for(AndroidElement children : list){
                if(!s1.equalsIgnoreCase(s2)){
                    s2 = children.findElement(By.id(elementChidren)).getText();
                    System.out.println(children.findElement(By.id(elementChidren)).getText());
                    element=children;
                }
                swipeVerical(driver,0.55,0.5);
            }
        }

        return element;
    }

    public void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int starty = size.height / 2;
        int startx = (int) (size.width * startPercentage);
        int endx = (int) (size.width * finalPercentage);
        System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(startx, starty).waitAction().moveTo(endx, starty).release().perform();
    }

    public void swipeVerical(AppiumDriver driver, double startPercentage, double finalPercentage) {
        Dimension size = driver.manage().window().getSize();
        int startx = size.width / 2;
        int starty = (int) (size.height * startPercentage);
        int endy = (int) (size.height * finalPercentage);
//        System.out.println("starty = " + starty + ", endy = " + endy + ", startx = " + startx);
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(startx, starty).waitAction().moveTo(startx, endy).release().perform();
    }


    public void selectElementInList(AppiumDriver driver, String cha, String con, int index) {
       AndroidElement flag= (AndroidElement) driver.findElements(By.className(cha)).get(index);
       flag.findElement(By.id(con)).click();
    }
}
