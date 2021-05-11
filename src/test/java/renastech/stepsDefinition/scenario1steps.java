package renastech.stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import renastech.pages.*;
import renastech.utilities.BrowserUtils;

import java.util.Map;

public class scenario1steps extends BrowserUtils {
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        System.out.println("THIS WEBSITE IS LUNCHED!!");
    }

    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String Guru99TelecomMessage) {
       VerificationGuru99TelecomPage verificationGuru99TelecomPage= new VerificationGuru99TelecomPage();
       verificationGuru99TelecomPage.verifyMessage(Guru99TelecomMessage);
    }
    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        WebElement addCustomerButton = driver.findElement(By.xpath("//a[.='Add Customer']"));
        staticWait(1);
        addCustomerButton.click();
    }
    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String addCustomerHeaderMessage) {
        AddCustomerVerificationHeader addCustomerVerificationHeader = new AddCustomerVerificationHeader();
        addCustomerVerificationHeader.verifyAddCustomerMessage(addCustomerHeaderMessage);
    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String bCheck) {
        BackgroundCheckPage backgroundCheckPage = new BackgroundCheckPage();
        backgroundCheckPage.setBackgroundButtons(bCheck);
    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String fName, String lName, String email, String address, String pNumber) {
        BillingAddressInformationPage billingAddressInformationPage = new BillingAddressInformationPage();
        billingAddressInformationPage.billingAddressInformation(fName,lName,email,address,pNumber);
        staticWait(1);
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String accessMessage) {
        AccessDetailPageVerification accessDetailPageVerification = new AccessDetailPageVerification();
        accessDetailPageVerification.setTextVerification(accessMessage);
    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        WebElement tariffPlanButton = driver.findElement(By.xpath("//a[.='Add Tariff Plan']"));
        tariffPlanButton.click();
    }
    @Then("The user  wants to verify  {string}  headerrr")
    public void theUserWantsToVerifyHeaderrr(String addTarifPlanMessage) {
        TarifPlanMessageVerificationPage tarifPlanMessageVerificationPage = new TarifPlanMessageVerificationPage();
        tarifPlanMessageVerificationPage.setAddTarifPlansHeader(addTarifPlanMessage);
    }

    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String ,String > tarifPlanTable) {
        AddTarifPlanPage addTarifPlanPage = new AddTarifPlanPage();
        addTarifPlanPage.setMonthlyRentalBox(tarifPlanTable.get("Monthly Rental"));
        addTarifPlanPage.setLocalMinutesBox(tarifPlanTable.get("Free Local Minutes"));
        addTarifPlanPage.setInternationalMinutesBox(tarifPlanTable.get("Free International Minutes"));
        addTarifPlanPage.setSmsPackBox(tarifPlanTable.get("Free SMS Pack"));
        addTarifPlanPage.setLocalPerMinutChargesBox(tarifPlanTable.get("Local Per Minutes Charges"));
        addTarifPlanPage.setInterPerMinuteBox(tarifPlanTable.get("International Per Minutes Charges"));
        addTarifPlanPage.setSmsPerChangesBox(tarifPlanTable.get("SMS Per Charges"));
        addTarifPlanPage.setSubmitButton();

    }
    @Then("The user wants to submitThenThe user wants to verify message as {string}")
    public void the_user_wants_to_submit_then_the_user_wants_to_verify_message_as(String congMessage) {
        WebElement actualMessage= driver.findElement(By.xpath("//h2[.='Congratulation you add Tariff Plan']"));
        String realOne = actualMessage.getText();
        Assert.assertEquals(realOne,congMessage);
    }

}
