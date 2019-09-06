package first;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,tags="@swa",plugin={"pretty","json:report.json "})


public class runner3 {

}
