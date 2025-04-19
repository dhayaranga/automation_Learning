package testNGAutomation;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class actionClassThree extends actionClassTwo {

	@Test(priority=2, enabled= false)
	public static void alertAndConfirmation() {

		PageFactory.initElements(driver, pageObjectModelTwo.class);
		pageObjectModelTwo.alertText.sendKeys("Dhaya");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		pageObjectModelTwo.alertButton.click();
		Alert alertAccept = driver.switchTo().alert();
		alertAccept.dismiss();
		pageObjectModelTwo.confirmButton.click();
		Alert confirmAccept = driver.switchTo().alert();
		confirmAccept.accept();
	}

}
