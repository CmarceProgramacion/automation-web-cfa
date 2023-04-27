package co.com.cfa.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class BeforeAfterStepDefinition {
    @Before
    public void initialAutomationConfig() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Cfa");
    }

    @After
    public void endingAutomationConfig() {
        Serenity.getWebdriverManager().closeCurrentDrivers();
    }

}
