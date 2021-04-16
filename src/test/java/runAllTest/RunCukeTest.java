package runAllTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/cucumber.json"},
        glue = ("stepDefTest"),
        features="../moneygaming-acceptance-test/src/test/resources/features",
        tags ="@test")
public class RunCukeTest {
}