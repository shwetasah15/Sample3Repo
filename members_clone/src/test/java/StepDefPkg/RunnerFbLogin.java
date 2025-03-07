package StepDefPkg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/Featurespkg/demoGuru.feature",
    glue = "StepDefPkg",
    plugin = {"pretty", "html:Reports/cucumber-reports.html",
			"json:Reports/json-reports.json",
	 "junit:Reports/junit-reports.xml"}
   
)

public class RunnerFbLogin extends AbstractTestNGCucumberTests {
}
