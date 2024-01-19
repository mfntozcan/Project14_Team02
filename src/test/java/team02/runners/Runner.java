package team02.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:raporlar/CucumberRapor.html",
        features = "src/test/resources",
        glue ={"team02/stepDefinition", "team02/hooks"},
<<<<<<< HEAD
        tags = "@US17",
=======
        tags = "@US13",
>>>>>>> main
        dryRun = false
)
public class Runner {
}
