package testNGAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageObjectModelThree {

	@FindBy(id="mousehover")
	public static WebElement mouseHover;
	@FindBy(xpath = "//*[@id='gf-BIG']")
	public static WebElement footerElement;
}
