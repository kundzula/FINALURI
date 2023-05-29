package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GiftPage {
    public SelenideElement
            getInGiftCards=$(by("data-id","142")),
            durashin=$(byAttribute("type","number"),0),
            sort=$(byId("sort")).$(byValue("asc")),
            firstPriceInput=$(byAttribute("type","number"),0),
            lastPriceInput=$(byAttribute("type","number"),1),
            FindPrice=$(byClassName("price"),0),
            Dureshin=$(byAttribute("type","number"),1);


    public ElementsCollection
            GiftcardcountSize=$$(byClassName("img_link"));


}
