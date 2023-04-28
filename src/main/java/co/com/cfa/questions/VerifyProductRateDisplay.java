package co.com.cfa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.cfa.userinterfaces.RatesPage.SUB_TITLE_RATES;
import static co.com.cfa.userinterfaces.RatesPage.TITLE_RATES;

public class VerifyProductRateDisplay implements Question<Boolean> {
    private String category;

    public VerifyProductRateDisplay(String category) {
        this.category = category;

    }

    public static VerifyProductRateDisplay verify(String category) {
        return new VerifyProductRateDisplay(category);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return category.equals(TITLE_RATES.resolveFor(actor).getText());
    }
}
