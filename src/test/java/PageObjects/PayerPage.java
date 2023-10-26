package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PayerPage extends PageObject {

    String Payertitle = "//select[@id=\"Title\"]";

    String Names = "//input[@id=\"FirstNames\"]";
    String Surname = "//input[@id=\"Surname\"]";
    String IDNumberXpath = "//*[@id=\"IdentityNumber\"]";
    String EnterPayerIDXpath = "//*[@id=\"mainInput\"]";
    String ConfirmPayerIdXpath = "//*[@id=\"confirmationInput\"]";
    String OKbtnXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String MobileNum = "//input[@id=\"MobileTelephoneNumber\"]";
    String relationship = "//*[@id=\"RelationToMember\"]";
    String DebitDayXpath = "//select[@id=\"DebitDay\"]";
    String FirstDebitDateXpath = "//*[@id=\"FirstDebitDate\"]";
    String IsEmployeeXpath = "//select[@id=\"IsEmployee\"]";

    String BankNameXpath = "//*[@id=\"BankName\"]";

    String Branchcode = "//*[@id=\"BankBranchCode\"]";
    String AccountTypeXpath = "//select[@id=\"BankAccountType\"]";
    String AccountNumberXpath = "//input[@id=\"BankAccountNumber\"]";
    String AcountNmbXpath = "//*[@id=\"mainInput\"]";
    String ConfirmAccountNmbXpath ="//*[@id=\"confirmationInput\"]";
    String OkAccBtnXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String CheckBoxBankNum = "//li[@class='ng-star-inserted']//li[1]//input[1]";

    String checkBoxtranscation = "//li[2]//input[1]";
            //"//*[@id=\"pills-tabContent\"]/payer/div/div[2]/div/div/ul/li/ul/li[2]/input";

    String PayerTabXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[2]/div[2]";
//
    String SavePayerXpath = "//span[normalize-space()='Save Payer']";

    String PayerEmailXpath = "//*[@id=\"EmailAddress\"]";


    @Step("Click on  Payer tab")
    public void PayerTab() {
        $(By.xpath(PayerTabXpath)).click();
    }

    @Step("Select payer title ")
    public void PayerTitle(String BeneficiaryTitle) {
        WebElement Zi = $(By.xpath(Payertitle));
        selectFromDropdown(Zi, BeneficiaryTitle);
    }

    @Step("Enter payer name")
    public void EnterPayerName(String BeneficiaryName) {
        $(By.xpath(Names)).sendKeys(BeneficiaryName);
    }

    @Step("Enter payer surname")
    public void EnterPayerSurname(String PayerSurname) {
        $(By.xpath(Surname)).sendKeys(PayerSurname);
    }

    @Step("Enter payer mobile number ")
    public void mobileNum(String MobileNumber) {
        $(By.xpath(MobileNum)).sendKeys(MobileNumber);

    }

    @Step("Enter ID Number")
    public void IDNumber() {
        $(By.xpath(IDNumberXpath)).click();
    }

    @Step("Enter ID number ")
    public void EnterIDNumber(String PayerIdNumer) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(EnterPayerIDXpath)));

        ID.click();

        ID.sendKeys(PayerIdNumer);

    }


    @Step("Enter ID number ")
    public void ConfirmPayerID(String PayerIdNumer) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmPayerIdXpath)));

        ID.click();

        ID.sendKeys(PayerIdNumer);

    }
    @Step("Click Ok Button ")
    public void ClickOkButton() {
        $(By.xpath(OKbtnXpath)).click();
    }



    @Step("select payer relationship")
    public void SelectRelationship(String Relationship) {

        WebElement SR = $(By.xpath(relationship));
        selectFromDropdown(SR, Relationship);


    }

    @Step("select debit day")
    public void DebitDay(String DebitDay) {

        WebElement DD = $(By.xpath(DebitDayXpath));
        selectFromDropdown(DD, DebitDay);


    }

    @Step("select day of first debit")
    public void FirstDebitday(String firstDayOfDebit) {
        Select product = new Select(getDriver().findElement(By.xpath(FirstDebitDateXpath)));
        product.selectByValue(firstDayOfDebit);
    }

    @Step("Select bank name")
    public void SelectBankName(String BankName) {
        Select product = new Select(getDriver().findElement(By.xpath(BankNameXpath)));
        product.selectByValue(BankName);
    }

    @Step("select bank branch code")
    public void BankBranchCode(String BranchCode) {
        Select product = new Select(getDriver().findElement(By.xpath(Branchcode)));
        product.selectByValue(BranchCode);
    }

    @Step("Select account type")
    public void EnterAccType(String AccountType) {
        Select product = new Select(getDriver().findElement(By.xpath(AccountTypeXpath)));
        product.selectByValue(AccountType);

    }

    @Step("Enter Account number")
    public void ClickAccountNumber() {
        $(By.xpath(AccountNumberXpath)).click();
    }
            @Step("Enter Account Number ")
            public void EnterAccountNumber(String AccountNmber) {
                WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

                WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AcountNmbXpath)));

                ID.click();

                ID.sendKeys(AccountNmber);

            }
            @Step("Click Ok Acc btn")
            public void OkAccBtn(){
             $(By.xpath(OkAccBtnXpath)).click();
            }


            @Step("Confirm Account Number ")
        public void ConfirmPayerAccountNmb(String AccountNumber) {
                WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

                WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmAccountNmbXpath)));

                ID.click();

                ID.sendKeys(AccountNumber);

            }



    @Step("Is Employee")
    public void IsEmployee(String IsEmployee) {
        Select product = new Select(getDriver().findElement(By.xpath(IsEmployeeXpath)));
        product.selectByValue(IsEmployee);
    }

    @Step("Enter Email")
    public void PayerEmail(String PayerEmail) {
        $(By.xpath(PayerEmailXpath)).sendKeys(PayerEmail);
    }

@Step("Confirm")
        public void Confirm() {
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    WebElement checkbox1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckBoxBankNum)));
    checkbox1.click();

}
    @Step("Confirm")
    public void Checkbox2() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkBoxtranscation)));
        checkbox2.click();

    }

//    @Step("Confirm")
//   public void Confirm() {
//        WebElement checkbox1 =   $(By.xpath(CheckBoxBankNum));
//        if (checkbox1.isSelected()) {
//            checkbox1.click();
//
//        }
//    }
//
//
//
//      @Step("Transaction")
//        public void Checkbox2(){
//          WebElement checkbox2 =  $(By.xpath(checkBoxtranscation));
//          if (checkbox2.isSelected()){
//              checkbox2.click();
//          }
//    }

    @Step("Click Save payer")
    public void  SavePayer(){
        $(By.xpath(SavePayerXpath)).click();
    }



//   / @Step("Confirm")
//    public void ActionSale() {
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        WebElement Confirm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckBoxBankNum)));
//        WebElement Checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkBoxtranscation)));
//
//        Confirm.click();
//
//        Checkbox2.click();
//    }
}