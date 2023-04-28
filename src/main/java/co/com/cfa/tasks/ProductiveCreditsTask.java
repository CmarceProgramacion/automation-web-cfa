package co.com.cfa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.cfa.userinterfaces.HomePage.MENU_PRODUCTS_BTN;
import static co.com.cfa.userinterfaces.HomePage.OPT_PEOPLE_BTN;
import static co.com.cfa.userinterfaces.LinesCreditPage.OPT_PRODUCTIVE_CREDITS_BTN;
import static co.com.cfa.userinterfaces.PeoplePage.MENU_CREDITS_BTN;
import static co.com.cfa.userinterfaces.ProductiveCreditsPage.OPT_FREE_PRODUCTIVE_CREDIT_BTN;
import static co.com.cfa.userinterfaces.ProductiveCreditsPage.OPT_PRODUCTIVE_CREDIT_SEE_RATES_BTN;

public class ProductiveCreditsTask implements Task {
    private String product;

    public ProductiveCreditsTask(String product) {
        this.product = product;
    }

    public static Performable whitData(String product) {
        return Tasks.instrumented(ProductiveCreditsTask.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRODUCTS_BTN),
                Click.on(OPT_PEOPLE_BTN),
                Click.on(MENU_CREDITS_BTN),
                Click.on(OPT_PRODUCTIVE_CREDITS_BTN),
                Click.on(OPT_FREE_PRODUCTIVE_CREDIT_BTN),
                Click.on(OPT_PRODUCTIVE_CREDIT_SEE_RATES_BTN)
        );
    }

}

