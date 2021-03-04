package com.test_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  org.openqa.selenium.support.How;
import com.test_framework.Util.DriverManager;


public class More
{
    public WebDriver driver;
    public More (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.LINK_TEXT,using = "More")
    private WebElement MoreLink;
    @FindBy(how = How.LINK_TEXT,using = "Arts")
    private WebElement ArtsLink;
    @FindBy(how = How.CLASS_NAME,using = "baseplate-global-header__link")
    private WebElement ArtsPageLoad;

    public void ClickMoreLink()
    {
        MoreLink.click();
    }
    public void ClickArtsLink()
    {
        ArtsLink.click();
    }
    public void ArtsPageLoad()
    {
        ArtsPageLoad.isDisplayed();
    }
}
