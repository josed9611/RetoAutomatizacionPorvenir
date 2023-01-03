package com.advantageonlineshopping.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.advantageonlineshopping.userinterfaces.Home.RegistrationPage.*;

public class EnterLoginPage implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LNK_PAGE_LOGIN, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Hit.the(Keys.ENTER).keyIn(LNK_PAGE_LOGIN),
                WaitUntil.the(BTN_CREATE_ACCOUNT, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Hit.the(Keys.ENTER).keyIn(BTN_CREATE_ACCOUNT)
        );
    }

    public static EnterLoginPage ir() {
        return Tasks.instrumented(EnterLoginPage.class);
    }

}
