package steps;
import com.test_framework.AddNumber;
import com.test_framework.AddProject;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class AddProjectSteps extends DriverManager
{
    private final  WebDriver driver=DriverManager.getDriver();
    AddProject addProject = new AddProject(driver);

    @And("^I click on team icon$")
    public void iClickOnTeamIcon()
    {
        addProject.ClickTeamIcon();
    }

    @And("^I click on add project$")
    public void iClickOnAddProject()
    {
        addProject.ClickAddtoProjectIcon();
    }

    @And("^I click on flat roof box$")
    public void iClickOnFlatRoofBox()
    {
        addProject.ClickFlatRoof();
    }


    @Then("^I user is added successfully$")
    public void iUserIsAddedSuccessfully()
    {

        addProject.ClickAddUserButton();
        addProject.ClickRemoveFromProject();
        //ClickRemoveUser();
       // addProject.ClickDoneButton();
    }
}
