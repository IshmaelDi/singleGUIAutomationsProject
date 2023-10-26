package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementState;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class RewardsPage extends PageObject {
    String RewardsTabXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[8]/div[2]";
    String BlueRewards = "//td[normalize-space()='Blue Rewards']//input[@type='checkbox']";
    //#bootstrap-table > tbody > tr:nth-child(1) > td:nth-child(1) > input
    ////*[@id="bootstrap-table"]/tbody/tr[1]/td[1]/input

    String SliverRewardsXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[2]/td[1]/input";
    String SavePremium = "//*[@id=\"pills-tabContent\"]/shamba-rewards/div/div/div/div[2]/div/div/div/button";


    @Step("Click on rewards")
    public void RewardsTab() throws InterruptedException {
        Thread.sleep(300);
        $(By.xpath(RewardsTabXpath)).click();
    }
//    @Step(" Read blue rewards information")
//    public void ReadBlueRewardsInfo() {
//
//        boolean blueRewardsInfo = $(By.xpath(BlueRewardsXpath)).isVisible();
//        if (blueRewardsInfo) {
//            System.out.println("Blue rewards information is visible: " + $(By.xpath(BlueRewardsXpath)).getText());
//
//        } else {
//            Assert.fail("Blue rewards information is not showing");
//        }
//    }
//
//    /**
//     *
//     */
//    @Step(" Read silver rewards information")
//    public void ReadSilverRewardsInfo() {
//        boolean silverRewardsInfo = $(By.xpath(SliverRewardsXpath)).isVisible();
//        if (silverRewardsInfo) {
//
//            System.out.println("Silver rewards information is showing " + $(By.xpath(SliverRewardsXpath)).getText());
//
//        } else {
//            Assert.fail("Silver rewards information is not showing ");
//
//        }
//
//    }

//    @Step("select non insurance blue rewards")
//    public void selectBlueReward() throws InterruptedException {
//        Thread.sleep(5000);
//        List<WebElement> checkBoxes = getDriver().findElements(By.xpath(BlueRewardsXpath));
//        checkBoxes.get(1).click();
//
//    }
//    @Step("Confirm")
//    public void selectBlueReward()  {
//
//      WebElement checkbox1 = $(By.xpath(BlueRewards));
//          checkbox1.click();
//      }


//    @Step("select non insurance blue rewards")
//    public void selectBlueReward() {
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        WebElement BR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BlueRewards)));
//        BR.click();
//    }
//
//


    @Step("Select non insurance silver rewards")
    public void selectSilverRewards() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement SR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SliverRewardsXpath)));
                SR.click();

    }

// @Step("Transaction")
//        public void Checkbox2(){
//            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//            WebElement Cb2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkBoxtranscation)));
//            Cb2.click();

    @Step("Save premium")
    public void Save() {
        $(By.xpath(SavePremium)).click();
    }
}