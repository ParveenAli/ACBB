package com.test_framework;

import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BMIheader
{
    WebDriver driver;
    public BMIheader(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.ID,using = "onetrust-accept-btn-handler")
    private WebElement PopCookies;

    @FindBy(how = How.CLASS_NAME,using = "MuiTab-wrapper")
    private WebElement Varmerkevarer;

    @FindBy(how= How.CLASS_NAME,using ="Header-module__Drawer--3CDW3.Header-module__NavDrawer--3oB3G > nav > div > ul > li:nth-child(4) > div > ul > li:nth-child(3) > a")
    private WebElement Icopal;

    @FindBy(how= How.CSS,using = ".Header-module__Drawer--3CDW3.Header-module__NavDrawer--3oB3G > nav > div > ul > li:nth-child(4) > div > ul > li:nth-child(4) > a")
    private WebElement AeroDek;

    @FindBy(how= How.CSS,using = ".Header-module__Drawer--3CDW3.Header-module__NavDrawer--3oB3G > nav > div > ul > li:nth-child(4) > div > ul > li:nth-child(5) > a")
    private WebElement Zanda;

    @FindBy(how= How.CSS,using = ".Header-module__Drawer--3CDW3.Header-module__NavDrawer--3oB3G > nav > div > ul > li:nth-child(4) > div > ul > li:nth-child(6) > a")
    private WebElement Monier;

    @FindBy(how= How.CSS,using = ".Header-module__Drawer--3CDW3.Header-module__NavDrawer--3oB3G > nav > div > ul > li:nth-child(4) > div > ul > li:nth-child(7) > a")
    private WebElement Monarflex;

    String expectedIcopal="https://www.bmigroup.com/no/icopal";
    String expectedAeroDek="https://www.bmigroup.com/no/aerodek";
    String expectedZanda="https://www.bmigroup.com/no/zanda";
    String expectedMonier="https://www.bmigroup.com/no/monier";
    String expectedMonarflex= "https://www.bmigroup.com/no/monarflex";

    public void NavigateFuntion()
    {
        driver.navigate().to("https://bmigroup.com/no");
        Utils.waitForSomeTime();
        PopCookies.click();
    }
    public void ClickonHeader()
    {
        Varmerkevarer.click();
    }
    public void ClickProduct()
    {
        Icopal.click();
        Utils.waitForSomeTime();
        AeroDek.click();
        Utils.waitForSomeTime();
        Zanda.click();
        Utils.waitForSomeTime();
        Monier.click();
        Utils.waitForSomeTime();
        Monier.click();
        Utils.waitForSomeTime();
    }

}
