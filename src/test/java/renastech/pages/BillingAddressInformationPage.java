package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utilities.BrowserUtils;

public class BillingAddressInformationPage extends BrowserUtils {

    public BillingAddressInformationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="fname")
    private WebElement firstNameBox;

    @FindBy(id = "lname")
    private WebElement lastNameBox;

    @FindBy(id = "email")
    private WebElement emailBox;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement addressBox;

    @FindBy(xpath = "//input[@id='telephoneno']")
    private WebElement mobilePhoneBox;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;

    public void billingAddressInformation(String fName, String lName, String email, String address, String pNumber){
        staticWait(1);
        firstNameBox.sendKeys(fName);
        staticWait(1);
        lastNameBox.sendKeys(lName);
        staticWait(1);
        emailBox.sendKeys(email);
        staticWait(1);
        addressBox.sendKeys(address);
        staticWait(1);
        mobilePhoneBox.sendKeys(pNumber);
        staticWait(1);
        submitButton.click();
    }

}
