package com.test_framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  org.openqa.selenium.support.How;

public class News
{
    WebDriver driver;
    public News(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,  this);
    }
    @FindBy(how = How.LINK_TEXT, using = "News")
    private WebElement NewLink;
    @FindBy(how = How.CLASS_NAME,using = "nw-o-news-branding")
    private  WebElement NewsPageLoad;

    public void ClickNewsLink()
    {
        NewLink.click();
    }

    public void CheckNewsPage()
    {
        assert NewsPageLoad.isDisplayed();
    }











}
