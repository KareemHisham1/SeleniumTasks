import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPage extends BasePage{
    //Locators
    By usernameField = By.xpath("//input[@name='username']");
    By passwordField = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//div//button[@type='submit']");

    public loginPage(WebDriver driver) {
        super(driver);
    }

    //Actions
    public void login(String username , String password){
       wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
       driver.findElement(loginButton).click();
       String currentUrl = driver.getCurrentUrl();
       if(currentUrl.contains("dashboard"))
       {
           System.out.println("You are logged in...");
       }

    }
}
