package renastech.stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import renastech.utilities.BrowserUtils;
import renastech.utilities.ConfigurationReader;
import renastech.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class hooks extends BrowserUtils {

    @Before
    public void setup(){
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperties("demo_guru99_url"));
    }
//    @After
//    public void lastStep(Scenario scenario){
//        if (scenario.isFailed()){
//            byte[] data = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(data,"image/png",scenario.getName());
//        }
//        //Driver.tearDown();
//        //System.out.println("::::::::::: End of the test Execution::::::::");
//    }
}
