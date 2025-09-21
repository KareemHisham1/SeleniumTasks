import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {
    //Locators
    By adminTab = By.xpath("//span[text()='Admin']");

    public DashboardPage(WebDriver driver){
        super(driver);
    }
     public void OpenAdminTab(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(adminTab)).click();
         System.out.println("Admin tab is clicked...");
     }
}
