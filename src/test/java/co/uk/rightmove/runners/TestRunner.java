package co.uk.rightmove.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/rightmove/features"},
        glue = {"co/uk/rightmove/stepDefinitions", "co/uk/rightmove/hooks"}
)
public class TestRunner {
}
