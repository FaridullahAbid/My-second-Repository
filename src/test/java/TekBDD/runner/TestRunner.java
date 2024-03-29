package TekBDD.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = "classpath:features",
        glue = "TekBDD.steps",
        dryRun = true
)
public class TestRunner {
}
