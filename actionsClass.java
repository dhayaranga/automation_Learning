package testNGAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class actionsClass {
	static WebDriver driver;

	@Test
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		PageFactory.initElements(driver, pageObjectModel.class);
		pageObjectModel.radioButton1.click();
		pageObjectModel.AutoComplete.sendKeys("ind");

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfAllElements(pageObjectModel.listOfCountries));
		for (WebElement countries : pageObjectModel.listOfCountries) {
			if (countries.getText().equals("India")) {
				countries.click();
			}
		}
		Select select = new Select(pageObjectModel.clickList);
		select.selectByVisibleText("Option2");
	}

	@AfterTest
	public static void browserClose() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
