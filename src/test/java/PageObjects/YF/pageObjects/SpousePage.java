package PageObjects.YF.pageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SpousePage extends PageObject {

    String SpouseTitleXpath  = "//*[@id=\"Title\"]";

    String NamesXpath  = "//*[@id=\"FirstNames\"]";

    String SurnameXpath  = "//*[@id=\"Surname\"]";

    String GenderXpath  = "//*[@id=\"Gender\"]";

    String IDNumberXpath = "//*[@id=\"IdentityNumber\"]";

    String DateOfBirthXpath  = "//*[@id=\"DateOfBirth\"]";


    @Step("Select the spouse title")
    public void SpouseTitle(String spouseTitle){
        $(By.xpath(SpouseTitleXpath )).sendKeys(spouseTitle);

    }
    @Step("Enter spouse name")
    public void SpouseName(String spouseName){
        $(By.xpath(NamesXpath)).sendKeys(spouseName);
    }
    @Step("enter spouse surname")
    public void spouseSurname(String sSurname){
        $(By.xpath(SurnameXpath )).sendKeys(sSurname);
    }



    @Step("select spouse gender")
    public void SelectSpouseGender(String gender){
        Select product = new Select(getDriver().findElement(By.xpath(GenderXpath )));
        product.selectByValue(gender);


    }
    @Step("Enter ID number")
    public void SpouseIDNumber(String IDNumber){
        $(By.xpath(IDNumberXpath)).sendKeys(IDNumber);
    }


}
