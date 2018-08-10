package Modules;

import Configuration.Config_test;
import Libraries.LB_Consult;
import Libraries.LB_Login;
import Supports.CommonFunction;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Md_Consult extends Config_test {
    //<!--user send new question -->
//    @Test(priority = 0)
//    public void chinh() throws Exception {
//        // nguoi dung login vao he thong
//        LB_Login sigin=new LB_Login(driver);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        sigin.Login("c3","123");// user đăng nhập để send câu hỏi
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        CommonFunction cm=new CommonFunction();
//
//        //thuc hien chuc nang tu van
//        LB_Consult consult=new LB_Consult(driver);
//        consult.clickIconQuestion();
//        consult.sendNewMesage("User C3 send question 01");
//    }
//
    @Test(priority = 1)
    public void UserCheckStatus(){
        LB_Login sigin=new LB_Login(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sigin.Login("c3","123");// user đăng nhập để send câu hỏi
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        CommonFunction cm=new CommonFunction();

        LB_Consult consult=new LB_Consult(driver);
        consult.clickIconQuestion();
        String Status=cm.returnListV2(driver, "User C3 send question 01", "com.globedr.app:id/layout_item_question"
                , "com.globedr.app:id/text_question","com.globedr.app:id/text_lablel");
        if(Status.equals("Pending")){
            System.out.println("Câu hỏi user đã được gửi thành công với status: "+Status);
        }
    }

    @Test(priority = 2)
    public void coordinator() throws Exception{
        LB_Login sigin=new LB_Login(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sigin.Login("c4","123");// user đăng nhập để send câu hỏi
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        CommonFunction cm = new CommonFunction();

        LB_Consult consult=new LB_Consult(driver);
        consult.clickIconQuestion();

        cm.returnListV2(driver,"User C3 send question 01","com.globedr.app:id/layout_item_question"
                ,"com.globedr.app:id/text_question","com.globedr.app:id/text_number");

        consult.selectProvidertoAsign("assign");
        //<!--select provider and cancel -->
        System.out.println("TC1: select provider and cancel");
        cm.returnListV3(driver,"Provider_chinh","android:id/list","android.widget.RelativeLayout"
                ,"com.globedr.app:id/text_name","com.globedr.app:id/btn_select","");

        consult.CoordinatorAsignProvider("");

        //<!--select provider and accept -->
        System.out.println("TC1: select provider and accept");
        cm.returnListV3(driver,"Provider_chinh","android:id/list","android.widget.RelativeLayout"
                ,"com.globedr.app:id/text_name","com.globedr.app:id/btn_select","");
        consult.CoordinatorAsignProvider("ok");
        System.out.println("Coordinator assign Provider: Successful");
//
//        //TC1: not assign provider when assign before
//        consult.selectProvidertoAsign();
//        String s3=cm.returnListV3(driver,"Provider_chinh","android:id/list","android.widget.RelativeLayout"
//                ,"com.globedr.app:id/text_name","com.globedr.app:id/btn_select");
//        System.out.println("bác sĩ can tim: "+s3);
//
//        if("Provider_chinh".equals(s3)){
//            System.out.println("TC1 fail");
//        }else{
//            System.out.println("TC1 succesfull");
//        }
    }

    ///Provider action question
//    @Test(priority = 2)
//    public void viewNotice(){
//        CommonFunction cm = new CommonFunction();
//
////        LB_Login sigin=new LB_Login(driver);
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        sigin.Login("c5","123");// user đăng nhập để send câu hỏi
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        LB_Consult consult=new LB_Consult(driver);
//        consult.clickIconQuestion();
//
////        cm.returnListV5(driver,"Gửi LTC 01","com.globedr.app:id/layout_item_question"
////                ,"com.globedr.app:id/text_question");
////        consult.ProviderAcceptQuestion("OK");
////        if("Accepted".equals(consult.getStatus())){
////            System.out.println("Provider chap nhan cau hoi tu user");
////        }
//        cm.returnListV5(driver,"Gửi LTC 01","com.globedr.app:id/layout_item_question"
//                ,"com.globedr.app:id/text_question");
//        consult.AnswerQuestion("auto answer question 01");
//    }

//    @Test(priority = 3)
//    public void UserViewAnserProvider() throws Exception {
//        CommonFunction cm = new CommonFunction();
//        // nguoi dung login vao he thong
//        LB_Login sigin=new LB_Login(driver);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        sigin.Login("c3","123");// user đăng nhập để send câu hỏi
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        //thuc hien chuc nang tu van
//        LB_Consult consult=new LB_Consult(driver);
//        consult.clickIconQuestion();
//        cm.returnListV5(driver,"Gửi LTC 01","com.globedr.app:id/layout_item_question"
//                ,"com.globedr.app:id/text_question");
//        String s = "auto answer question 08";
//        if(s.equals(cm.returnListV5(driver,"auto answer question 08","com.globedr.app:id/layout_container"
//                ,"com.globedr.app:id/text_view_comment"))) {
//            System.out.println("tim thay duoc cau hoi tra loi hop ly cua bac si: "+s);
//        }
//        consult.AnswerQuestion("c3 comment 01");
//    }

//    @Test(priority = 4)
//    public void SubmitReviewer() throws Exception {
//        CommonFunction cm = new CommonFunction();
//        LB_Login sigin = new LB_Login(driver);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        sigin.Login("c4", "123");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        LB_Consult consult=new LB_Consult(driver);
//        consult.clickIconQuestion();
//
//        cm.returnListV5(driver, "Gửi LTC 01", "com.globedr.app:id/layout_item_question"
//                , "com.globedr.app:id/text_question");
//
//        consult.selectProvidertoAsign("submit");
//        cm.returnListV3(driver,"chinh cong","android:id/list","android.widget.RelativeLayout","com.globedr.app:id/text_name","com.globedr.app:id/btn_select","");
//        consult.CoordinatorAsignProvider();
//    }

//    @Test(priority = 5)

//    public void Check_Reviewer(){
//        CommonFunction cm = new CommonFunction();
////        LB_Login sigin = new LB_Login(driver);
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        sigin.Login("chinh", "123");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        LB_Consult consult=new LB_Consult(driver);
//        consult.clickIconQuestion();
//
//        consult.Change_Mode();
//
//        //<!--TC1: Review tu choi cau hoi tu Provider + Ly do tu choi cau hoi--->
//        System.out.println("TC1: Review tu choi cau hoi tu Provider + Ly do tu choi cau hoi");
//        if(cm.returnListV2(driver, "phương cẩu tạp chủng 01", "com.globedr.app:id/layout_item_question"
//                , "com.globedr.app:id/text_question","com.globedr.app:id/text_lablel").equals("Submitted")){
//            consult.ReviewApprove("cancel");
//            if(cm.returnListV2(driver,"phương cẩu tạp chủng 01","com.globedr.app:id/layout_item_question"
//                    ,"com.globedr.app:id/text_question","com.globedr.app:id/text_lablel").equals("Added"))
//            {
//                System.out.println("Review tu choi thanh cong");
//                consult.AnswerQuestion("Review tu choi cau hoi tu provider va tra loi cau hoi lan 01");
//            }else{
//                System.out.println("TC1 Reviewer tu choi: fail");
//            }
//        }else{
//            System.out.println("Please question stautus before Reviewer Approve");
//            consult.ReviewApprove("");
//        }
//
//        //<!--TC1: Review chap nhan cau hoi tu Provider + Ly do chap nhan cau hoi--->
//        System.out.println("TC2: Review chap nhan cau hoi tu Provider + Ly do chap nhan cau hoi");
//
//        if(cm.returnListV2(driver, "User chinh send question by automation 03", "com.globedr.app:id/layout_item_question"
//                , "com.globedr.app:id/text_question","com.globedr.app:id/text_lablel").equals("Submitted")) {
//            consult.ReviewApprove("ok");
//            consult.AnswerQuestion("Review chap nhan cau hoi tu provider va tra loi cau hoi lan 01");
//            System.out.println("TC2 Reviewer chap nhan: succesfull");
//        }else{
//            System.out.println("Please question stautus before Reviewer Approve");
//            consult.ReviewApprove("");
//        }
//    }
}




//
//        sigin.Login("c4","123");//coordinator đăng nhập assign cho bác sĩ
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//
////        MobileElement dark=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
////                "className(\"android.widget.RelativeLayout\").instance(23)"));
////        dark.click();
//
//
////        sigin.selectlanguges();
//
////        sigin.healthy();
////        String updateText = CommonFunction.getText(driver);//cancel_updateNextVaccine
////
////        System.out.println("TC1: action update LTC");
////        System.out.println("Next Vaccine: " +updateText);
////        sigin.updateNextVaccine(driver,"Mar","benh vien","ghi chu");
////        if(updateText.equalsIgnoreCase(CommonFunction.getText(driver))){
////            System.out.println("Update khong thanh cong");
////        }
////        else System.out.println("Update thanh cong");
////
////        String updateText1 = CommonFunction.getText(driver);
////        System.out.println("Next Vaccine: " +updateText1);
////        System.out.println("TC1: action cancel_update LTC");
////        sigin.cancel_updateNextVaccine(driver,"Mar","benh vien","ghi chu");
////        if(updateText1.equalsIgnoreCase(CommonFunction.getText(driver))){
////            System.out.println("Cancel update thanh cong");
////        }
////        else System.out.println("Cancel khong thanh cong");
////        sigin.buidReport();


//    @Test(priority = 1)
//    public void healthy(){
//        MobileElement healthy=(MobileElement) driver.findElement(AndroidUIAutomator("new UiSelector()." +
//                "recourceId(\"com.globedr.app:id/layout_health\")"));
//        healthy.click();
//    }

    // Drag & Drop
//    @Test
//    public void chinh1() throws ClassCastException{
//        LB_test init=new LB_test(driver);
//        System.out.println("tim kiem element");
//        //        init.lcgin("c1","123");
//        driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title")).get(0).click();
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//        WebElement ele1= (WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(1);
//        WebElement ele2= (WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(2);
//
//        TouchAction action = new TouchAction((PerformsTouchActions) driver);
////        TouchAction action = new TouchAction((MobileDriver) driver);
//        System.out.println("It Is dragging element.");
//        action.longPress(ele1).waitAction().moveTo(ele2).release().perform();
//        System.out.println("Element has been droped at destination successfully.");
//    }

//    @Test
//    public void chinh1() throws ClassCastException{
//        LB_test init=new LB_test(driver);
//        System.out.println("tim kiem element");
//        //        init.lcgin("c1","123");
////        driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title")).get(0).click();
////        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
////        WebElement ele1= (WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(1);
////        WebElement ele2= (WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(2);
////
////        TouchAction action = new TouchAction((PerformsTouchActions) driver);
//////        TouchAction action = new TouchAction((MobileDriver) driver);
////        System.out.println("It Is dragging element.");
////        action.longPress(ele1).waitAction().moveTo(ele2).release().perform();
////        System.out.println("Element has been droped at destination successfully.");
////        driver.s
//    }

