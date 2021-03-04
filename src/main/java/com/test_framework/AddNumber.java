package com.test_framework;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class AddNumber
{
    WebDriver driver;
    public AddNumber(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(how = How.CLASS_NAME,using = "eu-cookie-compliance-secondary-button")
    private WebElement PopUpCookies;
    @FindBy(how =How.ID,using = "edit-name")
    private WebElement Username;
    @FindBy(how = How.ID,using = "edit-pass")
    private WebElement Password;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement Login;
    @FindBy(how = How.CSS,using = ".company-owner-menu-block-submenus>ul>li.link-profile.has-link>a>span")
    private WebElement ProfileIcon;
    @FindBy(how = How.CSS,using = ".profile-basic-details-edit__edit-button.intouch-edit.inited")
    private WebElement EditButton;
    @FindBy(how = How.ID,using = "edit-user-phone")
    private WebElement AddNum ;
    @FindBy(how = How.ID,using = "edit-submit--2")
    private WebElement SaveButton ;
    String expectedUrl= "https://it.intouch.bmigroup.com/profile/";

    public void NavigateBMI()
    {
        driver.navigate().to("https://it.intouch.bmigroup.com/");
        Utils.waitForSomeTime();
        PopUpCookies.click();
    }
    public void LoginBMIintouchPage()
    {
        Utils.waitForSomeTime();
        //PopUpCookies.click();
        Username.sendKeys("sheetal.samnani+777@bmigroup.com");
        Password.sendKeys("password");
        Login.click();
    }
    public void ClickOnProfileIcon()
    {
      ProfileIcon.click();
      Utils.waitForSomeTime();
    }
    public void ClickOnEditButton()
    {
        EditButton.click();
        Utils.waitForSomeTime();
    }
    public void ClickAddNum()
    {
        AddNum.sendKeys("4444444");
    }
    public void SaveButton()
    {
        SaveButton.click();

    }










}
