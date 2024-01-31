package ilanalab.reto.web.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/demoqa.feature",
        tags = "@CasosDePrueba",
        glue = "ilanalab.reto.web.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )
public class RunnerTags {
}
