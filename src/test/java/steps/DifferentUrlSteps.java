package steps;
import com.test_framework.AddNumber;
import com.test_framework.DifferentUrl;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class DifferentUrlSteps

{
    private final WebDriver driver =DriverManager.getDriver();
    DifferentUrl differentUrl=new DifferentUrl(driver);


        @When("^I go to ([^\"]*)$")
        public void DifferentUrlSteps(String link)
        {
            differentUrl.ClickUrl( link);
            Utils.waitForLongTime();
        }


}
