package Testng.Scryfall;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasicSearch 
{
    WebDriver wd;
    
    public BasicSearch(WebDriver wd)
    {
        this.wd = wd;
    }


    //@BeforeMethod(description = "Go to home page as start")
    public void goToHome()
    {
        wd.get("https://scryfall.com/");
    }

    //@Test(description = "Returns all cards with r/w watermark")
    public void borosWmTest()
    {
        //todo
    }

    //@AfterMethod(description = "Make sure browser still on website")
    //Can't think of a "global" assertion beyond this as of now
    public void assertAtScryfall()
    {
        Boolean atScryfall = wd.getCurrentUrl().contains("https://scryfall.com/");
        Assert.assertEquals(atScryfall, true);
    }
}
