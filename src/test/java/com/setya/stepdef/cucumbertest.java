package com.setya.stepdef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.setya.stepdef"},
        features = {"src/test/resources/features"},
        plugin = {"pretty"}
)
public class cucumbertest {
}
