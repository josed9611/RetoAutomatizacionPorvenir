package com.advantageonlineshopping.stepDefinition;

import com.advantageonlineshopping.driver.SeleniumWebDriver;
import com.advantageonlineshopping.globalVar.Global;
import com.advantageonlineshopping.interaction.Validation;
import com.advantageonlineshopping.models.UserData;
import com.advantageonlineshopping.task.EnterLoginPage;
import com.advantageonlineshopping.task.RegisterNewUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.util.List;

import static com.advantageonlineshopping.userinterfaces.Home.RegistrationPage.LBL_NAME_PROFILE;


public class RegistrationStepDefinition {


    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Jose is on the page of advantage and he wants to register on the (.*)$")
    public void JoseIsOnThePageOfAdvantageAndHeWantsToRegisterOnTheHttpsWwwAdvantageonlineshoppingCom(String website) {

        SeleniumWebDriver.chromeHisBrowserWeb();
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(SeleniumWebDriver.on("https://www.advantageonlineshopping.com/#/")));
        OnStage.theActorInTheSpotlight().wasAbleTo(EnterLoginPage.ir());

    }


    @When("^Jose enters his personal data$")
    public void JoseEntersHisPersonalData(List<UserData> userDataList) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterNewUser.ir()
                        .user(userDataList.get(0).getUser())
                        .email(userDataList.get(0).getEmail())
                        .password(userDataList.get(0).getPassword())
                        .confPass(userDataList.get(0).getConfPassword())
                        .firtName(userDataList.get(0).getFirtName())
                        .lastName(userDataList.get(0).getLastName())
                        .phoneNumber(userDataList.get(0).getPhoneNumber())
                        .city(userDataList.get(0).getCity())
                        .address(userDataList.get(0).getAddress())
                        .state(userDataList.get(0).getState())
                        .postalCode(userDataList.get(0).getPostalCode()));
        OnStage.theActorInTheSpotlight().attemptsTo(Validation.ir());
    }

    @Then("^He can see the (.*) logged in$")
    public void heCanSeeTheUserLoggedIn(String user) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(LBL_NAME_PROFILE.of(user)), WebElementStateMatchers.containsText(Global.randomModel)));

    }

}
