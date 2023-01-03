package com.advantageonlineshopping.interaction;

import com.advantageonlineshopping.globalVar.Global;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.advantageonlineshopping.userinterfaces.Home.RegistrationPage.*;

public class Validation implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_NAME_PROFILE, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds()
        );

        Global.randomModel = LBL_NAME_PROFILE.resolveFor(actor).getText();


    }

    public static Validation ir() {
        return Tasks.instrumented(Validation.class);
    }
}