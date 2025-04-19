package testNGAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class actionClassFour extends actionsClass {

	@Test(priority = 3, enabled= false)
	public static void tableReading() {
		PageFactory.initElements(driver, pageObjectModelTwo.class);
		String Courseprice = pageObjectModelTwo.priceValue.getText();
		System.out.println("Price of WebSecurity Testing for Beginners-QA knowledge to next leve is : " + Courseprice);
		List<Integer> strToInt = new ArrayList<Integer>();
		Integer a=0;
		for (WebElement Courseamount : pageObjectModelTwo.priceList) {

			String amountTo = Courseamount.getText();
			strToInt.add(Integer.parseInt(amountTo));
		}
		for (Integer b:strToInt) {
			a=a+b;
		}
		System.out.println("Total of all the courses is: "+a);

		int Largest = Collections.max(strToInt);
		System.out.println("Highest Course amount : " + Largest);
		String newXpath = "//td[normalize-space()=" + "\"" + Largest + "\"" + "]//preceding::td[1]";
		WebElement element = driver.findElement(By.xpath(newXpath));
		String HighPaidCourse = element.getText();
		System.out.println("Highest Paid Course is: " + HighPaidCourse);

	}

}
