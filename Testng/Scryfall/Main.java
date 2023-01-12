package Testng.Scryfall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;



public class Main 
{
    WebDriver wd;
    WebDriverWait wait;

    @BeforeClass
    public void setup()
    {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
    }


    //May not be needed since tests can be done in testing tab (looks like a beaker)
    @Test(description = "Do all tests")
    public void doTests()
    {
        //BasicSearch basic = new BasicSearch(wd);
    }


    @AfterClass
    public void close()
    {
        wd.quit();
    }
}
