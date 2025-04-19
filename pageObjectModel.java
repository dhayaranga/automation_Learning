package testNGAutomation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class pageObjectModel {
	@FindBy(xpath="//input[@value='radio1']")
	public static WebElement radioButton1;
	@FindBy(id="autocomplete")
	public static WebElement AutoComplete;
	@FindBy(xpath="//ul[@id='ui-id-1']/li/div")
	public static List<WebElement> listOfCountries;
	@FindBy(id="dropdown-class-example")
	public static WebElement clickList;
	@FindBy(xpath="//input[@type='checkbox']")
	public static List<WebElement> checkBoxSelection;
	@FindBy(id="openwindow")
	public static WebElement openWindowButton;
	@FindBy(xpath="//a[text()='Courses']")
	public static WebElement coursesTab;
	@FindBy(id="opentab")
	public static WebElement subTab;
}
