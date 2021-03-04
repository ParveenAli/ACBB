package steps;
import com.test_framework.BCC;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class BCCSteps extends DriverManager
{
    WebDriver driver=DriverManager.getDriver();
    BCC bcc=new BCC(driver);

    @And("^I click on search$")
    public void iClickOnSearch()
    {
        bcc.ClickonSearch();
    }
}
