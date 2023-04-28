package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PeoplePage extends PageObject {
    public static Target MENU_CREDITS_BTN = Target.the("  ").locatedBy("//a[@id='ui-id-1']");
    public static Target MENU_SAVINGS_BTN = Target.the("  ").locatedBy("//a[@id='ui-id-2']");

}
