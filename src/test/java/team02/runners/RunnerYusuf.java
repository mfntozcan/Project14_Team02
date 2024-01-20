package team02.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:raporlar/CucumberRaporYusuf.html",
        features = "src/test/resources",
        glue ={"team02/stepDefinition", "team02/hooks"},
        tags = "@a",
        dryRun = false
)
public class RunnerYusuf {
}
