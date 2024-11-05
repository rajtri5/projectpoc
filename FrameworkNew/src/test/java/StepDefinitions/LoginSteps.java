package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {
	private RegistrationPage rp;
    private WebDriver driver;
    
    @Given("user is in application")
    public void user_is_in_application() {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://magento.softwaretestingboard.com/");
    	rp = new RegistrationPage(driver);
    }

    @Given("User is in Log in Page")
    public void user_is_in_log_in_page() throws Exception {
        rp.openRegistrationPage();
    }

    @When("User put valid id and password {string} and {string}")
    public void user_put_valid_id_and_password(String firstName, String lastName) throws InterruptedException {
    	Thread.sleep(2000);
        rp.enterFirstName(firstName);	
        rp.enterLastName(lastName);
    }

    @And("User put valid emailid and password {string} and {string} and {string}")
    public void user_put_valid_emailid_and_password_and_confirmpassword(String email, String password, String confirmPassword) {
        rp.enterEmail(email);
        rp.enterPassword(password);
        rp.confirmPassword(confirmPassword);
    }

    @And("User clicks on log in button")
    public void user_clicks_on_log_in_button() {  
        rp.submitForm();
    }

    

	@Then("User should be on Home Page")
    public void user_should_be_on_home_page() {
        boolean isDisplayed = rp.successfullydisplayed.isDisplayed();
        assert isDisplayed : "User is not on the Home Page";
    }

    @Given("User is in Signin Page")
    public void user_is_in_signin_page() {
    	rp.clickSignIn();
    }

    @When("User put valid emailid and password {string} and {string}")
    public void user_put_valid_emailid_and_password(String emailid, String password) {
        rp.enterEmail(emailid);
        rp.enterPassword(password);
    }
    
    @When("User put valid emailid and password {string} and {string} in SignIn Page")
    public void user_put_valid_emailid_and_password_in_signin_page(String emailid, String password) {
        rp.enterEmailSignIn(emailid);
        rp.enterPasswordSignIn(password);
    }
    
    @And("User clicks on sign in button")
    public void user_clicks_on_sign_in_button() {  
        rp.SignIn();
    }
    
    @Then("User should successfully loged in")
    public void user_should_successfully_logedin() throws InterruptedException {
    	Thread.sleep(2000);
    	rp.succefullyloggedintitle.isDisplayed();
    }


    @Then("User closes the browser")
    public void user_closes_the_browser() {
            driver.quit();
    }
}
