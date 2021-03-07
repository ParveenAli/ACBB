package steps;

import com.test_framework.BMIheader;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class BMIheaderSteps extends DriverManager
{
    private  final WebDriver driver =DriverManager.getDriver();
    BMIheader bmIheader=new BMIheader(driver);

    @Given("^I navigate to BMI page$")
    public void iNavigateToBMIPage()
    {
        bmIheader.NavigateFuntion();
    }

    @When("^I click on Våre merkevarer$")
    public void iClickOnVåreMerkevarer()
    {
        bmIheader.ClickonHeader();


    }

    @Then("^I click on different products$")
    public void iClickOnDifferentProducts()
    {
        bmIheader.ClickProduct();

    }




}
