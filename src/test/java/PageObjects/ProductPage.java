package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class ProductPage extends PageObject {
    String HELPProductXpath = "//img[@src=\"assets/Help.png\"]"; ///html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/quote/div/div[2]/div/div/div[2]/p/img
    String PlanTypeDropdown = "//select[@formcontrolname=\"plan\" ]";
    String OKBtn = "//button[@class=\"btn btn-success\"]";
    String GetRatesXpath = "//span[@class=\"title\"]";
    String PlanOptionXpath = "//select[@formcontrolname=\"planOption\"]";
    String ViewXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/quote-create/div/div[1]/div/div[2]/span/button";
    String HELPratesXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/quote-create/div/div[1]/div/div[1]/div[1]";

    String InitiateSaleXpath = "//i[@class=\"fa fa-edit\"]";

    String ContinueOnFAISDiscls = "//*[@id=\"mat-dialog-18\"]/app-confirmation-dialog/div/div[3]/div/div[2]/button";

    String CloseOnFAISDiscls = "//*[@id=\"mat-dialog-9\"]/app-confirmation-dialog/div/div[3]/div/div[1]/button";
    String mainLDOBXapth = "//input[@type='text']";
    String DatepickerXpath = "/html/body/bs-datepicker-container/div/div";
    //String FaisDisclosureSmsBtnXpath = "//*[@id=\"mat-dialog-18\"]/app-confirmation-dialog/div/div[3]/div/div[2]/button";


    public void SelectHELP() throws InterruptedException {
        Thread.sleep(5000);
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HELPProductXpath))).click();
        $(By.xpath(HELPProductXpath)).click();

    }

    public void selectPlanType(String HELPplanType) throws InterruptedException {
        Thread.sleep(5000);
        Select plan = new Select(getDriver().findElement(By.xpath(PlanTypeDropdown)));
        plan.selectByValue(HELPplanType);
    }

    public void clickOkBtn() {
        $(By.xpath(OKBtn)).click();
    }

    public void GetRates() {
        $(By.xpath(GetRatesXpath)).click();
    }

    @Step("Select Plan Option")
    public void SelectPlanOption() throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropdown = $(By.xpath(PlanOptionXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue("Individual");
    }

    @Step("Enter Date of Birth")
    public void EnterMainLDOB() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(mainLDOBXapth)).click();

        $(By.xpath(mainLDOBXapth)).sendKeys("1987-05-07");

        $(By.xpath(mainLDOBXapth)).click();


    }

    @Step("click on whilespace")
    public void vhilespce() {
        $(By.xpath(HELPratesXpath)).click();
    }


    @Step("Click FAIS continue button")
    public void FAISContinueButton() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(ContinueOnFAISDiscls)).click();

    }


    public void InitiateSale() {
        $(By.xpath(InitiateSaleXpath)).click();
    }


    public void clickContinueOnFaisDiscl() {
        $(By.xpath(ContinueOnFAISDiscls)).click();
    }

    public void clickCloseOnFaisDiscl() {
        $(By.xpath(CloseOnFAISDiscls)).click();
    }


    public void mainLifeDOB() {
    }


    @Step("Click view")
    public void ClickView() throws InterruptedException {
        $(By.xpath(ViewXpath)).click();
        Thread.sleep(2000);
    }
}