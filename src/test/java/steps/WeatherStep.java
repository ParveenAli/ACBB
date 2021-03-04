package steps;
import com.test_framework.*;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;



public class WeatherStep extends DriverManager
{
    WebDriver driver = DriverManager.getDriver();
    Weather weather = new Weather(driver);

    @When("^I click on weather$")
    public void iClickOnWeather()
    {
        weather.ClickWeatherLink();
    }

    @Then("^I see weather page successfully$")
    public void iSeeWeatherPageSuccessfully()
    {
        weather.CheckWeatherPage();
    }

}
