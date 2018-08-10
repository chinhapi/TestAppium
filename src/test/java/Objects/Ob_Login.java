package Objects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ob_Login {
//    public WebDriver driver;
    public Ob_Login(AppiumDriver driver){
//        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Tìm kiếm phần tử login
    @AndroidFindBy(id = "com.globedr.app:id/login_edit_username")
    public WebElement user;

    @AndroidFindBy(id="com.globedr.app:id/login_edit_password")
    public WebElement pass;


    @AndroidFindBy(id="com.globedr.app:id/login_button_login")
    public WebElement bntLogin;

//    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@instance=23]")
//    public WebElement iconSetting;

    @AndroidFindBy(id="com.globedr.app:id/text")
    public WebElement iconSetting;

    //function healthy
    //find icon healthy
    @AndroidFindBy(id="com.globedr.app:id/layout_health")
    public WebElement iconHealthy;

    //find Account
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Me']")
    public WebElement subAccount;

    //find tab Immuization
    @AndroidFindBy(id = "com.globedr.app:id/text_schedule")
    public WebElement Immunization;

    //find icon update vaccine
    @AndroidFindBy(id = "com.globedr.app:id/btn_info_vaccines")
    public WebElement updateVaccine;
    //updateNextVaccine
    //txt_date_vaccines
    @AndroidFindBy(id="com.globedr.app:id/txt_date_vaccines")
    public WebElement dateVaccine;
    //txt_tên phong kham
    @AndroidFindBy(id="com.globedr.app:id/edt_clinic_name")
    public WebElement txtClinic;
    //txt_Note
    @AndroidFindBy(id="com.globedr.app:id/edt_note")
    public WebElement txtNote;
    //calendar date
    @AndroidFindBy(xpath = "//android.widget.NumberPicker")
    public WebElement calDate;
    //Save calendar
    @AndroidFindBy(id="com.globedr.app:id/btn_save")
    public WebElement btnSave;

    @AndroidFindBy(id = "com.globedr.app:id/btn_save")
    public WebElement btnLuu;

    @AndroidFindBy(id = "com.globedr.app:id/btn_cancel")
    public WebElement btnCancel;

    @AndroidFindBy(id = "com.globedr.app:id/txt_more")
    public WebElement txtmore;

    @FindBy(id="com.globedr.app:id/img_note")
    public WebElement imgNote;

    @FindBy(id="com.globedr.app:id/one")
    public WebElement vaccineRecord;


}
