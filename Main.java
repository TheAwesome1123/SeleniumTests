import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws Exception {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        String rulesText = "Token";
        String[] colors = {"W", "U", "B", "R", "G"};
        Scryfall scryfall = new Scryfall(webDriver, rulesText, colors);
        Italeri italeri = new Italeri(webDriver);

        scryfall.testScryfall();
        scryfall.waitInSecs(2);
        
        italeri.testItaleri();
        italeri.waitInSecs(2);
        webDriver.quit();

    }

    
}

