package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utilities.BrowserUtils;

public class TarifPlanMessageVerificationPage extends BrowserUtils {
    public TarifPlanMessageVerificationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[.='Add Tariff Plans']")
    private WebElement addTarifPlansHeader;

    public void setAddTarifPlansHeader(String expectedd){
        staticWait(1);
        String actualHeader= addTarifPlansHeader.getText();
        Assert.assertEquals(actualHeader,expectedd);
    }
}
