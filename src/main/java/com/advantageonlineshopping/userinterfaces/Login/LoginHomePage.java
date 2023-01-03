package com.advantageonlineshopping.userinterfaces.Login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginHomePage {

    public static final Target TXT_USERNAME = Target.the("LBL validation Profile").locatedBy("//input[@name='username']");
    public static final Target TXT_PASSWORD = Target.the("LBL validation Profile").locatedBy("//input[@name='password']");
    public static final Target BTN_SING_IN = Target.the("LBL validation Profile").locatedBy("//button[@id='sign_in_btnundefined']");
    public static final Target BTN_LAPTOP = Target.the("This is the Laptop Button").located(By.id("laptopsImg"));
    public static final Target BTN_SELECT_TABLET = Target.the("LBL validation Profile").locatedBy("//img[@class='imgProduct']");
    public static final Target BTN_GO_TO_CAR = Target.the("LBL validation Profile").locatedBy("//button[@name='save_to_cart']");
    public static final Target BTN_CHECK_CAR = Target.the("LBL validation Profile").locatedBy("//button[@id='checkOutPopUp']");


}
