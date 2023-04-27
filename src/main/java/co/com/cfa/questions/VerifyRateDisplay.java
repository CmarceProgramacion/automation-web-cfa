package co.com.cfa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.cfa.userinterfaces.FreeInvestmentPage.SUB_TITLE_RATES;
import static co.com.cfa.userinterfaces.FreeInvestmentPage.TITLE_RATES;

public class VerifyRateDisplay implements Question<Boolean> {
    private String category;
    private String fees;

    public VerifyRateDisplay(String category, String fees) {
        this.category = category;
        this.fees = fees;
    }

    public static VerifyRateDisplay verify(String category, String fees) {
        return new VerifyRateDisplay(category, fees);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return category.equals(TITLE_RATES.resolveFor(actor).getText()) && fees.equals(SUB_TITLE_RATES.resolveFor(actor).getText());
    }
}
