package com.test_framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  org.openqa.selenium.support.How;
import com.test_framework.Util.DriverManager;

public class Sport
{
    WebDriver driver;

    public Sport(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
     @FindBy(how = How.LINK_TEXT,using = "Sport")
    private WebElement SportLink;
    @FindBy(how = How.CLASS_NAME, using = "sp-c-global-header__inner")
    private  WebElement SportPageLoad;

    public  void ClickSportLink()
    {
        SportLink.click();
    }
    public  void CheckSportPage()
    {
        assert SportPageLoad.isDisplayed();
    }







}
