package TestRunner;
/*
 * package TestRunner; 
 import org.junit.runner.RunWith; import
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
@CucumberOptions( features = "src/test/java/FeatureFiles" ,
glue={"StepdefinitionFiles"} , plugin ={"html:target/Destination/cucumber.html", "pretty"}) 
public class TestRunner {

	
}