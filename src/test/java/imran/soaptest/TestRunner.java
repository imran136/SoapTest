package imran.soaptest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/res/feature",
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true
)
public class TestRunner {

}
