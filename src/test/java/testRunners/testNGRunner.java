package testRunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

public class testNGRunner {

	@CucumberOptions(
		    features = "src/test/resources/features",
		    glue = "stepDefinitions",
		    plugin = {"pretty", "html:target/cucumber-reports.html"},
		    monochrome = true
		)
		@Test
		public class TestNGRunner extends AbstractTestNGCucumberTests {
		}
}
