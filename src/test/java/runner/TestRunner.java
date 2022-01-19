package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"step_definations"},
  //      plugin = {"pretty", "summary", "html:target/CucumberReports/reports.html"},
        plugin = {"pretty", "summary", "json:target/Cucumber.json"},
        publish = true
     //   tags = "@dataDriven_test or @negative_test or @positive_test"
      //  tags = "@test"

)
public class TestRunner {
}

// we can use tags to run exactly who has the same tag
// or- left side or right side both true or either one true it will be executed
// and - will be executed if both conditions are true
// "@dataDriven_test and @negative_test"
// "@positive_test and @negative_test"
// "@positive_test and @smoke_test"  here this test will not run as we don't have any tag named smoked test
// "@positive_test or @smoke_test" It will run the positive test only.
