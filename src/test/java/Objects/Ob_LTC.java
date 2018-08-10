package Objects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Ob_LTC {
    public Ob_LTC(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.globedr.app:id/img_records")
    public AndroidElement img_records;

    @AndroidFindBy(id = "com.globedr.app:id/btn_save")
    public AndroidElement btn_save;

    @AndroidFindBy(id = "com.globedr.app:id/btn_cancel")
    public AndroidElement btn_cancel;

    @AndroidFindBy(id = "com.globedr.app:id/txt_nextVac")
    public AndroidElement txt_nextVac;

    @AndroidFindBy(id = "com.globedr.app:id/txt_vac_by_ages")
    public AndroidElement txt_vac_by_ages;

    @AndroidFindBy(id = "com.globedr.app:id/txt_vac_by_vaccines")
    public AndroidElement txt_vac_by_vaccines;

    @AndroidFindBy(id = "com.globedr.app:id/txt_immunization_book")
    public AndroidElement txt_immunization_book;

    @AndroidFindBy(id = "com.globedr.app:id/txt_my_pedestrians")
    public AndroidElement txt_my_pedestrians;

    @AndroidFindBy(id = "com.globedr.app:id/txt_request_to_find_pedestrians")
    public AndroidElement txt_request_to_find_pedestrians;

    @AndroidFindBy(id = "com.globedr.app:id/one")
    public AndroidElement one;

    @AndroidFindBy(id = "com.globedr.app:id/two")
    public AndroidElement two;

    //Update Dob and Sex
    @AndroidFindBy(id = "com.globedr.app:id/tv_dob")
    public AndroidElement tv_dob;

    @AndroidBy(id = "com.globedr.app:id/tv_gender")
    public AndroidElement tv_gender;

    @AndroidFindBy(className = "android.widget.ListView")
    public AndroidElement listGender;

    //chuc nang LTC
    @AndroidFindBy(id = "com.globedr.app:id/view_immunization")
    public AndroidElement view_immunization;

    @AndroidFindBy(id = "com.globedr.app:id/btn_got_it")
    public AndroidElement btn_got_it;

    @AndroidFindBy(id = "com.globedr.app:id/container_all")
    public String container_all;

    @AndroidFindBy(id = "com.globedr.app:id/btn_enter_update")
    public AndroidElement btn_enter_update;

    @AndroidFindBy(id = "com.globedr.app:id/edt_clinic_name")
    public AndroidElement edt_clinic_name;

    @AndroidFindBy(id = "com.globedr.app:id/edt_note")
    public AndroidElement edt_note;

    @AndroidFindBy(id = "com.globedr.app:id/list_vaccines_update")
    public String list_vaccines_update;

    @AndroidFindBy(id = "com.globedr.app:id/txt_name_vaccines")
    public String txt_name_vaccines;

    //Xoa Vaccine
    @AndroidFindBy(id = "com.globedr.app:id/btn_info_vaccines")
    public String btn_info_vaccines;

}