package team02.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:raporlar/CucumberRaporHilal.html",
        features = "src/test/resources",
        glue ={"team02/stepDefinition", "team02/hooks"},
        tags = "@US10",
        dryRun = false
)
public class HilalRunner {
}