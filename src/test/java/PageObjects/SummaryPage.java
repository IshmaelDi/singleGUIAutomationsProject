package PageObjects;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SummaryPage extends PageObject{


    String ConfirmdebitDate = "//body/shamba-root/shamba-layout/div[@class='app-container']/div[@class='module-container']/sale[@class='ng-star-inserted']/div[@class='wrapper-container']/div[@class='row body-container']/div[@class='col']/app-sale-capture[@class='ng-star-inserted']/div[@class='content']/div[@class='row row-container']/div[@class='col-md-12 col-container']/div[@class='play-container']/div[@class='capture-container pull-right']/sale-capture-control[@class='ng-star-inserted']/div[@class='ng-star-inserted']/div[@class='card']/div[@class='card-body']/div[@id='pills-tabContent']/accept-sale[@class='ng-star-inserted']/div/div[@class='row content']/div[@class='col-md-12']/div[@class='control-title-left']/ul[@class='text-list']/li/input[1]";
    String explananationOfWaitingPeriod = "//li[@class='ng-star-inserted']//li[1]//input[1]";

    String permissionTodebit = "//li[@class='ng-star-inserted']//li[2]//input[1]";

    String listOFExclusions = "//li[3]//input[1]";

    String detailsCorrect = "//li[4]//input[1]";

    String rewardsExplanantion = "//li[5]//input[1]";




    String ConcludSale = "//button[@type='button']";

    String SummaryPageXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[9]/div[2]";

    String ConcludeSale2 ="//button[contains(text(),'Conclude Sale')]";
    String ConfirmScript = "//input[@type='checkbox']";
    String Authenticate = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-finalise/div/div/div/sale-debicheck/div/div[3]/div/div[2]/button";
            //"/button[@type='button']";
            //"/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-finalise/div/div/div/sale-debicheck/div/div[3]/div/div[2]/button";
    ///html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-finalise/div/div/div/sale-debicheck/div/div[3]/div/div[2]/button

    //String MemberDetail = "";
//    String ProductDescription = "";
//    String PolicyNo ="";
//    String Premium = "";
//    String SumAssured = "";
//    String DebitDay = "";
//    String DOC = "";
//    String SummaryPage2Xpath ="/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/app-policy-summary/div/div[1]/div/div/div[1]";



    @Step("Click on the summary page ")
    public void Summary() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(SummaryPageXpath)).click();
    }


    @Step("confirm that that client account will be debit on the specified date")
    public void confirmdebitDate(){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        WebElement CD = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmdebitDate)));
        CD.click();

    }

    @Step("confirm that consultant has explained all waiting periods and exclusions as per script")
    public void ExclusionsExplanations(){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        WebElement EE = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(explananationOfWaitingPeriod)));
        EE.click();
    }

    @Step("confirm that consultant has obtained permission to debit account of total premium for this policy")
    public void permissionObtained(){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        WebElement PO = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(permissionTodebit)));
        PO.click();

    }

    @Step("confirm that consultant has explained full list of exclusion for selected policy")
    public void listOfExclusions(){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        WebElement LE = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(listOFExclusions)));
        LE.click();
    }

    @Step("confirm that all details are correct")
    public void CorrectDetails(){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        WebElement CR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(detailsCorrect)));
        CR.click();
    }

    @Step("Confirm that rewards have been explained to client")
    public void ExplanationOfRewards(){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        WebElement ER = wait.until(ExpectedConditions.elementToBeClickable (By.xpath(rewardsExplanantion)));
        ER.click();





    }
    @Step("conclude the sale")
    public void ClickConcludeSale(){
       $(By.xpath(ConcludSale)).click();

    }
    @Step("Conclude sale 2")
    public void ConcludeSale2(){
        $(By.xpath(ConcludeSale2)).click();
    }

    @Step("Confirm Script")
    public  void ConfirmScript(){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        WebElement CS = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmScript)));
        CS.click();
    }


    @Step("Authenticate")
    public void Authenticate()  {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Authenticate))).click();

    }

//    @Step("SummaryPage2")
//    public void  SummaryPage2() throws InterruptedException {
//        Thread.sleep(5000);
//        $(By.xpath(SummaryPage2Xpath)).click();
//    }

    //  @Step("view total premium and cover amount")
    //    public void viewPremiumAndCoverAmount() {
    //
    //
    //        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
    //        boolean isPremiumVisibile =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PremiumCoverAmountXpath))).isDisplayed();
    //
    //
    //        if (isPremiumVisibile) {
    //            System.out.println("Premiums are visibile to client based on the information captured");
    //        } else {
    //
    //            Assert.fail("Premium is not visible to the user, check for any errors ");
    //
    //        }

}
