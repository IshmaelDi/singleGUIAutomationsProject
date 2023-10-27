package PageObjects.YF.pageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BeneficiaryPage extends PageObject {

    // Elements for Beneficiary Details

    String AddBeneficiaryXpath = "//*[@id=\"pills-tabContent\"]/beneficiary/div/div[1]/div/div[1]/div/div[2]/button";
            //"//*[@id=\"pills-tabContent\"]/beneficiary/div/div/div/div/div/div[2]/button";
    String BeneficiaryTitleXpath = "//*[@id=\"Title\"]";
    String BeneficiaryNameXpath = "//*[@id=\"FirstNames\"]";
    String BeneficiarySurnameXpath = "//*[@id=\"Surname\"]";
    String BeneficiaryIDNumberXpath = "//*[@id=\"IdentityNumber\"]";
    String BeneficiaryDOBXpath = "//*[@id=\"DateOfBirth\"]";
    String BeneficiaryRelationshipXpath = "//*[@id=\"Relation\"]";
    String  EnterAllocation = "//*[@id=\"PercentageInsured\"]";
    String BeneficiaryAllocationXpath = "//*[@id=\"PercentageInsured\"]";
    String BeneficiarySaveButtonXpath = "//button[@type='button']";
            //"//button[@type='button']";
    String BenXpath = "//*[@id=\"pills-tabContent\"]/beneficiary/div/div[2]/div/div/div/button";
    String BeneficiaryTabXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/div[2]";




    @Step("Click on the Beneficiary Tab")
    public void BeneficiaryTab(){
        $(By.xpath(BeneficiaryTabXpath)).click();

    }
    @Step("Click Add Beneficiary")
    public void AddBeneficiary() {
        $(By.xpath(AddBeneficiaryXpath)).click();
    }

    @Step("Select beneficiary Title")
    public void SelectBeneficiaryTitle(String Title) {
        WebElement beneficiaryTitle = $(By.xpath(BeneficiaryTitleXpath));
        selectFromDropdown(beneficiaryTitle, Title);
    }

    @Step(" Enter the name of the beneficiary")
    public void EnterBeneficiaryName(String name) {
        $(By.xpath(BeneficiaryNameXpath)).sendKeys(name);
    }

    @Step("Enter the surname of the beneficiary")
    public void EnterBeneficiarySurname(String BeneficiarySurname) {
        $(By.xpath(BeneficiarySurnameXpath)).sendKeys(BeneficiarySurname);
    }

    @Step("Enter the beneficiary ID number")
    public void EnterBeneficiaryIDNumber(String BeneficiaryIdNum) {
        $(By.xpath(BeneficiaryIDNumberXpath)).sendKeys(BeneficiaryIdNum);
    }


    @Step(" Enter beneficiary date of birth")
    public void EnterDateOfBirth() {

        $(By.xpath(BeneficiaryDOBXpath)).click();

        $(By.xpath(BeneficiaryDOBXpath)).sendKeys("1995-10-24" + Keys.ENTER);

    }

    @Step("Select beneficial relationship")
    public void SelectBeneficiaryRelationship(String RelationshipII) {

        WebElement beneficiaryRelation = $(By.xpath(BeneficiaryRelationshipXpath));
        selectFromDropdown(beneficiaryRelation, RelationshipII);

    }

//    @Step("Enter Allocation")
//    public void EnterAllocation(){
//        $(By.xpath(EnterAllocation)).click();
//    }
    @Step("Select percentage allocation")
    public void SelectPercentageAllocation() {
        $(By.xpath(BeneficiaryAllocationXpath)).click();

        $(By.xpath(BeneficiaryAllocationXpath)).sendKeys("100" + Keys.ENTER);

//        WebElement Al= $(By.xpath(BeneficiaryAllocationXpath));
//        selectFromDropdown(Al, Allocation);
    }

    @Step("Click Save Buuton")
    public void SaveButton() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(BeneficiarySaveButtonXpath)).click();
    }

    @Step("Save Beneficiaries")
    public void Ben(){
        $(By.xpath(BenXpath)).click();
    }

}
