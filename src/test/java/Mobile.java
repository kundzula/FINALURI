import StepObject.MobileStep;
import Utils.ChromeStarter;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class Mobile extends ChromeStarter {
    MobileStep mobileStep=new MobileStep();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("ჩეკბოქსის შემოწმება არის თუ არა მონიშნული")
    public void CheCkBox() {
        mobileStep.MobilePage()
                .Checkbox();
    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("პროდუქციის გაფილტვრა დასახელების მიხედვით")
    public void SortByName(){
        mobileStep.MobilePage()
                .CheckboxCheck()
                .CheckByName();
        Assert.assertTrue($(byClassName("link"),0).$(withText("Apple"),0).isDisplayed());
    }
}
