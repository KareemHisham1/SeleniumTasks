import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminTabPage extends BasePage{

    By numOfRecords = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span[@class='oxd-text oxd-text--span']");
    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public AdminTabPage(WebDriver driver){
        super(driver);
    }
    public int findRecordsNumber(){
        String Records = wait.until(ExpectedConditions.visibilityOfElementLocated(numOfRecords)).getText();
        String numberOnly = Records.replaceAll("[^0-9]", ""); // يخليها "57"
        System.out.println("There are: " + numberOnly + " records in the admin tab page.");
        return Integer.parseInt(numberOnly);
    }
    public void clickOnAddButton(){
        driver.findElement(addButton).click();
    }
}
