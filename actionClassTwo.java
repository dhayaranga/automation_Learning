package testNGAutomation;

import java.util.Set;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class actionClassTwo extends actionsClass {
	static String parentWindowName;

	@Test(priority = 0, enabled= false)
	public static void pomExecution() {
		PageFactory.initElements(driver, pageObjectModel.class);
		for (WebElement allcheckboxSelection : pageObjectModel.checkBoxSelection) {
			String checkBoxName = allcheckboxSelection.getDomAttribute("name");
			if (!checkBoxName.equals("checkBoxOption2")) {
				allcheckboxSelection.click();
			}
		}
		pageObjectModel.openWindowButton.click();
		parentWindowName = driver.getWindowHandle();
		Set<String> childWindowsSet = driver.getWindowHandles();
		for (String swtichWindows : childWindowsSet) {
			if (!swtichWindows.equals(parentWindowName)) {
				driver.switchTo().window(swtichWindows);
				System.out.println(driver.getTitle());
				pageObjectModel.coursesTab.click();
				driver.close();
				try {
					driver.switchTo().window(parentWindowName);
					System.out.println(driver.getTitle());
				} catch (NoSuchWindowException e) {
					// TODO: handle exception
				}

			}
		}
	}

	@Test(priority = 1, enabled= false)
	public static void tabswitchValidation() {
		pageObjectModel.subTab.click();
		Set<String> subTab = driver.getWindowHandles();
		for (String switchTab : subTab) {
			if (!switchTab.equals(parentWindowName)) {
				driver.switchTo().window(switchTab);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(parentWindowName);
			}
		}
	}
}
