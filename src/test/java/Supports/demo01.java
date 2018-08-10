package Supports;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.MobileBy.AndroidUIAutomator;

public class demo01 {
    private static AppiumDriver driver;
    private static Dimension size;
    public static void main(String[] args) throws Exception {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","GDR-Phone02");
        capabilities.setCapability("platformVersion","5.1.1");
        capabilities.setCapability("platformName","Android");
//        capabilities.setCapability("appPackage","com.globedr.app");
//        capabilities.setCapability("appActivity","com.globedr.app.SplashScreenActivity");

//        capabilities.setCapability("appPackage","com.mobeta.android.demodslv");
//        capabilities.setCapability("appActivity","com.mobeta.android.demodslv.Launcher");

        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        swipeVerical(driver,0.7,0.3);

        driver.findElement(AndroidUIAutomator("new UiSelector()." +
                "className(\"android.widget.TextView\").index(9)"));
        driver.getKeyboard().sendKeys("Perfecto Mobile communit*");
        Map<String, Object> BackspaceKeyEvent  = new HashMap<>();
        BackspaceKeyEvent.put("key", "67");
        driver.executeScript("mobile:key:event", BackspaceKeyEvent);
        driver.getKeyboard().sendKeys("y");
        Map<String, Object> EnterKeyEvent  = new HashMap<>();
        EnterKeyEvent.put("key", "66");
        driver.executeScript("mobile:key:event", EnterKeyEvent);


        MobileElement view=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
                "className(\"android.widget.TextView\").index(9)"));
        view.click();

        MobileElement copntrol=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
                "className(\"android.widget.TextView\").index(4)"));
        copntrol.click();

        MobileElement dark=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
                "className(\"android.widget.TextView\").index(4)"));
        dark.click();



        MobileElement spinner=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
                "className(\"android.widget.Spinner\")"));
        spinner.click();

        Thread.sleep(5000);
        //Locate all drop down list elements
        returnList();
        driver.quit();
//        driver.findElement(By.id("com.globedr.app:id/login_edit_username")).sendKeys("chinh1");
//        driver.findElement(By.id("com.globedr.app:id/login_edit_password")).sendKeys("123");
//        driver.findElement(By.id("com.globedr.app:id/login_button_login")).click();
//
//        MobileElement e1=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "className(\"android.widget.RelativeLayout\").instance(23)"));
//        e1.click();
//
//        MobileElement e2=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "resourceId(\"com.globedr.app:id/text_view_edit_profile\")"));
//        e2.click();
//
//        MobileElement e3=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "resourceId(\"com.globedr.app:id/text_edit_personal\")"));
//        e3.click();
//
//        MobileElement e4=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "resourceId(\"com.globedr.app:id/edit_dob\")"));
//        e4.click();
//
//        MobileElement mont=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "className(\"android.widget.NumberPicker\").index(1)"));
//        mont.click();
//        mont.clear();
//        mont.sendKeys("25");

//        MobileElement element6 = (MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                        "classname(\"android.widget.LinearLayout\").instance(1))"));
//        element6.click();

//        driver.findElement(By.id("android:id/button1")).click();

//        driver.findElement(By.xpath("android.widget.NumberPicker[@index='1']")).sendKeys("25");
//        driver.findElement(By.xpath("android.widget.NumberPicker[@index='2']")).sendKeys("2018");

//        try {
//            // right -> left
//            swipeHorizontal(driver,0.99,0.1);
//
//            //bottom -> top
//            swipeVerical(driver,0.7,0.3);
//
//            //top -> bottom
//            swipeVerical(driver,0.3,0.7);
//
//            //left -> right
//            swipeHorizontal(driver,0.1,0.99);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        WebElement el= (WebElement) driver.findElement(By.id("com.globedr.app:id/img_connection"));
//        el.click();
//
////        driver.findElement(By.xpath("//android.widget.TextView[@text='#28603']")).click();
//
//        MobileElement element = (MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "className(\"android.widget.TextView\").instance(2)"));
//        element.click();
//
//        MobileElement element1 = (MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "className(\"android.widget.LinearLayout\").index(5)"));
//        element1.click();
//
//        MobileElement element2 = (MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "resourceId(\"com.globedr.app:id/btn_right\").index(0)"));
//        element2.click();
//
//        MobileElement element3 = (MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "resourceId(\"com.globedr.app:id/button_delete\")"));
//        element3.click();
//
//        MobileElement element4 = (MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "resourceId(\"com.globedr.app:id/text_msg\")"));
//        String ok = element4.getText();
//        System.out.println(ok);
//        MobileElement element5 = (MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "resourceId(\"com.globedr.app:id/btn_ok\")"));
//        element5.click();


//        List<WebElement> aa= (List<WebElement>) driver.findElement(By.xpath("com.globedr.app:id/text_name"));
//        aa.get(12).click();





//        String sortPopularity = driver.findElement(MobileBy.AndroidUIAutomator(
//                String.format("new UiSelector().resourceId(\"test\")", "com.globedr.app:id/text_name"))).getText();

//        String sortPopularity = driver.findElement(MobileBy.AndroidUIAutomator(
//                String.format("new UiSelector().resourceId(\"com.globedr.app:id/text_name"))).getText();

        System.out.println("da tim thay ");
    }


    public static void getChildByText(){

//        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()." +
//                "resourceId(\"com.globedr.app:id/text_name_provider\"))." +
//                "getChildByText(new UiSelector().className(\"android.widget.TextView\"), \"Ahihi\")"));

        MobileElement element = (MobileElement) driver.findElement(AndroidUIAutomator("new UiScrollable(new UiSelector()." +
                "resourceId(\"com.globedr.app:id/text_name_provider\")).scrollIntoView("
                        + "new UiSelector().text(\"Ahihi\"))"));

        element.click();
    }

    public static WebElement scrolllist(String keyword) {
        HashMap scrollObject = new HashMap();
        RemoteWebElement element = (RemoteWebElement)driver.findElement(AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.TextView\")"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String webElementId = ((RemoteWebElement) element).getId();
        System.out.println(webElementId);
        System.out.println(element);
        scrollObject.put("text", keyword);
        scrollObject.put("element", webElementId);
        js.executeScript("mobile: scrollTo", scrollObject);
        return element;
    }

    public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int starty = size.height / 2;
        int startx = (int) (size.width * startPercentage);
        int endx = (int) (size.width * finalPercentage);
        System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(startx, starty).waitAction().moveTo(endx, starty).release().perform();

        //new TouchAction(driver).press(startPoint, anchor).waitAction().moveTo(endPoint, anchor).release().perform();
        //In documentation they mention moveTo coordinates are relative to initial ones, but thats not happening. When it does we need to use the function below
        //new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint-startPoint,0).release().perform();
    }

    public static void swipeVerical(AppiumDriver driver, double startPercentage, double finalPercentage) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startx = size.width / 2;
        int starty = (int) (size.height * startPercentage);
        int endy = (int) (size.height * finalPercentage);
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(startx, starty).waitAction().moveTo(startx, endy).release().perform();
    }

    public static void performOrientation() throws InterruptedException {
        //Get and print current screen orientation.
        System.out.println("*--*--*-- Current screen orientation Is : " + driver.getOrientation());
        System.out.println("*--*--*-- Changing screen Orientation to LANDSCAPE.");
        //Changing screen Orientation to LANDSCAPE.
        driver.rotate(ScreenOrientation.LANDSCAPE);
        //Get and print screen orientation after changing It.
        System.out.println("*--*--*-- Now screen orientation Is : "+ driver.getOrientation());
        Thread.sleep(5000);
        // Click on Views.
        System.out.println("*--*--*-- Changing screen Orientation to PORTRAIT.");
        //Changing screen Orientation to PORTRAIT.
        driver.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
        //Get and print screen orientation after changing It.
        System.out.println("*--*--*-- Now screen orientation Is : "+ driver.getOrientation());
        Thread.sleep(5000);
    }

    public static void returnList() {
        List dropList = driver.findElements(By.id("android:id/text1"));
        //Extract text from each element of drop down list one by one.
        for (int i = 0; i < dropList.size(); i++) {
            MobileElement listItem = (MobileElement) dropList.get(i);
            System.out.println(listItem.getText());
        }
    }
}
