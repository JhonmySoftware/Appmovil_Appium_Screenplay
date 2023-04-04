package co.com.infotrack.appmovil.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@Requerimiento01",
        glue = {"co.com.infotrack.appmovil.stepdefinitions", "co.com.infotrack.appmovil.utils"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {

}
