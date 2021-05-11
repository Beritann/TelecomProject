package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utilities.BrowserUtils;

public class AddCustomerVerificationHeader extends BrowserUtils {
    public AddCustomerVerificationHeader(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement addCustomerHeader;

    public void verifyAddCustomerMessage(String expectedd){
        staticWait(1);
        String actualMessage=addCustomerHeader.getText();
        Assert.assertEquals(actualMessage,expectedd);
    }
}
