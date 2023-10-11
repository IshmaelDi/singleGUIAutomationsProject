package PageObjects;

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
    public void SpouseName(String spousenam){
        $(By.xpath(NamesXpath)).sendKeys(spousenam);
    }
    @Step("enter spouse surname")
    public void spouseSurnme(String sSurname){
        $(By.xpath(SurnameXpath )).sendKeys(sSurname);
    }



    @Step("select spouse gender")
    public void SelectSpousegender(String gender){
        Select produuct = new Select(getDriver().findElement(By.xpath(GenderXpath )));
        produuct.selectByValue(gender);


    }
    @Step("Enter ID number")
    public void EnterIDNumber(String IDNumber){
        $(By.xpath(IDNumberXpath)).sendKeys(IDNumber);
    }


}
