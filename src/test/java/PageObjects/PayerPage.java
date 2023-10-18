package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PayerPage extends PageObject {

    String Payertitle = "//select[@id=\"Title\"]" ;
    String Names = "//input[@id=\"FirstNames\"]" ;
    String Surname = "//input[@id=\"Surname\"]" ;
    String IDNumberXpath = "//*[@id=\"IdentityNumber\"]";
    String MobileNum = "//input[@id=\"MobileTelephoneNumber\"]" ;
    String relationship = "//select[@id=\"RelationToMember\"]" ;
    String DebitDay = "//select[@id=\"DebitDay\"]" ;
    String FirstDebitDate = "//select[@id=\"FirstDebitDate\"]" ;
    String IsEmployee = "//select[@id=\"IsEmployee\"]" ;

    String BankName = "//select[@id=\"BankName\"]" ;

    String Branchcode = "id=\"BankBranchCode\"" ;
    String AccountType = "//select[@id=\"BankAccountType\"]" ;
    String AccountNumber = "//input[@id=\"BankAccountNumber\"]" ;

    String CheckBoxBankNum = "//*[@id=\"pills-tabContent\"]/payer/div/div[2]/div/div/ul/li/ul/li[1]/input";

    String checkBoxtranscation = "//*[@id=\"pills-tabContent\"]/payer/div/div[2]/div/div/ul/li/ul/li[2]/input";



    @Step("Select payer title ")
    public void PayerTitle(String PayerTitle){
        Select product = new Select(getDriver().findElement(By.xpath(Payertitle)));
        product.selectByValue(PayerTitle);
    }

    @Step("Enter payer name")
    public void EnterPayerName(String payerName){
        $(By.xpath(Names)).sendKeys(payerName);
    }
    @Step("Enter payer surname")
    public void EnterPayerSurname(String payerSurname){
        $(By.xpath(Surname)).sendKeys(payerSurname);
    }
    @Step("Enter payer mobile number ")
    public void mobileNum(String Number){
        $(By.xpath(MobileNum)).sendKeys(Number);

    }
    @Step("Enter ID Number")
    public void EnterIDNumber(String IDNumber){$(By.xpath(IDNumberXpath)).sendKeys(IDNumber);}

    @Step("select payer relationship")
    public void selectRelationship(String RelationshipWithPayer){
        Select product = new Select(getDriver().findElement(By.xpath(relationship)));
        product.selectByValue(RelationshipWithPayer);
    }
    @Step("select debit day")
    public void DebitDay(String dayOfDebit){

        Select product = new Select(getDriver().findElement(By.xpath(DebitDay)));
        product.selectByValue(dayOfDebit);
    }
    @Step("select day of first debit")
    public void FirstDebitday(String firstDayOfDebit){
        Select product = new Select(getDriver().findElement(By.xpath(DebitDay)));
        product.selectByValue(firstDayOfDebit);
    }
    @Step("Select bank name")
    public void SelectBankName(String selectBankName){
        Select product = new Select(getDriver().findElement(By.xpath(BankName)));
        product.selectByValue(selectBankName);
    }

    @Step("select bank branch code")
    public void BankBranchCode(String branchCode){
        Select product = new Select(getDriver().findElement(By.xpath(Branchcode)));
        product.selectByValue(branchCode);
    }
    @Step("Select account type")
    public void EnterAccType(String Accounttype){
        Select product = new Select(getDriver().findElement(By.xpath(AccountType)));
        product.selectByValue(Accounttype);

    }
    @Step("Enter Account number")
    public void EnterAccountNumber(String accountNumber){
        $(By.xpath(AccountNumber)).sendKeys(accountNumber);
    }

    @Step("confirm client number is the same as bank number")
    public void ClientNumConfirmation(){
        $(By.xpath(CheckBoxBankNum)).click();

    }
    @Step("confirm with client that the bank sends any transaction messages on this number")
    public void transactionMessagesConfirmation(){
        $(By.xpath(checkBoxtranscation)).click();
    }
}
