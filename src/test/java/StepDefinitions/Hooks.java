package StepDefinitions;

import Utilities.BaseDriver;
import Utilities.ExcelUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void init() {
        BaseDriver.getDriver().navigate().to("https://test.mersys.io/");
    }

    @After
    public void quit(Scenario scenario) {
        ExcelUtility.writeToExcel("src/test/results/TestResults.xlsx", scenario);
        
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) BaseDriver.getDriver());
            byte[] tmp = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(tmp, "image/png", scenario.getName());
        }

        BaseDriver.quit();
    }
}
