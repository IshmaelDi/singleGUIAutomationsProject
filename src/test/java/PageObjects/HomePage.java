package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions.*;


import java.time.Duration;

public class HomePage extends PageObject {


    String Url = "https://shambawebtest.clientele.co.za/shambaweb/home";

    String LoginBtn = "//*[@id=\"navbarSupportedContent\"]/div/div/button/span";
    String UserNameXpath = "//*[@id=\"i0116\"]";

    String NextBtnXpath = "//*[@id=\"idSIButton9\"]";

    String PasswordXpath = "//*[@id=\"i0118\"]";



    String SignInXpath = "//*[@id=\"idSIButton9\"]";

    String ClienteleLogoXpath = "//*[@id=\"navbarDropdown\"]/img";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/nav/div[1]/a/div/i";

    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
     }
    @Step("Login in using AD account")
    public void loginIn(String Username, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginBtn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).sendKeys(Username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NextBtnXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignInXpath))).click();

    }

    @Step("Navigate to sales page")
    public void captureSale()throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(ClienteleLogoXpath)).click();
        $(By.xpath(CaptureSaleXpath)).click();
    }
    @Step("Navigate to lead page")
    public void clickLeadBasket() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(LeadBasketXpath)).click();
    }









}
