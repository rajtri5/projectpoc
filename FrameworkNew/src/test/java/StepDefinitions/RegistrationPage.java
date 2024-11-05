package StepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Create an Account')]")
    WebElement createAccountLink;

    @FindBy(xpath = "//input[@id ='firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id = 'lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id = 'email_address']")
    WebElement emailAddressField;

    @FindBy(xpath = "//input[@id = 'password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@title='Create an Account']")
    WebElement createAccountButton;

    @FindBy(xpath = "//div[contains(text(),\"There is already an account with this email address. If you are sure that it is your email address, \")]")
    WebElement successfullydisplayed;

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement siginin;

    @FindBy(xpath = "//input[@type ='email' and @class='input-text' and @title='Email']")
    WebElement title;

    @FindBy(xpath = "//input[@type ='password' and @class='input-text' and @title='Password']")
    WebElement password;

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement signin;
    
    @FindBy(xpath = "//input[@id = 'email']")
    WebElement emailSignIn;
    
    @FindBy(xpath = "//input[@id = 'pass']")
    WebElement passwordSignIn;
    
    @FindBy(xpath = "(//button/span[text()='Sign In'])[1]")
    WebElement submit;
    
    @FindBy(xpath = "(//span[contains(text(),'Welcome, rajat tripathy!')])[1]")
    WebElement succefullyloggedintitle;

    
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   
    public void openRegistrationPage() {
        createAccountLink.click();
        
    }

    public void enterFirstName(String firstName) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",this.firstName );
        this.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", this.lastName);
        this.lastName.sendKeys(lastName);
    }

    public void enterEmail(String email) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", emailAddressField);
        emailAddressField.sendKeys(email);
    }

    public void enterPassword(String password) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", passwordField);
        passwordField.sendKeys(password);
    }

    public void confirmPassword(String password) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", confirmPasswordField);
        confirmPasswordField.sendKeys(password);
    }

    public void submitForm() {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);", createAccountButton);
        createAccountButton.click();
    }
    
    public void clickSignIn() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",this.signin );
        this.signin.click();
    }
    
    public void enterEmailSignIn(String email) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", emailSignIn);
        emailSignIn.sendKeys(email);
    }
    
    public void enterPasswordSignIn(String email) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", passwordSignIn);
        passwordSignIn.sendKeys(email);
    }
    
    public void SignIn() {
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submit);
        submit.click();
   }
    
   public void user_should_successfully_logedin() {
    	succefullyloggedintitle.isDisplayed();
   }
}



