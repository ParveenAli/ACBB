package com.test_framework;
import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import javax.swing.text.html.parser.Element;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;


public class Link
{
    WebDriver driver;

    public Link(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.CSS,using = ".logged-in__header-wrapper>div>div>div>div>div>div>div>a")
    private WebElement MieiLink;
    @FindBy(how = How.CSS,using = ".reward-links-popup-content--links > a:nth-child(1)")
    private WebElement AppBmiRoofPro;
    String expectedUrl = "http://it.merits.bmigroup.com/utenti/login";



    public void ClickLinks ()
    {
        MieiLink.click();
        Utils.waitForSomeTime();

    }
    public void ClickAppBMIRoofPro()
    {
        AppBmiRoofPro.click();
        Utils.waitForSomeTime();

    }
    public void CheckPageLoad()
    {


          //String currentUrl = driver.getCurrentUrl();
        //assert currentUrl.equals(expectedUrl);
        //driver.get("http://it.merits.bmigroup.com/utenti/login");

       /* driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
        Utils.waitForSomeTime();
        driver.close();
        driver.switchTo().window("http://it.merits.bmigroup.com/utenti/login");
        Utils.waitForSomeTime();*/
        Utils.waitForSomeTime();
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        String currentUrl= driver.getCurrentUrl();
        assert currentUrl.equals(expectedUrl);
        driver.close();








    }


}
