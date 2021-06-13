package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/sample.feature",
        glue = {"steps"},
        plugin = {"pretty"}
//        plugin = {"pretty", "html:results/cucumber-reports.html"}
)

public class TestRunner {
}
