package co.com.cfa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/rates_and_fees_company.feature",
        glue = "co.com.cfa.stepdefinitions",
        tags = "@CaseFour",
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RatesAndFessCompanyRunner {
}
