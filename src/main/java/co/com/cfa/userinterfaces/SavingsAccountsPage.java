package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SavingsAccountsPage extends PageObject {
    public static Target OPT_TRADITIONAL_SAVINGS_BTN = Target.the("  ").locatedBy("//a[contains(@href,'ahorro-tradicional')]//child::span[@class='elementor-cta__button elementor-button elementor-size-md']");

}
