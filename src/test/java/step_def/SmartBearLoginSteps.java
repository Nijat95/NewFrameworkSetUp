package step_def;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Config;
import utils.Driver;

public class SmartBearLoginSteps {
    @When("User is on SmartBear login Page")
    public void user_is_on_smart_bear_login_page() {
        Driver.getDriver().get(Config.getProperty("noaa"));
    }
    @When("User enters correct username")
    public void user_enters_correct_username() {

    }
    @When("Enters the correct password")
    public void enters_the_correct_password() {

    }
    @When("User clicks to login button")
    public void user_clicks_to_login_button() {

    }
    @Then("User should ne logged in and be able to verify Welcome text is displayed")
    public void user_should_ne_logged_in_and_be_able_to_verify_welcome_text_is_displayed() {

    }
}
