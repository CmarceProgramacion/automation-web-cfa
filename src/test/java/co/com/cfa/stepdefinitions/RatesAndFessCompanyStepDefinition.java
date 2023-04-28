package co.com.cfa.stepdefinitions;

import co.com.cfa.questions.VerifyProductRateDisplay;
import co.com.cfa.questions.VerifyRateDisplay;
import co.com.cfa.tasks.FreeInvestmentLoanspeopleTask;
import co.com.cfa.tasks.TraditionalSavingsFeesTask;
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
    @Then("Verify that the free investment product rates screen is displayed")
    public void VerifyThatTheFreeInvestmentProductRatesScreenIsDisplayed(List<List<String>> dataCredit) {
        String category=dataCredit.get(0).get(0);
        String fees=dataCredit.get(0).get(1);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyProductRateDisplay.verify(category,fees)));
    }

    @When("I select the savings account with the traditional savings product")
    public void iSelectTheSavingsAccountWithTheTraditionalSavingsProduct(List<List<String>> dataCredit) {
        theActorInTheSpotlight().attemptsTo(TraditionalSavingsFeesTask.whitData(dataCredit.get(0).get(0)));

    }

    @Then("Verify that the Traditional savings product rates screen appears")
    public void verifyThatTheTraditionalSavingsProductRatesScreenAppears(List<List<String>> dataCredit) {
        String fees=dataCredit.get(0).get(0);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyRateDisplay.verify(fees)));
    }
}
