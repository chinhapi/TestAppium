package Configuration;

import Supports.CommonFunction;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Config_test {
    public AppiumDriver driver;
    @BeforeMethod
    @Parameters({"deviceName","platformVersion","platformName","appPackage","appActivity"})
    public void connectAppium(String deviceNam, String platformVersion, String platformName, String appPackge, String appActivity) throws Exception {
        driver= CommonFunction.connetAndroid(driver,deviceNam,platformVersion,platformName,appPackge,appActivity);
}
    @AfterMethod
    public void closeAppium() throws InterruptedException {
        Thread.sleep(100);
        driver.quit();
    }
}

