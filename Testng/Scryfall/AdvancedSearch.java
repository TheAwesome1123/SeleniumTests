package Testng.Scryfall;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class AdvancedSearch 
{
    WebDriver wd;

    public AdvancedSearch(WebDriver wd)
    {
        this.wd = wd;
    }    

    //@BeforeMethod
    public void goToAdvSearch()
    {
        wd.get("https://scryfall.com/advanced");
        
    }

    //@Test(description = "Searches all r/w cards")
    public void redWhiteSearch()
    {
        //todo
    }
}
