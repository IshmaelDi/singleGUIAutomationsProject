package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class memberPage extends PageObject {

    String TitleXpath = "//select[@id='Title']"  ;

    String NameXpath = "//input[@id=\"FirstNames\" ]";

    String SurnameXpath = "//input[@id=\"Surname\"]";

    String CellNumberXpath = "//input[@id=\"MobileTelephoneNumber\" ]";
    String EmailAddressXpath = "//*[@id=\"EmailAddress\"]";

    String SouthAfricanCitizenXpath  = "//select[@id=\"IsSouthAfricanCitizen\"]";

    String IDNumXpath = "//input[@id=\"IdentityNumber\"]";

    String DOBXpath = "//*[@id=\"DateOfBirth\"]";

    String MonthlyIncomeXpath = "//select[@id=\"MonthlyIncomeRange\"]";

    String OccupationXpath = "//select[@id=\"Occupation\"]";
    String EducationXpath = "//select[@id=\"EducationLevel\"]";
    String MedicalConditionsXpath = "";
    String PostalAddressXpath = "//input[@id=\"PhysicalAddressLine1\"]";
    String PostalCodeXpath = "//input[@id=\"PhysicalAddressCode\"]";
    String SaveMainMemberXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[2]/div/div[2]/button";

    String CopyToPhysicalXpath = "//*[@id=\"ngb-nav-1-panel\"]/div[1]/div/div/button/span[1]";
    String ValidateBtnXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[1]/div/form/div/div[2]/div[5]/div/shamba-address/div/div[2]/div[3]/div/button/span";





    @Step("Select main member Title")
    public void SelectTitle(String title){

        Select titlee = new Select(getDriver().findElement(By.xpath(TitleXpath)));
        titlee.selectByValue(title);

    }
    @Step("Enter main member Name ")
    public void EnterName(String name){
        $(By.xpath(NameXpath)).sendKeys(name);

    }
    @Step("Enter main member surname")
    public void enterSurname(String surname){
        $(By.xpath(SurnameXpath)).sendKeys(surname);

    }
    @Step("Enter main member cell number")
    public void EnterCellNumber(String CellNumber){
    $(By.xpath(CellNumberXpath)).sendKeys(CellNumber);

    }
    @Step("Enter Email Address")
    public void EnterEmailAddress(String EmailAddress){
    $(By.xpath(EmailAddressXpath)).sendKeys(EmailAddress);
    }

    @Step("Select main member citizenship ")
    public void SelectCitizenship( String CitizenshipYesNo){
    Select Citizen = new Select(getDriver().findElement(By.xpath(SouthAfricanCitizenXpath)));
    Citizen.selectByValue(CitizenshipYesNo);

    }
    @Step("Enter main member ID number ")
    public void enterIdNumber(String MainMemberIDNUM){
    $(By.xpath(IDNumXpath)).sendKeys(MainMemberIDNUM);
    }
    @Step("select Date of Birth for main member")
    public void MainMemberDOB(){
    }


    @Step(" select Monthly income for main member")
    public void selectMonthlyIncome(String MainMemberincome){

    Select income = new Select(getDriver().findElement(By.xpath(MonthlyIncomeXpath)));
    income.selectByValue(MainMemberincome);

    }
    @Step(" select occupation for main member")
    public void selectOccupation(String MainMemberOccupation){
     Select occupation = new Select(getDriver().findElement(By.xpath(OccupationXpath)));
     occupation.selectByValue(MainMemberOccupation);

    }
    @Step(" select Monthly income for main member")
    public void selectEducation(String MainMemberEducation){
    Select education = new Select(getDriver().findElement(By.xpath(EducationXpath)));
    education.selectByValue(MainMemberEducation);

    }
    @Step ("Enter medical conditions")
        public void selectMedicalConditions(String MedicalConditions){
            Select occupation = new Select(getDriver().findElement(By.xpath(MedicalConditionsXpath)));
            occupation.selectByValue(MedicalConditions);

    }

    @Step("Enter main physical address ")
    public void enterPhysicalAddress(String MainMemberPhysicalAddress){
    $(By.xpath(PostalAddressXpath)).sendKeys(MainMemberPhysicalAddress);
    }
    @Step("Enter postal code for main member")
    public void enterPostalCode(String Postalcode){
    $(By.xpath(PostalCodeXpath)).sendKeys(Postalcode);
    }

    @Step("copy to physical ")
    public void copyToPhysical(){
    $(By.xpath(CopyToPhysicalXpath)).click();
    }
    @Step("Validate information")
    public void clickValidate(){
    $(By.xpath(ValidateBtnXpath)).click();
    }
    @Step("Save main member details")
    public void clickSaveMainMember(){
    $(By.xpath(SaveMainMemberXpath)).click();
    }

}
