package com.test_framework;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class DifferentUrl
{
    WebDriver driver;

    public DifferentUrl(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    String itPage = "https://it.intouch.bmigroup.com/";
    String plPage = "https://pl.intouch.bmigroup.com/";
    String ukPage = "https://uk.intouch.bmigroup.com/";
    String dkPage = "https://dk.intouch.bmigroup.com/";
    String fiPage = "https://fi.intouch.bmigroup.com/";
    String noPage ="https://no.intouch.bmigroup.com/";
    String myPage ="https://my.intouch.bmigroup.com/";
    String esPage = "https://es.intouch.bmigroup.com/";
    String sePage = "https://se.intouch.bmigroup.com/";
    String dePage = "https://de.intouch.bmigroup.com/";


    public void ClickUrl(String lINK)
    {
        switch (lINK)
        {
            case "it": driver.get(itPage);
            break;
            case "pl": driver.get(plPage);
            break;
            case "uk": driver.get(ukPage);
            break;
            case "dk" : driver.get(dkPage);
            break;
            case "fi" : driver.get(fiPage);
            break;
            case "no": driver.get(noPage);
            break;
            case  "my": driver.get(myPage);
            break;
            case "es": driver.get(esPage);
            break;
            case "se": driver.get(sePage);
            break;
            case  "de": driver.get(dePage);
            break;
            default: System.out.println("wrong url");
            break;
        }
    }

}
