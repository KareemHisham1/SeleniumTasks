import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class AddUserPage extends BasePage{

    //Locators
    By userRole = By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]");
    By adminOption = By.xpath("//div[@role='option']//span[normalize-space()='Admin']");
    By essOption = By.xpath("//div[@role='option']//span[text()='ESS']");
    By employeeNameField = By.xpath("//input[@placeholder=\"Type for hints...\"]");
    By empNameList = By.className("oxd-autocomplete-dropdown");
    By statusField = By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]");
    By enableOption = By.xpath("//div[@role='listbox']//span[normalize-space()='Enabled']");
    By disabledOption = By.xpath("//div[@role='listbox']//span[normalize-space()='Disabled']");
    By usernameField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By passwordField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\" and @type='password'])[1]");
    By confirmPasswordField = By.xpath("//label[normalize-space()='Confirm Password']/following::input[@type='password'][1]");
    By saveButton = By.xpath("//button[@type='submit']");
    By searchByUsername = By.xpath("//label[normalize-space()='Username']//following::input[@class='oxd-input oxd-input--active']");
    By searchButton = By.xpath("//button[@type='submit']");
    By deleteUserButton = By.xpath("(//button[@type='button' and @class=\"oxd-icon-button oxd-table-cell-action-space\"])[1]");
    By yesDeleteBtn = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost orangehrm-button-margin\"]//following::button[@type='button' ]");
    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");


    public AddUserPage(WebDriver driver){
        super(driver);
    }

    public void addingNewUser() throws InterruptedException {
        AdminTabPage adminObj = new AdminTabPage(driver);
        Actions action = new Actions(driver);
        waitUntilVisible(userRole);
        clickOn(userRole);
        waitUntilVisible(adminOption);
        clickOn(essOption);
        WebElement employeeName = driver.findElement(employeeNameField);
        employeeName.sendKeys("k");
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        clickOn(statusField);
        clickOn(enableOption);
        findElementAndType(usernameField, "KareemKame");
        findElementAndType(passwordField, "123a123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordField)).click();
        findElementAndType(confirmPasswordField, "123a123");
        clickOn(saveButton);
        System.out.println("User is created");
        adminObj.findRecordsNumber();
    }
        public void SearchOnUser() throws InterruptedException {
            AdminTabPage adminObj = new AdminTabPage(driver);
                waitUntilVisible(searchByUsername);
                findElementAndType(searchByUsername, "KareemKame");
                clickOn(searchButton);
            System.out.println("search done");
                wait.until(ExpectedConditions.visibilityOfElementLocated(deleteUserButton)).click();
                clickOn(yesDeleteBtn);
            System.out.println("user deleted");

                driver.navigate().refresh();
                adminObj.findRecordsNumber();

        }

cd

}
