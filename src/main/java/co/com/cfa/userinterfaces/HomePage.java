package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    public static Target MENU_PRODUCTS_BTN = Target.the("  ").locatedBy("//li[@id='nav-menu-item-25690']//child::span[text()='Productos']");
    public static Target OPT_PEOPLE_BTN = Target.the("  ").locatedBy("//li[@id='nav-menu-item-25692']//child::span[text()='Personas']");
    public static Target OPT_COMPANIES_BTN = Target.the("  ").locatedBy("//li[@id='nav-menu-item-25693']//child::span[text()='Empresas']");

}
