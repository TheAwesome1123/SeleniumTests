import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Italeri {
    WebDriver webDriver;
    
    public Italeri(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void testItaleri() {
        goToHomePage();
        testModelSelection();
        testSelectingProduct();
        testSearch();
    }

    public void goToHomePage() {
        this.webDriver.get("https://www.italeri.com/en");
        System.out.println(this.webDriver.getTitle());

        WebElement closeCookieWindowButton = this.webDriver.findElement(By.className("iubenda-cs-close-btn"));
        closeCookieWindowButton.click();
        waitInSecs(1);

    }

    public void testModelSelection() {
        WebElement aircraftButton = this.webDriver.findElement(By.xpath("//*[@id=\"pagina\"]/div[2]/div/a[1]"));
        aircraftButton.click();
        waitInSecs(1);

        WebElement oneFourtyEighthButton = 
        this.webDriver.findElement(By.xpath("//*[@id=\"modalContentScala\"]/div[2]/div/div[2]/a"));

        oneFourtyEighthButton.click();
        waitInSecs(1);
    }


    public void testSelectingProduct() {
        WebElement spitfire = 
        this.webDriver.findElement(By.xpath("//*[@id=\"catalogo\"]/div/div[6]/div/div/div[1]/a"));

        WebElement phantom = 
        this.webDriver.findElement(By.xpath("//*[@id=\"catalogo\"]/div/div[2]/div/div/div[1]/a"));

        Actions actions = new Actions(this.webDriver);
        actions.moveToElement(phantom).click().perform();
        waitInSecs(2);
    }

    public void testSearch() {
        WebElement searchEngine = 
        this.webDriver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/ul/li[1]"));

        searchEngine.click();
    }
    public void waitInSecs(int seconds)
    {
        try
        {
            Thread.sleep(seconds * 1000);
        }
        catch (InterruptedException ie)
        {
            System.out.println("Interrupted e");
        }
    }
}
