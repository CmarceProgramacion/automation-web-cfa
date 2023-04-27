package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConsumerCreditPage extends PageObject {
    public static Target OPT_FREE_INVESTMENT_BTN = Target.the("  ").locatedBy("//a[contains(@href,'credito-de-libre-inversion')]");
}
