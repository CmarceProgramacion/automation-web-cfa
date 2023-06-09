package co.com.cfa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.cfa.userinterfaces.CuentasMasCompanyPage.OPT_FREE_CUENTAMAS_SAVINGS_BTN;
import static co.com.cfa.userinterfaces.HomePage.MENU_PRODUCTS_BTN;
import static co.com.cfa.userinterfaces.HomePage.OPT_COMPANIES_BTN;
import static co.com.cfa.userinterfaces.LinesCreditPage.OPT_PRODUCTIVE_CREDITS_COMPANY_BTN;
import static co.com.cfa.userinterfaces.LinesCreditPage.OPT_SAVINGS_ACCOUNTS_COMPANY_BTN;
import static co.com.cfa.userinterfaces.PeoplePage.MENU_CREDITS_BTN;
import static co.com.cfa.userinterfaces.PeoplePage.MENU_SAVINGS_BTN;
import static co.com.cfa.userinterfaces.ProductiveCreditsPage.OPT_FREE_PRODUCTIVE_CREDIT_BTN;
import static co.com.cfa.userinterfaces.ProductiveCreditsPage.OPT_PRODUCTIVE_CREDIT_SEE_RATES_BTN;

public class ProductiveCuentaMasCompanyTask implements Task {
    private String product;

    public ProductiveCuentaMasCompanyTask(String product) {
        this.product = product;
    }

    public static Performable whitData(String product) {
        return Tasks.instrumented(ProductiveCuentaMasCompanyTask.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRODUCTS_BTN),
                Click.on(OPT_COMPANIES_BTN),
                Click.on(MENU_SAVINGS_BTN),
                Click.on(OPT_SAVINGS_ACCOUNTS_COMPANY_BTN),
                Click.on(OPT_FREE_CUENTAMAS_SAVINGS_BTN),
                Click.on(OPT_PRODUCTIVE_CREDIT_SEE_RATES_BTN)
        );
    }
}