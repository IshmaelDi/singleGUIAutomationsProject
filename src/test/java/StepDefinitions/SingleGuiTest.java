package StepDefinitions;

import PageObjects.*;
import groovy.lang.GString;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import java.time.Year;


public class SingleGuiTest {

    @Steps
    HomePage HomePage;
    @Steps
    LeadPage leadPage;

    @Steps
    PageObjects.memberPage memberPage;

    @Steps
    PageObjects.PayerPage PayerPage;

    @Steps
    BeneficiaryPage beneficiaryPage;

    @Steps
    SpousePage spousePage;

    @Steps
    ChildPage childPage;

    @Steps
    FicaPage ficaPage;

    @Steps
    SummaryPage SummaryPage;

    @Steps
    RewardsPage rewardsPage;

    @Steps
    ProductPage productPage;
    @Steps
    PremiumPage premiumPage;

    @Given("a consultant is logged in to single GUI, captures {string} clicks next button , captures {string} and clicks sign in button.")
    public void a_consultant_is_logged_in_to_single_gui_captures_clicks_next_button_captures_and_clicks_sign_in_button(String username, String password) throws InterruptedException {
        HomePage.OpenWebsite();
        HomePage.loginIn(username, password);
        HomePage.captureSale();
        HomePage.clickLeadBasket();
        leadPage.ActionSale();

        productPage.SelectHELP();
        productPage.selectPlanType("YG");
        productPage.clickOkBtn();
        productPage.GetRates();

    }

    @When("a consultant starts an individual cover.")
    public void a_consultant_starts_an_individual_cover() throws InterruptedException {
        productPage.SelectPlanOption();
        productPage.EnterMainLDOB();
        productPage.whilespce();
        productPage.ClickView();
        productPage.InitiateSale();
        productPage.FAISContinueButton();
        Thread.sleep(10000);

    }

    @When("a consultant enters all the necessary required member details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void a_consultant_enters_all_the_necessary_required_member_details(String Title, String Name, String Surname,String CellNumber, String Citizenship, String IdNumber, String MonthlyIncome, String Occupation, String Education, String PhysicalAddress, String EnterEmailAddress, String SelectMedicalConditions) {

        memberPage.SelectTitle(Title);
        memberPage.EnterName(Name);
        memberPage.enterSurname(Surname);
        memberPage.EnterCellNumber(CellNumber);
        memberPage.EnterEmailAddress(EnterEmailAddress);
        memberPage.SelectCitizenship(Citizenship);
        memberPage.enterIdNumber(IdNumber);
        memberPage.selectMonthlyIncome(MonthlyIncome);
        memberPage.selectOccupation(Occupation);
        memberPage.selectEducation(Education);
        memberPage.selectMedicalConditions(SelectMedicalConditions);
        memberPage.enterPhysicalAddress(PhysicalAddress);

    }

    @When("a consultant enters required payer details  {string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string}")
    public void a_consultant_enters_required_payer_details(String Title, String  Name, String Surname,String IDNumber, String Relationship, String DebitDay, String FirstDebitDay, String BankName, String  BranchCode, String AccountType ,String AccountNumber) {
        PayerPage.PayerTitle(Title);
        PayerPage.EnterPayerName(Name);
        PayerPage.EnterPayerSurname(Surname);
        PayerPage.EnterIDNumber(IDNumber);
        PayerPage.selectRelationship(Relationship);
        PayerPage.DebitDay(DebitDay);
        PayerPage.FirstDebitday(FirstDebitDay);
        PayerPage.SelectBankName(BankName);
        PayerPage.BankBranchCode(BranchCode);
        PayerPage.EnterAccType(AccountType);
        PayerPage.EnterAccountNumber(AccountNumber);
        PayerPage.ClientNumConfirmation();
        PayerPage.transactionMessagesConfirmation();
    }

    @When("a consultant enters  required spouse details {string},{string},{string},{string},{string} and save spouse information.")
    public void a_consultant_enters_required_spouse_details_and_save_spouse_information(String Title, String Name, String Surname, String Gender, String IDNumber) {
        spousePage.SpouseTitle(Title);
        spousePage.SpouseName(Name);
        spousePage.spouseSurname(Surname);
        spousePage.SelectSpouseGender(Gender);
        spousePage.SpouseIDNumber(IDNumber);

    }

    @When("a consultant enters child required child details {string}, {string},{string},{string},{string} and saves Child information.")
    public void a_consultant_enters_child_required_child_details_and_saves_child_information(String ChildName, String ChildSurname, String childGen, String ChildIDNumber, String ChildIsStudent  ) {
        childPage.EnterChildName(ChildName);
        childPage.childSurname(ChildSurname);
        childPage.childGen(childGen);
        childPage.ChildIDNumber(ChildIDNumber);
        childPage.ChildIsStudent(ChildIsStudent);
    }

    @When("a consultant enters required beneficiary details {string}, {string}, {string},{string} and Save Beneficiary Information.")
    public void a_consultant_enters_required_beneficiary_details_and_save_beneficiary_information(String Title, String Name, String Surname,String IDNumber, String Relationship) {
        beneficiaryPage.SelectBeneficiaryTitle(Title);
        beneficiaryPage.BeneficiaryName(Name);
        beneficiaryPage.BeneficiarySurname(Surname);
        beneficiaryPage.EnterIDNumber(IDNumber);
        beneficiaryPage.relationship(Relationship);
        beneficiaryPage.SaveBeneInfo();
    }

    @When("a consultant enters FICA declarations.")
    public void a_consultant_enters_fica_declarations() {
        ficaPage.SaveFicaResponse();
    }

    @When("a consultant confirms captured information on summary page.")
    public void a_consultant_confirms_captured_information_on_summary_page(String ConvertProduct) {
        premiumPage.SavePremInfomation();
        premiumPage.ConvertProduct(ConvertProduct);

    }

    @When("a consultant selects desired rewards.")
    public void a_consultant_selects_desired_rewards() {
        rewardsPage.ReadBlueRewardsInfo();
        rewardsPage.ReadSilverRewardsInfo();

    }

    @Then("a correct policy number should be generated for te client.")
    public void a_correct_policy_number_should_be_generated_for_te_client() {
        SummaryPage.confirmdebitDate();
        SummaryPage.ExclusionsExplanations();
        SummaryPage.permissionObtained();
        SummaryPage.listOfExclusions();
        SummaryPage.CorrectDetails();
        SummaryPage.ExplanationOfRewards();
        SummaryPage.ClickConcludeSale();

    }




}