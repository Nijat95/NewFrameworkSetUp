package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginSBPage {

    public LoginSBPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@ id=\"ctl00_MainContent_username\"]")
    public WebElement userNameLogin;
    @FindBy(xpath = "//input[@ id=\"ctl00_MainContent_password\"]")
    public WebElement passwordLogin;

    @FindBy(xpath = "//input[@ id=\"ctl00_MainContent_login_button\"]")
    public WebElement loginInBtn;

    @FindBy(xpath = "//span[@id=\"ctl00_MainContent_status\"]")
    public WebElement failedLoginText;



}
