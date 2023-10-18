package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PremiumPage extends PageObject {

    String ConvertProductXpath = "//*[@id=\"productConversion\"]";
    String SavePremiumInformation = "//*[@id=\"pills-tabContent\"]/premium/div/div/div/div[4]/div/div/div/button/span";



     @Step("Save premium information")
    public void SavePremInfomation(){
        $(By.xpath(SavePremiumInformation)).click();
     }

     @Step("Select the desired conversion of the product")
          public void  ConvertProduct(String ProductConversions){
         Select ProductConversion = new Select(getDriver().findElement(By.xpath(ConvertProductXpath)));
         ProductConversion.selectByValue(ProductConversions);
     }
}
