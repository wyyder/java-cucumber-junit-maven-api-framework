package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features/api-crud-test.feature",
        glue = {"steps"},
//        tags = "@SmokeTest",
//        tags = { "@API_Test" }),
//        monochrome = true,
        dryRun = false,
//        plugin = {"pretty"}
//        plugin = {"pretty", "html:results/test-reports.html"}
        plugin = {"pretty", "html:results/test-reports.html",
                "json:results/test-report.json",
                "junit:results/test-reports.xml"}

)

public class TestRunner {
}
