package StepDefPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class demoGuruTC1 {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on Rediff login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // Corrected login URL
        loginPage = new LoginPage(driver);
    }

    @When("User enters {string} and {string}")
    public void user_enters_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("Clicks on Sign In button")
    public void click_sign_in() {
        loginPage.clickSignIn();
    }

    @Then("User should be logged in")
    public void verify_login() {
        boolean isLoggedIn = driver.getCurrentUrl().contains("https://mail.rediff.com/cgi-bin/login.cgi");
        if (isLoggedIn) {
            System.out.println("Login failed! Incorrect credentials.");
        } else {
            System.out.println("Login successful!");
        }
        driver.quit();
    }

}
