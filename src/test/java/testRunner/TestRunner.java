package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="F://Selenium _WorkSpace//SeleniumCucumberProject//Features//OrangeHRM.feature",
				glue="stepDefinitions")


public class TestRunner {

}
