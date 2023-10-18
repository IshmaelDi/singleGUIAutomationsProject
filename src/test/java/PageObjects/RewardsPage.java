package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementState;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;




public class RewardsPage extends PageObject{
    String BlueRewardsXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[1]/td[1]/input";
    String SliverRewardsXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[2]/td[1]/input";


    @Step(" Read blue rewards information")
    public void ReadBlueRewardsInfo() {

        boolean blueRewardsInfo = $(By.xpath(BlueRewardsXpath)).isVisible();
        if (blueRewardsInfo) {
            System.out.println("Blue rewards information is visible: " + $(By.xpath(BlueRewardsXpath)).getText());

        } else {
            Assert.fail("Blue rewards information is not showing");
        }
    }

    /**
     *
     */
    @Step(" Read silver rewards information")
    public void ReadSilverRewardsInfo() {
        boolean silverRewardsInfo = $(By.xpath(SliverRewardsXpath)).isVisible();
        if (silverRewardsInfo) {

            System.out.println("Silver rewards information is showing " + $(By.xpath(SliverRewardsXpath)).getText());

        } else {
            Assert.fail("Silver rewards information is not showing ");

        }

    }

    @Step("select non insurance blue rewards")
    public void selectBlueReward() {
        $(By.xpath(BlueRewardsXpath)).click();

    }

    @Step("Select non insurance silver rewards")
    public void selectSilverRewards() {
        $(By.xpath(SliverRewardsXpath)).click();

    }
}