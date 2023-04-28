package co.com.cfa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SavingsLinesPeoplePage {
    public static Target OPT_SAVINGS_ACCOUNTS_BTN = Target.the("  ").locatedBy("//a[contains(@href,'cuentas-de-ahorro')]//child::span[@class='elementor-button-text']");

}
