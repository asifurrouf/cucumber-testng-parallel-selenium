package cucumber.examples.java.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "target/test-classes/cucumber/examples/java/calculator", format = {"html:target/cucumber-report/autocorrect"})
public class RunCukesTest extends AbstractTestNGCucumberTests {
}
