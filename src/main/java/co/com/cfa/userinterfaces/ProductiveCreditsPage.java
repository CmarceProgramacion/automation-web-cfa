package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductiveCreditsPage extends PageObject {

    public static Target OPT_FREE_PRODUCTIVE_CREDIT_BTN = Target.the("  ").locatedBy("//a[contains(@href,'credito-productivo')]");
    public static Target OPT_PRODUCTIVE_CREDIT_SEE_RATES_BTN = Target.the("  ").locatedBy("//span[@class='elementor-button-content-wrapper']//child::span[text()='VER TASAS Y TARIFAS']");

}
