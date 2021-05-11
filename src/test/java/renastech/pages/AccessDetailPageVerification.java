package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utilities.BrowserUtils;

public class AccessDetailPageVerification extends BrowserUtils {
    public AccessDetailPageVerification(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[.='Access Details to Guru99 Telecom']")
    private WebElement textVerification;

    public void setTextVerification(String expectedMessage){
        staticWait(1);
        String realMessage = textVerification.getText();
        Assert.assertEquals(realMessage,expectedMessage);
    }
}
