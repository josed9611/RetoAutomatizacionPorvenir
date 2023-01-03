package com.advantageonlineshopping.userinterfaces.Home;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class RegistrationPage extends PageObject {

    public static final Target LNK_PAGE_LOGIN = Target.the("link to the login window").locatedBy("//*[@id=\"menuUserLink\"]");


    public static final Target BTN_CREATE_ACCOUNT = Target.the("Button Create new Account").locatedBy("//a[contains(text(),'CREATE NEW ACCOUNT')]");

    public static final Target TXT_USER_NAME = Target.the("Text field Username").locatedBy("//div[@id='formCover']//following::input[@name='usernameRegisterPage']");
    public static final Target TXT_EMAIL = Target.the("text field for email").locatedBy("//div[@id='formCover']//following::input[@name='emailRegisterPage']");
    public static final Target TXT_PASSWORD = Target.the("text field for password").locatedBy("//div[@id='formCover']//following::input[@name='passwordRegisterPage']");
    public static final Target TXT_CONF_PASSWORD = Target.the("Text field for password confirmation").locatedBy("//div[@id='formCover']//following::input[@name='confirm_passwordRegisterPage']");
    public static final Target TXT_FIRT_NAME = Target.the("Text field for firt name").locatedBy("//div[@id='formCover']//following::input[(@name='first_nameRegisterPage')]");
    public static final Target TXT_LAST_NAME = Target.the("Text field for last name").locatedBy("//div[@id='formCover']//following::input[(@name='last_nameRegisterPage')]");
    public static final Target TXT_PHONE_NUMBER = Target.the("Text field for phone number").locatedBy("//div[@id='formCover']//following::input[(@name='phone_numberRegisterPage')]");
    public static final Target TXT_CITY = Target.the("Text field for city").locatedBy("//div[@id='formCover']//following::input[(@name='cityRegisterPage')]");
    public static final Target TXT_ADDRESS = Target.the("Text field for address").locatedBy("//div[@id='formCover']//following::input[(@name='addressRegisterPage')]");
    public static final Target TXT_STATE = Target.the("Text field for state").locatedBy("//div[@id='formCover']//following::input[(@name='state_/_province_/_regionRegisterPage')]");
    public static final Target TXT_POSTAL_CODE = Target.the("Text field for postal code").locatedBy("//div[@id='formCover']//following::input[(@name='postal_codeRegisterPage')]");
    public static final Target SELECT_COUNTRY = Target.the("Select name for country").locatedBy("//div[@id='formCover']//following::input[(@name='postal_codeRegisterPage')]");
    public static final Target SELECT_COL = Target.the("Select name for country colombia ").locatedBy("//div[@id='formCover']//following::input[(@name='postal_codeRegisterPage')]");
    public static final Target CHECK_REGISTER_ACCOUNT = Target.the("Botton to register account").locatedBy("//input[@name='i_agree']");
    public static final Target BTN_REGISTER_ACCOUNT = Target.the("Botton to register account").locatedBy("//button[@id='register_btnundefined']");
    public static final Target LBL_NAME_PROFILE = Target.the("LBL validation Profile").locatedBy("//span[@class='hi-user containMiniTitle ng-binding']");
    public static final Target LBL_VALIDATION = Target.the("LBL validation Profile").locatedBy("//h1[@class='roboto-regular screen768 ng-binding']");
    public static final Target LBL_VALIDATION_SHOP = Target.the("LBL validation Profile").locatedBy("//h3[contains(text(),'HP')]//following::h3[contains(text(),'HP')]");


}
