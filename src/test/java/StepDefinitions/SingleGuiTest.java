package StepDefinitions;

import PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


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
    FicaPage ficaPage;

    @Steps
    SummaryPage SummaryPage;

    @Steps
    ProductPage productPage;

    @Given("a consultant is logged in to single GUI")
    public void a_consultant_is_logged_in_to_single_gui() throws InterruptedException {
        HomePage.OpenWebsite();

        HomePage.loginIn("kmolale@clientele.co.za", "clientele01");

        HomePage.captureSale();
        HomePage.clickLeadBasket();
        leadPage.ActionSale();

        productPage.SelectHELP();
        productPage.selectPlanType("YG");
        productPage.clickOkBtn();
        productPage.GetRates();
        Thread.sleep(1500000);
    }

    @When("a consultant starts an individual cover.")
    public void a_consultant_starts_an_individual_cover(String PlanOption, String mainLife) {
        productPage.SelectPlanOption(PlanOption);
        productPage.mainLifeDOB();
        productPage.ClickView();
        productPage.InitiateSale();


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
    public void a_consultant_enters_required_payer_details(String Title, String  Name, String Surname,String IDNumber, String Relationship, String DebitDay, String FirstDebitDay, String BankName, String  BranchCode, String AccountType ,String AccountNumber,String ClientNumConfirmation) {
        PayerPage.PayerTitle(Title);
        PayerPage.EnterPayerName(Name);
        PayerPage.EnterPayerSurname(Surname);
        PayerPage.EnterIDNumber(IDNumber);
        PayerPage.selectRelationship(Relationship);
        PayerPage.Debitday(DebitDay);
        PayerPage.Firstdebitday(FirstDebitDay);
        PayerPage.SelectBankName(BankName);
        PayerPage.BankBranchCode(BranchCode);
        PayerPage.EnterAccType(AccountType);
        PayerPage.EnterAccountNumber(AccountNumber);
        PayerPage.ClientNumConfirmation();
        PayerPage.transactionMessagesConfirmation();
    }

    @When("a consultant enters required beneficiary details {string}, {string}, {string},{string} and Save Beneficiary Information.")
    public void a_consultant_enters_required_beneficiary_details_and_save_beneficiary_information(String Title, String Name, String Surname,String IDNumber, String Relationship, String SaveBeneInfo) {
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
    public void a_consultant_confirms_captured_information_on_summary_page() {
        SummaryPage.confirmdebitDate();
        SummaryPage.ExclusionsExplanations();
        SummaryPage.permissionObtained();
        SummaryPage.listOfExclusions();
        SummaryPage.CorrectDetails();
        SummaryPage.ExplanationOfRewards();
        SummaryPage.ClickConcludeSale();

    }

    @Then("a correct policy number should be generated for te client.")
    public void a_correct_policy_number_should_be_generated_for_te_client() {

    }
}