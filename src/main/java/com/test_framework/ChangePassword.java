package com.test_framework;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ChangePassword
{
    WebDriver driver;

    public ChangePassword(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.CSS,using = ".eu-cookie-compliance-secondary-button")
    private WebElement PopUpCookies;
    @FindBy(how = How.ID,using = "edit-name")
    private WebElement Username;
    @FindBy(how = How.ID,using = "edit-pass")
    private WebElement Password;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement LoginButton ;
    //@FindBy(how = How.ID,using = "popup-buttons")
    //private WebElement PopCookies;
    @FindBy(how = How.CSS,using = ".installer-menu-block-submenus>ul>li")
    private WebElement ProfileIcon;
    @FindBy(how = How.ID,using = "edit-current-pass")
    private WebElement CurrentPassword;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement ChangePasswordButton;
    @FindBy(how = How.ID,using = "edit-pass-pass1")
    private WebElement NewPassword1 ;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement ContinueButton;
    @FindBy(how = How.ID,using = "edit-pass-pass2")
    private WebElement ConfirmPassword;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement SavePassword;
    String expectedUrl = "https://uk.intouch.bmigroup.com/user/login";

     public void NavigateBMI()
     {
         driver.navigate().to("https://uk.intouch.bmigroup.com/");
         Utils.waitForSomeTime();



     }
     public void LoginBMI()
     {
         Utils.waitForSomeTime();
         PopUpCookies.click();
         Username.sendKeys("sheetal.samnani+5@bmigroup.com");
         Password.sendKeys("password");
         LoginButton.click();
         Utils.waitForSomeTime();
         Utils.waitForSomeTime();

     }
     public void ClickProfile()
     {
         ProfileIcon.click();
     }
     public void ChangePassword()
     {
         CurrentPassword.sendKeys("password");
         ChangePasswordButton.click();
         Utils.waitForSomeTime();
         NewPassword1.sendKeys("password1");
         ContinueButton.click();
         Utils.waitForSomeTime();
         ConfirmPassword.sendKeys("password1");
         SavePassword.click();
         Utils.waitForSomeTime();

     }
     public void CheckLoginPage()
     {
        Utils.waitForSomeTime();
       String currentUrl= driver.getCurrentUrl();
       assert currentUrl.equals(expectedUrl);

     }
     public void Cleardata()
     {
        Username.sendKeys("sheetal.samnani+5@bmigroup.com");
        Password.sendKeys("password1");
        LoginButton.click();
        Utils.waitForSomeTime();
        ProfileIcon.click();
        CurrentPassword.sendKeys("password1");
        ChangePasswordButton.click();
        NewPassword1.sendKeys("password");
        ContinueButton.click();
        ConfirmPassword.sendKeys("password");
        SavePassword.click();
        Utils.waitForSomeTime();
     }







}

