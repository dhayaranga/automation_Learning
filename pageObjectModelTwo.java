package testNGAutomation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageObjectModelTwo{
		
		@FindBy(xpath="//input[@id='name']")
		public static WebElement alertText;
		@FindBy(id="alertbtn")
		public static WebElement alertButton;
		@FindBy(id="confirmbtn")
		public static WebElement confirmButton;
		@FindBy(xpath="//td[normalize-space()='WebSecurity Testing for Beginners-QA knowledge to next level']//following::td[1]")
		public static WebElement priceValue;
		@FindBy(xpath="(//table[@id='product'])[1]//td[3]")
		public static List<WebElement> priceList;
		@FindBy(xpath="//table[@id='product']/following::td")
		public static List<WebElement> tableTwoNames;
		
}
