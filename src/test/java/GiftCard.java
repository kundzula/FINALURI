import StepObject.GiftSteps;
import Utils.ChromeStarter;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static DataObject.GiftData.firstPrice;
import static DataObject.GiftData.lastPrise;

public class GiftCard extends ChromeStarter {
    GiftSteps giftSteps=new GiftSteps();
    @Test
    @Description("სასაჩუქრე ბარათის გაფილტვრა ფასების მიხედვით")
    public void Giftcardcheck (){
        giftSteps.GiftCardCheck()
                .FirstPricecheck("firstPrice")
                .LastPricecheck("lastPrise");
    }

    @Test
    @Description("ჩამოვწეროთ სასაჩუქრე ბარათები არჩეული ფასის მიხედვით")
    public void PriceCheck(){
        giftSteps.Befor(firstPrice,lastPrise);
    giftSteps.Findaooprice();
}


}