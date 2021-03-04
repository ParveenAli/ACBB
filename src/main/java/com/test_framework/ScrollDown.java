package com.test_framework;
import com.test_framework.Util.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ScrollDown
{
    WebDriver driver;

    public ScrollDown(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(how = How.LINK_TEXT,using = "About the BBC")
    private WebElement AboutBcc;
    String expectedUrl = "https://www.bbc.co.uk/aboutthebbc";

   public void ScrollPage()
    {
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)");
        Utils.waitForSomeTime();
        //JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("window.scrollBy(0,250)", "");

        //driver.manage().window().maximize();
        //Thread.sleep(5000);
        //((JavascriptExecutor)driver).executeScript("windows.scroll(0,400)");

    }
    public void ClickAboutTheBCC()
    {
        AboutBcc.click();
        Utils.waitForSomeTime();
        String currentUrl= driver.getCurrentUrl();
        assert currentUrl.equals(expectedUrl);

    }




}
