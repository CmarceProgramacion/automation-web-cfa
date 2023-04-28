package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RatesPage extends PageObject {
    public static Target TITLE_RATES = Target.the("  ").locatedBy("//div[@data-id='503a2509']//h1");
    public static Target SUB_TITLE_RATES = Target.the("  ").locatedBy("//div[@data-id='d6809ad']//h2");

}
