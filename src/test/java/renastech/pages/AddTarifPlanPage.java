package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utilities.BrowserUtils;

public class AddTarifPlanPage extends BrowserUtils {
    public AddTarifPlanPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='rental1']")
    private WebElement monthlyRentalBox;

    @FindBy(xpath = "//input[@id='local_minutes']")
    private WebElement localMinutesBox;

    @FindBy(xpath = "//input[@id='inter_minutes']")
    private WebElement internationalMinutesBox;

    @FindBy(xpath = "//input[@id='sms_pack']")
    private WebElement smsPackBox;

    @FindBy(xpath = "//input[@id='minutes_charges']")
    private WebElement localPerMinutChargesBox;

    @FindBy(xpath = "//input[@id='inter_charges']")
    private WebElement interPerMinuteBox;

    @FindBy(xpath = "//input[@id='sms_charges']")
    private WebElement smsPerChangesBox;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;

    public void setMonthlyRentalBox(String montlyRental){
        staticWait(1);
        monthlyRentalBox.sendKeys(montlyRental);
    }
    public void setLocalMinutesBox(String freeLocalMinutes){
        staticWait(1);
        localMinutesBox.sendKeys(freeLocalMinutes);
    }
    public void setInternationalMinutesBox(String freeInternationalMinutes){
        staticWait(1);
        internationalMinutesBox.sendKeys(freeInternationalMinutes);
    }
    public void setSmsPackBox(String freeSmsPack){
        staticWait(1);
        smsPackBox.sendKeys(freeSmsPack);
    }
    public void setLocalPerMinutChargesBox(String  localPerCharges){
        staticWait(1);
        localPerMinutChargesBox.sendKeys(localPerCharges);
    }
    public void setInterPerMinuteBox(String interPerMinuteCharges){
        staticWait(1);
        interPerMinuteBox.sendKeys(interPerMinuteCharges);
    }
    public void setSmsPerChangesBox(String smsPerChanges){
        staticWait(1);
        smsPerChangesBox.sendKeys(smsPerChanges);
    }
    public void setSubmitButton(){
        staticWait(1);
        submitButton.click();
    }
}
