package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\karth\\eclipse-workspace\\nov19\\src\\test\\resources\\TaskNov19\\featureFiles",
glue={"TaskNov19","HOOKS"},dryRun=false,monochrome=true,plugin= {"html:target/html","json:target/report.json"})
public class testRunnerPharmEasy {

}
