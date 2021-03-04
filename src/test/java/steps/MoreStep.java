package steps;
import com.test_framework.*;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class MoreStep extends DriverManager
{
    WebDriver driver = DriverManager.getDriver();
    More more = new More(driver);


        @When("^I click on More$")
         public void iClinkOnMore()
        {
            more.ClickMoreLink();
        }
        @And("^I click on Arts$")
         public void iClickOnArts()
        {
            more.ClickArtsLink();
        }

        @Then("^I see Arts page successfully$")
        public void iSeeArtsPageSuccessfully()
        {more.ArtsPageLoad();
        }
}
