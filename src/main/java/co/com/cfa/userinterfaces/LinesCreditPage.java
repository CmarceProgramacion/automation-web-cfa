package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LinesCreditPage extends PageObject {
    public static Target OPT_CONSUMER_CREDIT_BTN = Target.the("  ").locatedBy("//a[contains(@href,'creditos-de-consumo')]//child::span[@class='elementor-button-text']");
    public static Target OPT_PRODUCTIVE_CREDITS_BTN = Target.the("  ").locatedBy("//a[contains(@href,'creditos-productivos')]//child::span[@class='elementor-button-text']");
    public static Target OPT_PRODUCTIVE_CREDITS_COMPANY_BTN = Target.the("  ").locatedBy("//a[contains(@href,'productivos-empresariales')]//child::span[@class='elementor-button-text']");
}

