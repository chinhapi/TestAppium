package Objects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Ob_Consult {
    public Ob_Consult(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // select funtion Question at Home Screen
    @AndroidFindBy(id = "com.globedr.app:id/img_question")
    public WebElement iconConsult;

    @AndroidFindBy(id="com.globedr.app:id/fab")
    public AndroidElement btnConsult;

    @AndroidFindBy(id="com.globedr.app:id/edit_text_message")
    public AndroidElement txtmessageConsult;

    @AndroidFindBy(id="com.globedr.app:id/btn_right")
    public AndroidElement btnsendQuestion;

    @AndroidFindBy(id = "com.globedr.app:id/text_question")
    public AndroidElement txtStringQuestion;

    @AndroidFindBy(id = "com.globedr.app:id/image_back")
    public AndroidElement imgBack;

    @AndroidFindBy(id = "com.globedr.app:id/text_lablel")
    public AndroidElement txtStatus;

    @AndroidFindBy(xpath = ".//*[@text='Settings']")
    public AndroidElement iconSetting;

    @AndroidFindBy(id = "com.globedr.app:id/text_log_out")
    public AndroidElement txtLogout;

    @AndroidFindBy(id = "com.globedr.app:id/btn_ok")
    public  AndroidElement btnOK;

    @AndroidFindBy(xpath = ".//*[@text='cau hoi 07']")
    public AndroidElement searchQuestion;


   //Test=2
    @AndroidFindBy(id = "com.globedr.app:id/layout_item_question")@SelendroidFindBy(id="text_question")
    public AndroidElement layout_item_question;

    @AndroidFindBy(id = "com.globedr.app:id/image_right")
    public AndroidElement imgRight;

    ///Popup để assign, submit...
    @AndroidFindBy(id = "com.globedr.app:id/one")
    public AndroidElement assignDoctor;

    @AndroidFindBy(id = "com.globedr.app:id/two")
    public AndroidElement submitRevier;

    ///Popup xác nhận chọn bác sĩ để assign
    @AndroidFindBy(id = "com.globedr.app:id/btn_ok")
    public AndroidElement btn_ok;

    @AndroidFindBy(id = "com.globedr.app:id/btn_cancel")
    public AndroidElement btn_cancel;

    ////Popup chap nhan cau hoi cua Provider
    @AndroidFindBy(id = "com.globedr.app:id/btn_decline")
    public AndroidElement btn_decline;

    @AndroidFindBy(id = "com.globedr.app:id/btn_accept")
    public AndroidElement btn_accept;

    ///Provider answer question for user
    @AndroidFindBy(id = "com.globedr.app:id/edit_text_msg")
    public AndroidElement edit_text_msg;

    @AndroidFindBy(id = "com.globedr.app:id/button_send")
    public AndroidElement button_send;

    ///Popup change mode
    @AndroidFindBy(id="com.globedr.app:id/btn_mode")
    public AndroidElement btn_mode;

    @AndroidFindBy(id = "com.globedr.app:id/two")
    public AndroidElement mode_Auditor;

    @AndroidFindBy(id = "com.globedr.app:id/btn_approve")
    public AndroidElement btn_approve;

    @AndroidFindBy(id = "com.globedr.app:id/btn_reject")
    public AndroidElement btn_reject;
}
