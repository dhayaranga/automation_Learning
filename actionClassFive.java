package testNGAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class actionClassFive extends actionClassFour{
	
	@Test(priority = 4, enabled = false)
	public static void secondTableHandling() {
		PageFactory.initElements(driver, pageObjectModelTwo.class);
		String s1="Ivory";
		String s2;
		for (WebElement ResourceName : pageObjectModelTwo.tableTwoNames) {
			if(ResourceName.getText().equals(s1)) {
				s2="//table[@id='product']/following::td[text()='" + s1 + "']/following-sibling::td[2]";
				WebElement locationOfResource = driver.findElement(By.xpath(s2));
				String Location = locationOfResource.getText();
				System.out.println("Location of the resource is : "+ Location);
			}
		}
	}

}
