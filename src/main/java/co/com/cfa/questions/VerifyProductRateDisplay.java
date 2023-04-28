package co.com.cfa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.cfa.userinterfaces.RatesPage.SUB_TITLE_RATES;
import static co.com.cfa.userinterfaces.RatesPage.TITLE_RATES;

public class VerifyProductRateDisplay implements Question<Boolean> {
    private String category;
    private String fees;

    public VerifyProductRateDisplay(String category, String fees) {
        this.category = category;
        this.fees = fees;
    }

    public static VerifyProductRateDisplay verify(String category, String fees) {
        return new VerifyProductRateDisplay(category, fees);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return category.equals(TITLE_RATES.resolveFor(actor).getText()) && fees.equals(SUB_TITLE_RATES.resolveFor(actor).getText());
    }
}
