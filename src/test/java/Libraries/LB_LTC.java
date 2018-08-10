package Libraries;

import Objects.Ob_LTC;
import io.appium.java_client.AppiumDriver;

public class LB_LTC extends Ob_LTC {
    public LB_LTC(AppiumDriver driver){
        super(driver);
    }

    public void updateDob_Gender(String ngaysinh, String gioitinh, String update){
        img_records.click();
        try{
            if(tv_dob.getText().equals("dd-mm-yyyy")){
                tv_dob.click();
                if(ngaysinh.equals("yes")){
                    btn_save.click();
                }else btn_cancel.click();
            }
        }
        catch (Exception e){System.out.println("user da co ngay sinh");}
        try{
            if(tv_gender.getText().equals("Unspecified")){
                tv_gender.click();
                if(gioitinh.equals("male")){
                    listGender.findElementByAndroidUIAutomator("new UiSelector()." +
                            "resourceId(\"com.globedr.app:id/tv_gender\").index(0)").click();
                }else listGender.findElementByAndroidUIAutomator("new UiSelector()." +
                        "resourceId(\"com.globedr.app:id/tv_gender\").index(1)").click();
            }
        }
        catch (Exception e){System.out.println("user da co gioi tinh");}
        try{
            if(update.equals("ok")){
            btn_save.click();
            System.out.println("TC01: update ngày sinh và giới tính thành công");
            }else {
            btn_cancel.click();
            System.out.println("TC02: Hủy update ngày sinh và giới tính thành công");
            }
        }
        catch (Exception e){System.out.println("user da co gioi tinh va ngay sinh");}
    }

    public void iconHealth(){
        img_records.click();
    }
    public void LTC(){
        view_immunization.click();
        try{
            btn_got_it.click();
        }catch (Exception e){System.out.println("Info khong can hien thi lai");}
    }
    public void updateVaccine(String optionUpdate,String nameClinic, String note){
        btn_enter_update.click();
        if(optionUpdate.equals("Update by date")){
            one.click();
        } else two.click();
        edt_clinic_name.sendKeys(nameClinic);
        edt_note.sendKeys(note);
    }
    public void saveVaccine(){
        btn_save.click();
    }

    public void selectHealth(int th) {
        switch (th){
            case 1:
                txt_vac_by_ages.click();
                break;
            case 2:
                txt_vac_by_vaccines.click();
                break;
            case 3:
                txt_immunization_book.click();
                break;
            case 4:
                txt_my_pedestrians.click();
                break;
            case 5:
                txt_request_to_find_pedestrians.click();
                break;
            default:
                    txt_nextVac.click();
        }
    }
}
