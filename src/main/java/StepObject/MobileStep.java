package StepObject;

import PageObject.MobilePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MobileStep extends MobilePage {
    @Step("მობილურ ტელეფონებზე გადასვლა")
    public MobileStep MobilePage(){
        mobilepage.click();
        return this;
    }
    @Step("ჩეკბოქსების შემოწმება არის თუ არა მონიშნული")
    public MobileStep Checkbox(){
       int CheckBoxcount=checkinp.size();
        System.out.println(CheckBoxcount);
      for (int i=1;i<CheckBoxcount;i++){
          $(by("type","checkbox"),i).shouldNotBe(Condition.checked);
       }
        return this;
     }
     @Step("ჩეკბოქსის გაფილტვრა მწარმოევლის მიხედვით")
    public MobileStep CheckboxCheck(){
         check.click();
         return this;
     }
     @Step("პროდუქსიის შედარება დასახელებით")
    public MobileStep CheckByName(){
       int ProdactCount=prodactcount.size();
         System.out.println(ProdactCount);
         String prodactname=sortbyname.getText();
         String firstname=prodactname;
         System.out.println(firstname);
         for (int i=1; i<ProdactCount; i++){
             String secondname=$(byClassName("link"),i).$(withText("Apple")).getText();
             String Secondname=secondname;
             System.out.println(Secondname);
         }
         return this;
     }
}
