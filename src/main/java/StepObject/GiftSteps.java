package StepObject;

import PageObject.GiftPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static DataObject.GiftData.firstPrice;
import static DataObject.GiftData.lastPrise;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class GiftSteps extends GiftPage {
    @Step("სასაჩუქრე ბარათების გვერძე გადასვლა")
    public GiftSteps GiftCardCheck() {
        getInGiftCards.click();
        return this;
    }

      @Step("საწყისი ფასის შეყვანა:{firstPrice}")
    public GiftSteps FirstPricecheck(String fprice) {
        firstPriceInput.setValue(fprice);
        durashin.shouldBe(Condition.visible,Duration.ofMillis(3000));
        return this;
    }
     @Step("საბოლოოს ფასის შეყვანა: {lastPrise}")
    public GiftSteps LastPricecheck(String lprice) {
        lastPriceInput.setValue(lprice).pressEnter();
        Dureshin.shouldBe(Condition.visible,Duration.ofMillis(3000));
               return this;
    }
    @Step("ფასის დალაგება ზრდადობით")
    public GiftSteps Sortprice(){
        sort.click();
        return this;
    }

     @Step("ციკლის დატრიალება ფასების მიხედვით")
    public GiftSteps Findaooprice() {
       int count=GiftcardcountSize.size();
        String  price= FindPrice.getText();
        float firstPriceFloat=Float.parseFloat(price);
        System.out.println(firstPriceFloat);

        for (int i = 1; i <count; i++){
            String secondPrice=$(byClassName("price"),i).getText();
            Float secondPriceFloat = Float.parseFloat(secondPrice);
           Assert.assertTrue(secondPriceFloat >= firstPriceFloat);
            System.out.println(secondPriceFloat);
            firstPriceFloat = secondPriceFloat;

        }
        return this;
    }
          @Step("მეორე ტესტზე გადასვლამდე შესასრულებელი ქმედება")
    public GiftSteps Befor (String fprice, String lprice) {
        GiftCardCheck();
        FirstPricecheck(fprice);
        LastPricecheck(lprice);
        Sortprice();
        return this;
    }
}
