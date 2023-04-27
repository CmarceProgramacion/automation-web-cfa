package co.com.cfa.stepdefinitions;

import co.com.cfa.questions.VerifyRateDisplay;
import co.com.cfa.tasks.FreeInvestmentLoanspeopleTask;
import co.com.cfa.userinterfaces.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RatesAndFessCompanyStepDefinition {
    @Given("that I access the platform of the CFA Cooperativa Financiera")
    public void thatIAccessThePlatformOfTheCFACooperativaFinanciera() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(HomePage.class));
    }
    @When("I select the Consumer line of credit with the Free Investment product for individuals.")
    public void iSelectTheConsumerLineOfCreditWithTheFreeInvestmentProductForIndividuals(List<List<String>> dataCredit) {
    theActorInTheSpotlight().attemptsTo(FreeInvestmentLoanspeopleTask.whitData(dataCredit.get(0).get(0)));
    }
    @Then("Verify that it is displayed in the consumer credit line.")
    public void verifyThatItIsDisplayedInTheConsumerCreditLine(List<List<String>> dataCredit) {
        String category=dataCredit.get(0).get(0);
        String fees=dataCredit.get(0).get(1);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyRateDisplay.verify(category,fees)));

    }
}
