package PageObjects;

import io.cucumber.java.ast.Y;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FicaPage extends PageObject {
    String FicaTab = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[6]/div[2]";
    String Fica1Xpath = "//*[@id=\"IsProminentPublicOfficial\"]";
    String Fica2Xpath = "//select[@id='IsProminentInternationalPublicOfficial']";
    String SaveFicaBtnXpath = "//*[@id=\"pills-tabContent\"]/fica-declaration/div/div[2]/div/div/button";
            //"//button[@type='button']";



    @Step("Click on the Fica Tab")
    public  void FicaTab() {
        $(By.xpath(FicaTab)).click();

    }
    @Step("Accept FICA declaration ")
    public void acceptFICAdecl(String Yes) {
        WebElement FD1 = $(By.xpath(Fica1Xpath));
        selectFromDropdown(FD1, Yes);
    }
    //@Step("Select beneficiary Title")
    //    public void SelectBeneficiaryTitle(String Title) {
    //        WebElement beneficiaryTitle = $(By.xpath(BeneficiaryTitleXpath));
    //        selectFromDropdown(beneficiaryTitle, Title);

    @Step("Accept FICA declaration ")
    public void acceptFicaDeclaration2(String Yes) {
        WebElement FD2 = $(By.xpath(Fica2Xpath));
        selectFromDropdown(FD2, Yes);
    }
    @Step("Save FICA response ")
    public void SaveFicaResponse(){
        $(By.xpath(SaveFicaBtnXpath)).click();

    }

}
