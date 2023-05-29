package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistraciaObject {
    public SelenideElement
    acountbutton=$(byId("account")),
    myacount=$(byId("my_account")),
    noacount=$(byClassName("not_account")),
    regbutton=$(byId("register")),
    nameInput=$(byId("full_name")),
    phoneInput=$(byId("phone")),
    emailInput=$(byId("email"),1),
    passwordInput=$(byId("password"),1),
    confirmPassword=$(byId("password_confirmation")),
    regInput=$(byValue("რეგისტრაცია"),0),
    autorizacia=$(byText("ავტორიზაცია")),
    writeemail=$(byId("email"),0),
    writepassword=$(byId("password"),0),
    login=$(byValue("შესვლა")),
            eror=$(byText("ასეთი email უკვე არსებობს.")),
    gotoaurorizacia=$(byClassName("login")),

     checkacount=$(byText("მაია ირემაძე")),
    logout=$(byClassName("logout")),
    sentincorectphone=$(byText("email აუცილებელია.,phone უნდა შედგებოდეს 9 ციფრისგან.,password აუცილებელია.")),
    sentincoreqtemail=$(byText("email უნდა იყოს სწორი ელ.ფოსტა.,phone უნდა შედგებოდეს 9 ციფრისგან.,password აუცილებელია.")),
    sentincorectconfirmpassword=$(byText("email უნდა იყოს სწორი ელ.ფოსტა.,phone უნდა შედგებოდეს 9 ციფრისგან.,password არ ემთხვევა დადასტურებას.")),
    assertrezalt=$(byText("email უნდა იყოს სწორი ელ.ფოსტა.,phone უნდა შედგებოდეს 9 ციფრისგან.,password არ ემთხვევა დადასტურებას."));




}
