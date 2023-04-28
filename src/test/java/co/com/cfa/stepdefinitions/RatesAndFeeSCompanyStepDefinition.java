package co.com.cfa.stepdefinitions;

import co.com.cfa.tasks.ProductiveCreditsCompany;
import co.com.cfa.tasks.ProductiveCuentaMasCompanyTask;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RatesAndFeeSCompanyStepDefinition {

    @When("I select CuentaMas Business Savings Account")
    public void iSelectCuentaMasBusinessSavingsAccount(List<List<String>> dataCredit) {
        theActorInTheSpotlight().attemptsTo(ProductiveCuentaMasCompanyTask.whitData(dataCredit.get(0).get(0)));

    }
    @When("I select the Companies' Productive Credit product")
    public void iSelectTheCompaniesProductiveCreditProduct(List<List<String>> dataCredit) {
        theActorInTheSpotlight().attemptsTo(ProductiveCreditsCompany.whitData(dataCredit.get(0).get(0)));

    }



}
