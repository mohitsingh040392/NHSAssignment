package nhs.walesticket.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile",
				 monochrome = true,
				 dryRun = false,
				 strict = true,
				 glue = "nhs.walesticket.stepdefinitions"
)
public class TestRunner {

}
