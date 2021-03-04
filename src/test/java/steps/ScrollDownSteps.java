package steps;
import com.test_framework.AddNumber;
import com.test_framework.AddProject;
import com.test_framework.ScenarioHeader;
import com.test_framework.ScrollDown;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;



public class ScrollDownSteps
{
    private final  WebDriver driver = DriverManager.getDriver();
    ScrollDown scrollDown = new ScrollDown(driver);


    @When("^I scrolldown$")
    public void iScrolldown()
    {
        scrollDown.ScrollPage();
    }

    @Then("^About the BCC page successful$")
    public void aboutTheBCCPageSuccessful()
    {
        scrollDown.ClickAboutTheBCC();
    }
}
