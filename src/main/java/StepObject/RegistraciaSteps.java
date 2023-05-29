package StepObject;


import PageObject.RegistraciaObject;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;


import static DataObject.RegistraciaData.*;



public class RegistraciaSteps extends RegistraciaObject {
    @Step("ჩემ ანგარიშში გადასვლა")
    public RegistraciaSteps Acount() {
        acountbutton.click();
        noacount.shouldBe(Condition.visible);
        return this;
    }

    @Step("რეგიტრაციის გვერძე გადასვლა")
    public RegistraciaSteps Reg() {
        regbutton.click();
        return this;
    }
    @Step("სახელის და გვარის გადაცემა:{fullname}")
    public RegistraciaSteps FullName(String name){
        nameInput.setValue(name);
        return this;
    }
    @Step("ტელეფონის ნომრის შეყვანა:{phone}")
    public RegistraciaSteps Phone(String phonne){
        phoneInput.setValue(phonne);
        return this;
    }
    @Step("ელექტრონული ფოსტის შეყვანა:{email}")
    public RegistraciaSteps Email (String email){
        emailInput.setValue(email);
        return this;
    }
    @Step("პაროლის შეყვანა:{password}")
    public RegistraciaSteps Password(String pass){
        passwordInput.setValue(pass);
        return this;
    }
    @Step("პაროლის გამეორება:{confirmpassword}")
    public RegistraciaSteps ConfPassword(String confpass){
        confirmPassword.setValue(confpass);
        return this;
    }
    @Step("რეგისტრაციაზე გადასვლა")
    public RegistraciaSteps Registr() {
        regInput.click();
        eror.shouldBe(Condition.visible);
        return this;
    }

    @Step("შემოწმება ნამდვილათ ვართ თუ არა ავტორიზაციის გვერძე")
    public RegistraciaSteps Checkpage(){
        gotoaurorizacia.click();
        autorizacia.isDisplayed();
        return this;
    }
    @Step("ავტორიზაცია")
    public RegistraciaSteps Autorizacia() {
        writeemail.setValue(email);
        writepassword.setValue(password);
        login.click();
        return this;
    }
   @Step("ჩემ გვერძე გადასვლა")
    public RegistraciaSteps Checkacount() {
        myacount.click();
        checkacount.shouldBe(Condition.visible);
        return this;
    }
    @Step("ჩემი ანგარიშიდან გამოსვლა")
    public RegistraciaSteps LogOut(){
        logout.click();
        return this;
    }
    @Step("შემოწმება ნამდვილად გამოვიდა თუ არა ჩემი ანგარიშიდან")
    public RegistraciaSteps CheckLogout(){
        acountbutton.click();
        autorizacia.shouldBe(Condition.visible);
        return this;
    }
    @Step("არასწორი ტელეფონის გადაცემა:{incorectphone}")
    public RegistraciaSteps WrongPhone(String phone){
        phoneInput.setValue(phone);
        regInput.click();
        sentincorectphone.shouldBe(Condition.visible);
        return this;
    }
    @Step("არასწორი მეილის გადაცემა:{incorectemail}")
    public RegistraciaSteps WrongEmail(String email){
        emailInput.setValue(email);
        regInput.click();
        sentincoreqtemail.shouldBe(Condition.visible);
        return this;
    }
    @Step("არასწორი განმეორებითი პაროლის გადაცემა:{incorectconfirmpassword}")
    public RegistraciaSteps WrongConfPassword(String password){
        confirmPassword.setValue(password);
        regInput.click();
        sentincorectconfirmpassword.shouldBe(Condition.visible);
        return this;
    }
}







