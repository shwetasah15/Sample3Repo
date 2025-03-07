package StepDefPkg;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks2 extends Base_demoGuru {
	private static Base_demoGuru base;

	@Before
	public void initBrowser() {
		System.out.println("opening the Browser : Chrome");

		base.driver = new ChromeDriver();
		
	}

	@After
	public void tearBrowser() throws Exception {
		System.out.println("Closing the Browser : chrome");
		base.driver.quit();
	}
}