import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Italeri {
    WebDriver webDriver;
    
    public Italeri(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void testItaleri() {
        goToHomePage();
        testSearch();
    }

    public void goToHomePage() {
        this.webDriver.get("https://www.italeri.com/en");
        System.out.println(this.webDriver.getTitle());
        waitInSecs(1);

    }

    public void testSearch() {
        WebElement aircraftButton = this.webDriver.findElement(By.xpath("//*[@id=\"pagina\"]/div[2]/div/a[1]"));
        aircraftButton.click();
        waitInSecs(1);

        WebElement oneFourtyEighthButton = 
        this.webDriver.findElement(By.xpath("//*[@id=\"modalContentScala\"]/div[2]/div/div[2]/a"));

        oneFourtyEighthButton.click();
        waitInSecs(1);
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
