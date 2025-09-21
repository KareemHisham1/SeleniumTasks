import org.testng.annotations.Test;

public class AllTests extends BaseTest{

    @Test (priority = 1)
    public void login() {
        log.login("Admin", "admin123");
    }
    @Test (priority = 2)
    public void choosingAdminTab(){
        dash.OpenAdminTab();
        }
    @Test (priority = 3)
    public void testingAdminPage(){
        admin.findRecordsNumber();
    }
    @Test (priority = 4)
    public void AddingNewUserTest() throws InterruptedException {
        admin.clickOnAddButton();
        newUser.addingNewUser();
    }
    @Test (priority = 5)
    public void deletingNewUser() throws InterruptedException {
        newUser.SearchOnUser();
    }

}
