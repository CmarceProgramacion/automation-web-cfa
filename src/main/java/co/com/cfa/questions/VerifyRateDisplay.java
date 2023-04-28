package co.com.cfa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.cfa.userinterfaces.RatesPage.SUB_TITLE_RATES;

public class VerifyRateDisplay implements Question<Boolean> {

    private String fees;

    public VerifyRateDisplay(String fees) {
        this.fees = fees;

    }

    public static VerifyRateDisplay verify( String fees) {
        return new VerifyRateDisplay(fees);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return fees.equals(SUB_TITLE_RATES.resolveFor(actor).getText());
    }
}
