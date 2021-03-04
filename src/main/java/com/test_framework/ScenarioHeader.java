package com.test_framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ScenarioHeader
{
    WebDriver driver;

    public ScenarioHeader(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.LINK_TEXT, using = "News")
    private WebElement NewLink;
    @FindBy(how = How.LINK_TEXT,using = "Sport")
    private WebElement SportLink;
    @FindBy(how = How.LINK_TEXT,using = "Weather")
    private WebElement WeatherLink;
    @FindBy(how = How.CSS,using = ".e1b8fg8n0>li:nth-child(7)>a")
    private WebElement iPlayer;
    @FindBy(how = How.CSS,using = ".e1b8fg8n0>li:nth-child(8)>a")
    private WebElement SoundLink;
    @FindBy(how = How.CSS,using = ".e1b8fg8n0>li:nth-child(9)>a")
    private WebElement CBBCLink;
    String NewsUrl = "https://www.bbc.co.uk/news";
    String SportUrl = "https://www.bbc.co.uk/sport";
    String WeatherUrl = "https://www.bbc.co.uk/weather";
    String  iPlayerUrl= "https://www.bbc.co.uk/iplayer";
    String  SoundUrl= "https://www.bbc.co.uk/sounds";
    String CbbcUrl = "https://www.bbc.co.uk/cbbc";


    public void ClickLink(String link)
    {
        switch (link)
        {
            case "News": NewLink.click();
            break;
            case "Sport": SportLink.click();
            break;
            case  "Weather":WeatherLink.click();
            break;
            case "iPlayer":iPlayer.click();
            break;
            case "Sound":SoundLink.click();
            break;
            case "CBBC":CBBCLink.click();
            break;
            //case "More": MoreLink.click();
            //break;
            default:System.out.println("Worng");
            break;


        }

    }
    public void CheckPage(String link)
    {
        switch (link)
        {
            case "News":
                String actualNewsUrl= driver.getCurrentUrl();
                assert actualNewsUrl.equals(NewsUrl);
                break;
            case "Sport":
                String actualSportUrl= driver.getCurrentUrl();
                assert actualSportUrl.equals(SportUrl);
                break;
            case  "Weather":
                String actualWeatherUrl= driver.getCurrentUrl();
                assert actualWeatherUrl.equals(WeatherUrl);
                break;
            case "iPlayer":
                String actualiPlayer= driver.getCurrentUrl();
                assert actualiPlayer.equals(iPlayerUrl);
                break;
            case "Sound":
                String actualSoundUrl= driver.getCurrentUrl();
                assert actualSoundUrl.equals(SoundUrl);
                break;
            case "CBBC":
                String actualCbbcUrl= driver.getCurrentUrl();
                assert actualCbbcUrl.equals(CbbcUrl);
                break;
            //case "More":
                //String actualNewsUrl= driver.getCurrentUrl();
                //break;
            default:System.out.println("Worng");
                break;


        }

    }



}
