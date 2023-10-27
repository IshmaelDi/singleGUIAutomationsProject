package PageObjects.YF.StepDef;

import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
public class PremiumHealthYe {
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
    public void a_consultant_is_logged_in_to_single_gui_captures_clicks_next_button_captures_and_clicks_sign_in_button(String string, String string2) throws InterruptedException {
        HomePage.OpenWebsite();
        HomePage.loginIn("kmolale@clientele.co.za", "Keba@2023");
        HomePage.captureSale();
        HomePage.clickLeadBasket();
        leadPage.ActionSale();

        productPage.SelectHELP();
        productPage.selectPlanType("YG");
        productPage.clickOkBtn();
        productPage.GetRates();

    }

    @Given("a consultant starts an individual cover.")
    public void a_consultant_starts_an_individual_cover()  throws InterruptedException {
        productPage.SelectPlanOption();
        productPage.EnterMainLDOB();
        productPage.ClickView();
        productPage.InitiateSale();
        productPage.FAISContinueButton("Continue");


    }

    @Given("a consultant enters all the necessary required member details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void a_consultant_enters_all_the_necessary_required_member_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16) throws InterruptedException  {
        memberPage.SelectTitle("Mr");
        memberPage.EnterName("Kgotso");
        memberPage.enterSurname("Simo");
        memberPage.SelectCitizenship("Yes");
        memberPage.enterIdNumber();
        memberPage.IDNumber("9310258158421");// Always change ID by using ID generator
        memberPage.ConfirmID("9310258158421");
        memberPage.ClickOnButton();
        memberPage.EnterCellNumber("0620134321");
        memberPage.EnterEmailAddress("kgotsos@gmail.com");


        memberPage.selectMonthlyIncome("Up to 3,000");
        memberPage.selectOccupation("Clerk");
        memberPage.selectEducation("Matric");

        memberPage.PostalAddress("78 Hill Street");
        memberPage.EnterSuburb("Claremont");
        memberPage.EnterTown("Johannesburg");
        memberPage.EnterPostalCode("2092");
        memberPage.CopyToPhyscButton();
        memberPage.ValidateAddress();
        memberPage.SaveMainMember();





    }


    @Given("a consultant enters required payer details  {string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string},{string},{string},{string},{string},{string},{string}")
    public void a_consultant_enters_required_payer_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16)throws InterruptedException {
        PayerPage.PayerTab();
        PayerPage.PayerTitle("Mr");
        PayerPage.EnterPayerName("Lebo");
        PayerPage.EnterPayerSurname("Simo");
        PayerPage.IDNumber();
        PayerPage.EnterIDNumber("9310257112320");
        PayerPage.ConfirmPayerID("9310257112320");
        PayerPage.ClickOkButton();
        PayerPage.SelectRelationship("Cousin");
        PayerPage.DebitDay("25");
        PayerPage.FirstDebitday("25 Nov 2023");
        PayerPage.SelectBankName("CAPITEC BANK LTD");
        PayerPage.BankBranchCode("470010");
        PayerPage.EnterAccType("Savings Account");
        PayerPage.ClickAccountNumber();
        PayerPage.EnterAccountNumber("1234");
        PayerPage.ConfirmPayerAccountNmb("1234");
        PayerPage.OkAccBtn();
        PayerPage.mobileNum("0620134321");
        PayerPage.PayerEmail("lebos@gmail.com");
        PayerPage.IsEmployee("No");
//        PayerPage.ActionSale();
        PayerPage.Confirm();
        PayerPage.Checkbox2();
        PayerPage.SavePayer();
    }


//    @When("a consultant enters  required spouse details {string},{string},{string},{string},{string} and save spouse information.")
//    public void a_consultant_enters_required_spouse_details_and_save_spouse_information(String Title, String Name, String Surname, String Gender, String IDNumber) {
//        spousePage.SpouseTitle(Title);
//        spousePage.SpouseName(Name);
//        spousePage.spouseSurname(Surname);
//        spousePage.SelectSpouseGender(Gender);
//        spousePage.SpouseIDNumber(IDNumber);
//
//    }

//    @When("a consultant enters child required child details  and saves Child information.")
//    public void a_consultant_enters_child_required_child_details_and_saves_child_information(String ChildName, String ChildSurname, String childGen, String ChildIDNumber, String ChildIsStudent  ) {
//        childPage.EnterChildName(ChildName);
//        childPage.childSurname(ChildSurname);
//        childPage.childGen(childGen);
//        childPage.ChildIDNumber(ChildIDNumber);
//        childPage.ChildIsStudent(ChildIsStudent);
//    }

    @Given("a consultant enters required beneficiary details {string}, {string}, {string},{string},{string},{string}, {string} and Save Beneficiary Information.")
    public void a_consultant_enters_required_beneficiary_details_and_save_beneficiary_information(String string, String string2, String string3, String string4, String string5, String string6, String string7)throws InterruptedException {
        beneficiaryPage.BeneficiaryTab();
        beneficiaryPage.AddBeneficiary();
        beneficiaryPage.SelectBeneficiaryTitle("Mr");
        beneficiaryPage.EnterBeneficiaryName("Kgomo");
        beneficiaryPage.EnterBeneficiarySurname("Simo");
        beneficiaryPage.EnterBeneficiaryIDNumber("8510245965454");
        beneficiaryPage.EnterDateOfBirth();
        beneficiaryPage.SelectBeneficiaryRelationship("Sister");
//        beneficiaryPage.EnterAllocation();
        beneficiaryPage.SelectPercentageAllocation();
        beneficiaryPage.SaveButton();
        beneficiaryPage.Ben();
    }

    @Given("a consultant enters FICA declarations {string}, {string} and save.")
    public void a_consultant_enters_fica_declarations_and_save(String string, String string2) {


        ficaPage.FicaTab();
        ficaPage.acceptFICAdecl("No");
        ficaPage.acceptFicaDeclaration2("No");
        ficaPage.SaveFicaResponse();
    }

    @Given("a consultant selects to convert product {string} and save")
    public void a_consultant_selects_to_convert_product_and_save(String string) throws InterruptedException {

        premiumPage.PremiumTab();
//       premiumPage.selectPlanType("YG");
        premiumPage.viewPremiumAndCoverAmount();
        premiumPage.SavePremInfomation();
    }

    @Given("a consultant selects desired rewards.")
    public void a_consultant_selects_desired_rewards() throws InterruptedException {
        rewardsPage.RewardsTab();
        rewardsPage.selectSilverRewards();
        rewardsPage.Save();
//        rewardsPage.selectSilverRewards();

    }

    @Given("a consultant confirms captured information on summary page.")
    public void a_consultant_confirms_captured_information_on_summary_page() throws InterruptedException {
        SummaryPage.Summary();
        SummaryPage.confirmdebitDate();
        SummaryPage.ExclusionsExplanations();
        SummaryPage.permissionObtained();
        SummaryPage.listOfExclusions();
        SummaryPage.CorrectDetails();
        SummaryPage.ExplanationOfRewards();
        SummaryPage.ClickConcludeSale();
        SummaryPage.ConcludeSale2();
        SummaryPage.ConfirmScript();
        SummaryPage.Authenticate();
        // SummaryPage.SummaryPage2();

    }

    @Then("a correct policy number should be generated for te client.")
    public void aCorrectPolicyNumberShouldBeGeneratedForTeClient() {

    }

}
