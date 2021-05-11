package renastech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utilities.BrowserUtils;

public class BackgroundCheckPage extends BrowserUtils {
    public BackgroundCheckPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//label[.='Done']")
    private WebElement doneButton;

    @FindBy(xpath = "//label[.='Pending']")
    private WebElement pendingButton;

    public void setBackgroundButtons(String bCheck){

        switch (bCheck){
            case "Done":
                driver.findElement(By.xpath("//label[.='Done']")).click();
                break;
            case "Pending":
                driver.findElement(By.xpath("//label[.='Pending']")).click();
                break;
        }
    }
}
