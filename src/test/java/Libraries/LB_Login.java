package Libraries;

import Objects.Ob_Login;
import io.appium.java_client.AppiumDriver;

public class LB_Login extends Ob_Login {
    public LB_Login(AppiumDriver driver){
        super(driver);
    }

    public void Login(String userName, String Password){
        user.sendKeys(userName);
        pass.sendKeys(Password);
        bntLogin.click();

    }
}
