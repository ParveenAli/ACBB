package steps;
import com.test_framework.News;
import com.test_framework.Sport;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class SportSteps extends DriverManager
{
    private final  WebDriver driver = DriverManager.getDriver();
    Sport sport = new Sport(driver);


        @When("^I click on Sport$")

         public void iClickonSport()
        {
            sport.ClickSportLink();
        }



        @Then("^I see Sport page successfully$")
         public void iSeeSportPageSuccessfully()
        {
            sport.CheckSportPage();

         }



}
