package steps;

import com.test_framework.*;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class ChangePasswordSteps extends DriverManager
{
    private final WebDriver driver = DriverManager.getDriver();
    ChangePassword changePassword = new ChangePassword(driver);

    @Given("^I navigate to BMIIntouch page$")
    public void iNavigateToBMIIntouchPage()
    {
        changePassword.NavigateBMI();
    }

    @When("^I login with my user details$")
    public void iLoginWithMyUserDetails()
    {
        changePassword.LoginBMI();
    }

    @And("^I click on my  profile icon$")
    public void iClickOnMyProfileIcon()
    {
        changePassword.ClickProfile();
    }

    @And("^I change to new password$")
    public void iChangeToNewPassword()
    {
        changePassword.ChangePassword();
    }

    @Then("^I see password change successfully$")
    public void iSeePasswordChangeSuccessfully()
    {
        changePassword.CheckLoginPage();
        changePassword.Cleardata();
    }
}
