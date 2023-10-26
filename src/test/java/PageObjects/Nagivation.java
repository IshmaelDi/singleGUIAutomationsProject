package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Nagivation extends PageObject {

    String PayerPage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[2]/a";

    String SpousePage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[3]/div[2]";
    String ChildPage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[4]/div[2]";

    String BeneficiaryPage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/a";

    String FicaPage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[6]/a";

    String PremiumPage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[7]/a";

    String RewardPage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[8]/a";

    String SummaryPage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[9]/a";





    @Step("Navigate to payer page")
    public void ClickPayer(){
        $(By.xpath(PayerPage)).click();
    }

    @Step("Navigate to  spouse page")
    public void clickSpouse(){
        $(By.xpath(SpousePage)).click();

    }
    @Step("Navigate to child page")
    public void clickChild(){
        $(By.xpath(ChildPage)).click();
    }
    @Step("Navigate to Beneficiary page")
    public void clickBeneficiary(){
        $(By.xpath(BeneficiaryPage)).click();

    }
    @Step("Navigate to FICA page ")
    public void clickFICA(){
        $(By.xpath(FicaPage)).click();

    }
    @Step("Navigate to premium page ")
    public void clickPremium()throws InterruptedException{
        Thread.sleep(5000);
        $(By.xpath(PremiumPage)).click();

    }
    @Step("Navigate to rewards page")
    public void clickRewards(){
        $(By.xpath(RewardPage)).click();
    }

    @Step("Navigate to summary page")
    public void clickSummary(){
        $(By.xpath(SummaryPage)).click();
    }

}
