package steps;
import com.test_framework.AddNumber;
import com.test_framework.AddProject;
import com.test_framework.Link;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;



public class LinkSteps
{
    private final  WebDriver driver=DriverManager.getDriver();
    Link link = new Link(driver);

    @And("^I clickmieilink$")
    public void iClickmieilink()
    {
        link.ClickLinks();

    }

    @And("^I clickappBMIRoofPro$")
    public void iClickappBMIRoofPro()
    {
        link.ClickAppBMIRoofPro();
    }

    @Then("^I see BMIRoofPro page successfully$")
    public void iSeeBMIRoofProPageSuccessfully()
    {
        link.CheckPageLoad();
    }
}
