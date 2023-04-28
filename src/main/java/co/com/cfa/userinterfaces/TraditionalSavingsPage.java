package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TraditionalSavingsPage extends PageObject {
    public static Target PRODUCT_RATES_FEES_BTN = Target.the("  ").locatedBy("//a[contains(@href,'tasas-de-captacion')]//child::span[@class='elementor-button-text']");

}
