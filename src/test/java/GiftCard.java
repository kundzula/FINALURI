import StepObject.GiftSteps;
import Utils.ChromeStarter;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static DataObject.GiftData.firstPrice;
import static DataObject.GiftData.lastPrise;

public class GiftCard extends ChromeStarter {
    GiftSteps giftSteps=new GiftSteps();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("სასაჩუქრე ბარათის გაფილტვრა ფასების მიხედვით")
    public void Giftcardcheck (){
        giftSteps.GiftCardCheck()
                .FirstPricecheck(firstPrice)
                .LastPricecheck(lastPrise);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("ჩამოვწეროთ სასაჩუქრე ბარათები  ფასის ზრდადობიდ მიხედვით")
    public void PriceCheck(){
        giftSteps.Befor(firstPrice,lastPrise);
    giftSteps.Findaooprice();
}


}