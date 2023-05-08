package assignment2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchPageId = By.id("searchPageId");
	By searchButton = By.id("tplparkingsearch");
	
	public void sendSearchText() {
		driver.findElement(searchPageId).sendKeys("San Francisco");
	
	}
	
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}
}
