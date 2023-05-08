package assignment2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCarWashAndParking {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// Navigate to the demoqa website
		driver.get("https://qa.way.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchPageId")).sendKeys("SFO Airport");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-landing/header/div[1]/div/div[3]/div[6]/ul[1]/li[1]/div/p[1]")).click();
		driver.findElement(By.id("tplparkingsearch")).click();
		Thread.sleep(3000);
		//listing click
		driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-searchpages/app-parking-search/div[1]/div/section[3]/div/div[1]/div/div[1]/picture/img")).click();
		Thread.sleep(3000);
		// scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		driver.findElement(By.xpath("//button[contains(text(),' Add to Bag')][1]")).click();
		Thread.sleep(2000);
		
		driver.navigate().to("https://qa.way.com");
		
		driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-landing/header/div[1]/div/div[3]/div[2]/button[3]")).click();
		Thread.sleep(3000);
		// Search car wash
		driver.findElement(By.id("searchPageId")).sendKeys("San Jose");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-landing/header/div[1]/div/div[3]/div[6]/ul[1]/li[1]/div/p[1]")).click();
		Thread.sleep(2000);
		
		//listing
		driver.findElement(By.xpath("//h2[contains(@class,'lstNm')]/..")).click();
		Thread.sleep(2000);
		
		// scroll down
		JavascriptExecutor ps = (JavascriptExecutor) driver;
		ps.executeScript("window.scrollBy(0,600)", "");
				
		//Add to bag 
		driver.findElement(By.id("prcdtoChckt")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'btn button-submit')]")).click();
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();

	}
}