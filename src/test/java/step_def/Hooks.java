package step_def;

import utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp() {
        System.out.println("The Scenario is running");
    }
    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed() && Driver.getReference() != null){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","screenshot");
    }
        Driver.quitDriver();
    }
}
