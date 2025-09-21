import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver , Duration.ofSeconds(6));
    }
    public void clickOn(By element){
        driver.findElement(element).click();
    }
    public void waitUntilVisible(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public void findElementAndType(By element, String word)
    {
        driver.findElement(element).sendKeys(word);
    }

}
