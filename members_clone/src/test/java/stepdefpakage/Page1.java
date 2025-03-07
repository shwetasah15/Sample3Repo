package stepdefpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1 {
	WebDriver driver;
	public Page1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By flight = By.linkText("Flights");
	By triptype = By.xpath("//input[@value='roundtrip']");
	By preferences = By.xpath("//input[@value='First']");
	By ContinueBtn = By.name("findFlights");
	
	public void selectLink() {
		driver.findElement(flight).click();
	}
	
	public void selectType() {
		driver.findElement(triptype).click();
	}
	
	public void selectPreferences() {
		driver.findElement(preferences).click();
	}
	
	public void clickContinue() {
		driver.findElement(ContinueBtn).click();
	}

}