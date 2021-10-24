package co.com.sofka.runner.loginmyinfo;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features.orangepage"},
        glue = {"co.com.sofka.stepdefinition.orangepage"},
        tags = "not @ignore"
)
public class LoginMyInfoRunner {
}
