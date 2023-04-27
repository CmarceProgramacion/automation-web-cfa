package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FreeInvestmentPage extends PageObject {
    public static Target OPT_FREE_INVESTMENT_SEE_RATES_BTN = Target.the("  ").locatedBy("//span[@class='elementor-button-content-wrapper']//child::span[text()='VER TASAS ']");
    public static Target TITLE_RATES = Target.the("  ").locatedBy("//div[@data-id='503a2509']//h1");
    public static Target SUB_TITLE_RATES = Target.the("  ").locatedBy("//div[@data-id='d6809ad']//h2");

}
