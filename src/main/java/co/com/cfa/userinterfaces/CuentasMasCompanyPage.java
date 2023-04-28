package co.com.cfa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CuentasMasCompanyPage extends PageObject {
    public static Target OPT_FREE_CUENTAMAS_SAVINGS_BTN = Target.the("  ").locatedBy("//a[contains(@href,'cuentamas-para-empresas')]//child::span");

}
