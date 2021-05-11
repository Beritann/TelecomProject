package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utilities.BrowserUtils;

public class VerificationGuru99TelecomPage extends BrowserUtils {
    public VerificationGuru99TelecomPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[.='Guru99 telecom']")
    private WebElement headerVerification;

    public void verifyMessage(String expected){
        staticWait(2);
        String actualMessage = headerVerification.getText();
        Assert.assertEquals(actualMessage,expected);
    }
}
