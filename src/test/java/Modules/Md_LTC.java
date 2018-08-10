package Modules;

import Configuration.Config_test;
import Libraries.LB_LTC;
import Supports.CommonFunction;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Md_LTC extends Config_test{
//    @Test(priority = 0)
//    public void updateDob() throws InterruptedException {
////        LB_Login login=new LB_Login(driver);
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        login.Login("midu","123456");// user đăng nhập để send câu hỏi
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        CommonFunction cm=new CommonFunction();
//
//        LB_LTC ltc =new LB_LTC(driver);
//        ltc.updateDob_Gender("yes","","ok");
//        ltc.LTC();
//        ltc.selectHealth(0);
//        ltc.updateVaccine("Update by date","ten phopng kham 01","ghi chu 01");
//        cm.returnListV2(driver,"Vắc-xin ngừa viêm gan B","com.globedr.app:id/container_all",
//                "com.globedr.app:id/txt_name_vaccines","com.globedr.app:id/txt_name_vaccines");
//        ltc.saveVaccine();
//        System.out.println("TC1: Vắc-xin ngừa viêm gan B bỏ chọn thành công");
//        Thread.sleep(20);
//    }

    @Test(priority = 1)
    public void updateVaccine(){
        System.out.println("TC2: update vaccine còn lại đã bỏ chọn trước đó");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        CommonFunction cm=new CommonFunction();
        LB_LTC ltc =new LB_LTC(driver);
        ltc.iconHealth();
        ltc.LTC();
        ltc.selectHealth(0);

        cm.returnListV2(driver,"Vắc-xin ngừa viêm gan B","com.globedr.app:id/container_all",
                "com.globedr.app:id/txt_name_vaccines","com.globedr.app:id/container_receive_date");
        ltc.updateVaccine("Update by date","PK đa khoa vạn hạnh 01","chích mũi còn sót");
        ltc.saveVaccine();
        System.out.println("TC2: update vaccine còn lại đã bỏ chọn trước đó -> stautus: Pass");
    }
}
