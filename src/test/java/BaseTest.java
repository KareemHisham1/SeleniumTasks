import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    loginPage log;
    DashboardPage dash;
    AdminTabPage admin;
    AddUserPage newUser;
    private String url = "https://opensource-demo.orangehrmlive.com/";

    @BeforeTest
    public void OpenHomePage() {
        driver = new ChromeDriver();
        log = new loginPage(driver);
        dash = new DashboardPage(driver);
        admin = new AdminTabPage(driver);
        newUser = new AddUserPage(driver);
        driver.manage().window().maximize();
        driver.get(url);

    }

/*    @AfterTest
    public void tearDown(){
        driver.quit();
    }*/
}
