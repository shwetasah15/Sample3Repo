// package StepDefPkg;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import io.cucumber.java.After;
////import io.cucumber.java.Before;
////import io.cucumber.java.en.And;
////import io.cucumber.java.en.Given;
////import io.cucumber.java.en.Then;
////import io.cucumber.java.en.When;
////
////public class MercuryLoginCode {
////	WebDriver driver;
////	public LoginPage page;
////	
////	@Before
////	public void setup(){
////		System.out.println("The Launching Browser is : Chrome");
////		
////		driver = new ChromeDriver();
////	}
////
////	@Given("^I navigate to login page")
////	public void navigateToLoginPage(){
////		//System.out.println("The Driver name is: " + driver);
////		System.out.println("Navigated to the Login Page");
////		driver.get("https://demo.guru99.com/test/newtours/");
////		//System.out.println(Base.empName);
////	}
//// 
////	@Then("^Its navigated to the home page")
////	public void navigateToHomePage(){
////		//base.driver.findElement(By.linkText("SIGN-OFF")).isEnabled();
////		page = new LoginPage(driver);
////		page.checkSignoff();
////		System.out.println("Navigated to the Home Page");
////	}
////	
////	@And("^I clicked signin button")
////	public void clickSigninButton(){
////		//base.driver.findElement(By.name("submit")).click();
////		page = new LoginPage(driver);
////		page.submit();
////		System.out.println("clicked Submit button");
////		System.out.println("Loged in Successfully");
////	}
////	
////	@When("I insert {string} and {string}")
////	public void i_insert_and(String username, String password) {
////		//base.driver.findElement(By.name("userName")).sendKeys(username);
////		page = new LoginPage(driver);
////		page.getLogin(username, password);
////	    System.out.println("username :" + username);
////	    //base.driver.findElement(By.name("password")).sendKeys(password);
////	    System.out.println("password :" + password);
////	}
////	
////	@After
////	public void Close() {
////		// System.out.println("Environment is closed");
////		// System.out.println("Closing the Browser : chrome");
////		driver.quit();
////	}
////}
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import stepdefpakage.Page1;
//
//public class MercuryLoginCode {
//	
//	WebDriver driver;
//	public Page1 page;
//	
//	@Before
//	public void setup(){
//		System.out.println("The Launching Browser is : Chrome");
//		
//		driver = new ChromeDriver();
//	}
//	@Given("I navigate to login page")
//	public void i_navigate_to_login_page() {
//		System.out.println("The Driver name is: " + driver);
//		System.out.println("Navigated to the Login Page");
//		driver.get("https://demo.guru99.com/test/newtours/");   
//	}
//
//	@When("I clicked flights link")
//	public void i_clicked_flights_link() {
//	    page = new Page1(driver);
//	    page.selectLink();
//	    System.out.println("Clicked the flights link and navigated to flights page");
//	}
//
//	@When("I choose the trip")
//	public void i_choose_the_trip() {
//		page = new Page1(driver);
//		page.selectType();
//		System.out.println("choosen the trip");
//	}
//
//	@And("I choose service class")
//	public void i_choose_service_class() {
//		page = new Page1(driver);
//		page.selectPreferences();
//		System.out.println("choosen the service class");
//	}
//
//	@Then("I clicked on continue Button")
//	public void i_clicked_on_continue_button() {
//		page = new Page1(driver);
//		page.clickContinue();
//		System.out.println("Clicked on continue to proceed further");
//	}
//	
//	@After
//	public void Close() {
//		// System.out.println("Environment is closed");
//		// System.out.println("Closing the Browser : chrome");
//		//driver.quit();
//	}
//}   