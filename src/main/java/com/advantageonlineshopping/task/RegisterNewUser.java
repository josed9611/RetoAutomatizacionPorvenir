package com.advantageonlineshopping.task;


import static com.advantageonlineshopping.userinterfaces.Home.RegistrationPage.*;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class RegisterNewUser implements Task {

    private String user;
    private String email;
    private String password;
    private String confPass;

    private String firtName;
    private String LastName;
    private String phoneNumber;
    private String city;
    private String address;
    private String state;
    private String postalCode;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(user).into(TXT_USER_NAME),
                Enter.keyValues(email).into(TXT_EMAIL),
                Enter.keyValues(password).into(TXT_PASSWORD),
                Enter.keyValues(confPass).into(TXT_CONF_PASSWORD),
                Enter.keyValues(firtName).into(TXT_FIRT_NAME),
                Enter.keyValues(LastName).into(TXT_LAST_NAME),
                Enter.keyValues(phoneNumber).into(TXT_PHONE_NUMBER),
                Enter.keyValues(city).into(TXT_CITY),
                Enter.keyValues(address).into(TXT_ADDRESS),
                Enter.keyValues(state).into(TXT_STATE),
                Enter.keyValues(postalCode).into(TXT_POSTAL_CODE),
                WaitUntil.the(CHECK_REGISTER_ACCOUNT, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CHECK_REGISTER_ACCOUNT),
                Hit.the(Keys.ENTER).keyIn(BTN_REGISTER_ACCOUNT)

        );


    }

    public static RegisterNewUser ir() {
        return Tasks.instrumented(RegisterNewUser.class);
    }

    public RegisterNewUser user(String user) {
        this.user = user;
        return this;
    }

    public RegisterNewUser email(String email) {
        this.email = email;
        return this;
    }

    public RegisterNewUser password(String password) {
        this.password = password;
        return this;
    }

    public RegisterNewUser confPass(String confPass) {
        this.confPass = confPass;
        return this;
    }

    public RegisterNewUser firtName(String firtName) {
        this.firtName = firtName;
        return this;
    }


    public RegisterNewUser lastName(String lastName) {
        this.LastName = lastName;
        return this;
    }

    public RegisterNewUser phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public RegisterNewUser city(String city) {
        this.city = city;
        return this;
    }

    public RegisterNewUser state(String state) {
        this.state = state;
        return this;
    }

    public RegisterNewUser address(String address) {
        this.address = address;
        return this;
    }

    public RegisterNewUser postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
}
