/*
 * package TestRunner; import org.junit.runner.RunWith; import
 * cucumber.api.CucumberOptions; import cucumber.api.junit.Cucumber;
 * 
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions(features="/CucumberProject/src/test/java/FeatureFiles",
 * glue={"/CucumberProject/src/test/java/StepdefinitionFiles"}, // format=
 * {"pretty","html:test-outout"}, monochrome=true, strict=true, dryRun=false
 * 
 * ) public class TestRunner {
 * 
 * }
 */

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
// @CucumberOptions( features = "E:\\WebDriver\\Prashanthi\\workspace\\CucumberProject\\src\\test\\java\\FeatureFiles" ,glue={"StepdefinitionFiles"} )
@CucumberOptions( features = "src\\test\\java\\FeatureFiles" ,glue={"StepdefinitionFiles"} )
public class TestRunner {

	
}