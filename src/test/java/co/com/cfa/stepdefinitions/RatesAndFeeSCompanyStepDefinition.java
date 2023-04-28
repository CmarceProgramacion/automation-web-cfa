package co.com.cfa.stepdefinitions;

import co.com.cfa.tasks.ProductiveCreditsCompanyTask;
import co.com.cfa.tasks.TraditionalSavingsFeesPeopleTask;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RatesAndFeeSCompanyStepDefinition {

    @When("I select CuentaMás Business Savings Account")
    public void iSelectCuentaMásBusinessSavingsAccount(List<List<String>> dataCredit) {
        theActorInTheSpotlight().attemptsTo(ProductiveCreditsCompanyTask.whitData(dataCredit.get(0).get(0)));

    }


}
