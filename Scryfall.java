import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Scryfall {
    WebDriver webDriver;
    String rulesText;
    String[] cardColors;

    public Scryfall(WebDriver webDriver, String rulesText, String[] cardColors) {
        this.webDriver = webDriver;
        this.rulesText = rulesText;
        this.cardColors = cardColors;
    }
    public void testScryfall() {
        goToHomePage();
        goToAdvancedPage();
        enterRulesText();
        selectColors();
        startSearch();
        testSimpleSearch();
    }

    public void goToHomePage() {
            this.webDriver.get("https://scryfall.com/");
            System.out.println(this.webDriver.getTitle());
            waitInSecs(1);
    }

    public void goToAdvancedPage() {
        this.webDriver.get("https://scryfall.com/advanced");
        waitInSecs(1);
    }

    public void enterRulesText() {
        WebElement rulesTextBox = webDriver.findElement(By.id("oracle"));
        rulesTextBox.sendKeys(this.rulesText);
    }

    public void selectColors() {
        // What colors to use.
        for(int i = 0; i < this.cardColors.length; i++) {
            WebElement colorBox = webDriver.findElement(By.cssSelector("input[value='" + 
            this.cardColors[i] + "'][data-group='color']"));
            colorBox.click();
            waitInSecs(1);
        }

        // Filtering.
        Select colorFilter = new Select(webDriver.findElement(By.id("color_comparison")));
        colorFilter.selectByIndex(0);
    }

    public void startSearch () {
        WebElement searchButton = webDriver.findElement(By.xpath("//*[@id=\"main\"]/form/div/div[18]/button"));
        searchButton.click();
        waitInSecs(1);
    }

    public void testSimpleSearch() {    
        WebElement searchEngine = webDriver.findElement(By.className("header-search-field"));
        searchEngine.clear();
        searchEngine.sendKeys("Emmara");
        searchEngine.sendKeys(Keys.RETURN);
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
