package Libraries;

import Objects.Ob_Consult;
import io.appium.java_client.AppiumDriver;

public class LB_Consult extends Ob_Consult {
    public LB_Consult(AppiumDriver driver){
        super(driver);
    }

    public void clickIconQuestion(){
        iconConsult.click();
    }

    public void sendNewMesage(String newQuestion){
        btnConsult.click();
        txtmessageConsult.sendKeys(newQuestion);
        btnsendQuestion.click();
    }

    public void selectSecting(){
        imgBack.click();
        iconSetting.click();
        System.out.println(iconSetting.getText());
    }

    public void Sigout(){
        txtLogout.click();
        btnOK.click();
    }



    public void selectProvidertoAsign(String assign){
        imgRight.click();
        if(assign.equals("assign")){
            assignDoctor.click();
        }
        else{
            submitRevier.click();
        }

    }

    public void CoordinatorAsignProvider(String accept_assign){
            if(accept_assign.equals("ok")){
                btn_ok.click();
            }
            else btn_cancel.click();

    }
    public void ProviderAcceptQuestion(String logic){
        if(logic.equals("OK")){
            btn_accept.click();
        }
        else{
            btn_decline.click();
            btn_ok.click();
        }
        imgBack.click();
    }

    public String getStatus(){
        String Status = txtStatus.getAttribute("text");
        return Status;
    }

    public void AnswerQuestion(String s){
        edit_text_msg.sendKeys(s);
        button_send.click();
        imgBack.click();
    }

    public void Change_Mode(){
        btn_mode.click();
        mode_Auditor.click();
    }

    public void ReviewApprove(String logic){
        if(logic.equals("ok")){
            btn_approve.click();
        }else if(logic.equals("cancel")){
            btn_reject.click();
            btnOK.click();
            imgBack.click();
        }else{
            imgBack.click();
        }

    }
}
