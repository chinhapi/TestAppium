package Configuration;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

public class AppiumStartAndStop {
    Process p;
    // Set path of your node.exe file.
    // Progra~1 represents Program Files folder.
    String nodePath = "C:/Users/chinh/AppData/Local/Programs/appium-desktop/node.exe";
    // Set path of your appium.js file.
    String appiumJSPath = "C:/Users/chinh/AppData/Local/Programs/appium-desktop/resources/app/node_modules/appium/lib/appium.js";
    String cmd = nodePath + " " + appiumJSPath;
    AndroidDriver driver;

    // This method Is responsible for starting appium server.
    public void appiumStart() throws Exception {
        // Execute command string to start appium server.
        p = Runtime.getRuntime().exec(nodePath);
        // Provide wait time of 10 mins to start appium server properly.
        // If face any error(Could not start a new session...) then Increase
        // this time to 15 or 20 mins.
        Thread.sleep(10000);
        if (p != null) {
            System.out.println("Appium server Is started now.");
        }
    }

    // This method Is responsible for stopping appium server.
    public void appiumStop() throws IOException {
        if (p != null) {
            p.destroy();
        }
        System.out.println("Appium server Is stopped now.");
    }

}
