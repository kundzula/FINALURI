package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MobilePage {
    public SelenideElement
     mobilepage=$(by("data-id","126")),
            check=$(by("type","checkbox"),1),
     sort=$(byId("sort")).$(byValue("desc")),
     sortbyname=$(byClassName("link"),0).$(withText("Apple"),0);

    public ElementsCollection

             checkinp=$$(by("type","checkbox")),
             prodactcount=$$(byClassName("img_link"));



}
