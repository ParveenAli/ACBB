package com.test_framework;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class AddProject
{
    WebDriver driver;

    public AddProject(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.CSS,using = ".team-menu-link>a>span")
    private WebElement TeamIcon;
    @FindBy(how = How.CSS,using = ".action>div>a")
    private WebElement AddToProjectButton;
    @FindBy(how = How.CLASS_NAME,using = "add-team-member-checkbox")
    private WebElement FlatRoofBox;
    @FindBy(how = How.NAME,using = "op")
    private WebElement AddUserButton;
    @FindBy(how = How.CSS,using = ".team-member-profile-block--project-actions>a")
    private WebElement RemoveFromProject;
    @FindBy(how = How.CSS,using = ".remove-installer-yes-button")
    private WebElement RemoveUser;
    @FindBy(how = How.CSS,using = ".button-group>a")
    private WebElement DoneButton;
    String expectedUrl = "https://it.intouch.bmigroup.com/en/team/1542";

    public void ClickTeamIcon()
    {
        TeamIcon.click();
        Utils.waitForSomeTime();
    }
    public void ClickAddtoProjectIcon()
    {
        AddToProjectButton.click();
        Utils.waitForSomeTime();
    }
    public void ClickFlatRoof()
    {
        FlatRoofBox.click();
        Utils.waitForSomeTime();
    }
    public void ClickAddUserButton()
    {
        AddUserButton.click();
        Utils.waitForSomeTime();
        String currentUrl= driver.getCurrentUrl();
       assert currentUrl.equals(expectedUrl);


    }
    public void ClickRemoveFromProject()
    {
        Utils.waitForSomeTime();
        RemoveFromProject.click();
        Utils.waitForSomeTime();
        RemoveUser.click();
        DoneButton.click();

    }
   // public void ClickRemoveUser()
   // {

    //}
    //public void ClickDoneButton()
   // {

    //}

}


