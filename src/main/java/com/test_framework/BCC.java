package com.test_framework;

import com.test_framework.Util.Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class BCC
{
    WebDriver driver;

    public BCC(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.LINK_TEXT,using = "Search")
    private WebElement SearchButton;
    String expectedUrl = "https://www.bbc.co.uk/arts";

    public void ClickonSearch()
    {
        SearchButton.click();
        File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\parve\\IdeaProjects\\TestFramework\\screenshot\\BCCPage.png"));
        }
        catch (IOException e){System.out.println(e.getMessage());}
        Utils.waitForSomeTime();
        /*String currentUrl= driver.getCurrentUrl();
        assert currentUrl.equals(expectedUrl);
        Utils.waitForSomeTime();
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.close();*/


    }

}
