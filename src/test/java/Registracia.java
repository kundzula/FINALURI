import StepObject.RegistraciaSteps;
import Utils.ChromeStarter;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistraciaData.*;
import static com.codeborne.selenide.Selenide.$;

public class Registracia extends ChromeStarter {
    RegistraciaSteps registraciaSteps = new RegistraciaSteps();

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("რეგისტრაცია")
    public void Registracia() {
        registraciaSteps.Acount()
                .Reg()
                .FullName(fullname)
                .Phone(phone)
                .Email(email)
                .Password(password)
                .ConfPassword(confirmpassword)
                .Registr()
                .Checkpage()
                .Autorizacia()
                .Checkacount();
        Assert.assertTrue(registraciaSteps.checkacount.isDisplayed());
        registraciaSteps.LogOut()
                .CheckLogout();
        Assert.assertTrue(registraciaSteps.autorizacia.isDisplayed());
    }
   @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("არასრული რეგისტრაცია")
    public void NegatRegistracia(){
        registraciaSteps.Acount()
                .Reg()
                .FullName(fullname)
                .WrongPhone(incorectphone)
                .WrongEmail(incorectemail)
                .Password(password)
                .WrongConfPassword(incorectconfirmpassword);
        Assert.assertTrue(registraciaSteps.assertrezalt.isDisplayed());
    }
}


