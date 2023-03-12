package step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginSBPage;
import pages.MainSBPage;
import utils.Config;
import utils.Driver;

public class SmartBearLoginSteps {

    LoginSBPage sb = new LoginSBPage();
    MainSBPage mainPage = new MainSBPage();

    @When("User is on SmartBear login Page")
    public void user_is_on_smart_bear_login_page() {
        Driver.getDriver().get(Config.getProperty("urlSmartBear"));
    }
    @When("User enters correct username")
    public void user_enters_correct_username() {
        sb.userNameLogin.sendKeys(Config.getProperty("sBuserName"));
    }
    @When("Enters the correct password")
    public void enters_the_correct_password() {
        sb.passwordLogin.sendKeys(Config.getProperty("sBpassword"));
    }
    @When("User clicks to login button")
    public void user_clicks_to_login_button() {
        sb.loginInBtn.click();
    }
    @Then("User should ne logged in and be able to verify Welcome text is displayed")
    public void user_should_ne_logged_in_and_be_able_to_verify_welcome_text_is_displayed() {
        Assert.assertTrue(mainPage.welcomeText.isDisplayed());
    }

    @And("User enters incorrect username")
    public void userEntersIncorrectUsername() {
        sb.userNameLogin.sendKeys("IncorrectUsername");
    }

    @And("Enters incorrect password")
    public void entersIncorrectPassword() {
        sb.passwordLogin.sendKeys("IncorrectPassword");
    }

    @Then("User should not be able to log in and recieve Invalid Login or Password Text")
    public void userShouldNotBeAbleToLogInAndReceiveInvalidLoginOrPasswordText() {
        Assert.assertTrue(sb.failedLoginText.isDisplayed());
    }
}
