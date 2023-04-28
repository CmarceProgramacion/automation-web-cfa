package co.com.cfa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.cfa.userinterfaces.HomePage.MENU_PRODUCTS_BTN;
import static co.com.cfa.userinterfaces.HomePage.OPT_PEOPLE_BTN;
import static co.com.cfa.userinterfaces.PeoplePage.MENU_SAVINGS_BTN;
import static co.com.cfa.userinterfaces.SavingsAccountsPage.OPT_TRADITIONAL_SAVINGS_BTN;
import static co.com.cfa.userinterfaces.SavingsLinesPeoplePage.OPT_SAVINGS_ACCOUNTS_BTN;
import static co.com.cfa.userinterfaces.TraditionalSavingsPage.PRODUCT_RATES_FEES_BTN;

public class TraditionalSavingsFeesTask implements Task {
    private String product;

    public TraditionalSavingsFeesTask(String product) {
        this.product = product;
    }

    public static Performable whitData(String product) {
        return Tasks.instrumented(TraditionalSavingsFeesTask.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRODUCTS_BTN.of(product)),
                Click.on(OPT_PEOPLE_BTN),
                Click.on(MENU_SAVINGS_BTN),
                Click.on(OPT_SAVINGS_ACCOUNTS_BTN),
                Click.on(OPT_TRADITIONAL_SAVINGS_BTN),
                Click.on(PRODUCT_RATES_FEES_BTN)
        );
    }
}
