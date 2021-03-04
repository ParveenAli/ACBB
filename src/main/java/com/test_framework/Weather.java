package com.test_framework;

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

public class Weather
{
    public WebDriver driver;

    public Weather(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.LINK_TEXT,using = "Weather")
     private WebElement WeatherLink;
    @FindBy(how = How.CLASS_NAME, using = "wr-c-weather-logo__svg")
    private  WebElement WeatherPageLoad;

    public void ClickWeatherLink()
    {
        WeatherLink.click();
        File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\parve\\IdeaProjects\\TestFramework\\screenshot\\WeatherPage.png"));
        }
        catch (IOException e){System.out.println(e.getMessage());}


    }




    public void CheckWeatherPage()
    {
        assert WeatherPageLoad.isDisplayed();
    }
}


