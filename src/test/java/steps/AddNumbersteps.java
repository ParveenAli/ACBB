package steps;

import com.test_framework.AddNumber;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddNumbersteps extends DriverManager
{
    private final WebDriver driver = DriverManager.getDriver();
    AddNumber addNumber = new AddNumber(driver);

    @Given("^I navigate to BMIintouch page$")
    public void iNavigateToBMIintouchPage()
    {
        addNumber.NavigateBMI();
    }

    @When("^I login with my valid details$")
    public void iLoginWithMyValidDetails()
    {
        addNumber.LoginBMIintouchPage();
    }

    @And("^I click on my  profile button$")
    public void iClickOnMyProfileButton()
    {
        addNumber.ClickOnProfileIcon();
    }

    @And("^I click on edit button$")
    public void iClickOnEditButton()
    {
        addNumber.ClickOnEditButton();
    }

    @And("^I entre number$")
    public void iEntreNumber() {
        addNumber.ClickAddNum();
    }

    @Then("^I save number successfully$")
    public void iSaveNumberSuccessfully() {
        addNumber.SaveButton();
    }
}
