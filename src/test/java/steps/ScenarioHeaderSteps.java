package steps;
import com.test_framework.ScenarioHeader;
import com.test_framework.Util.DriverManager;
import org.openqa.selenium.WebDriver;



public class ScenarioHeaderSteps
{
    private final  WebDriver driver=DriverManager.getDriver();
    ScenarioHeader scenarioHeader = new ScenarioHeader(driver);

    //@When("^I click ([^\"]*)$")
    public void iClickHeaderlink(String links)
    {
        scenarioHeader.ClickLink(links);
    }

    //@Then("^I see ([^\"]*) page loads$")
    public void iSeeHeaderlinkPageLoads(String links)
    {
        scenarioHeader.CheckPage(links);
    }
}
