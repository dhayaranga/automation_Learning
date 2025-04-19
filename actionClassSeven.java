package testNGAutomation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class actionClassSeven {
	@Test (priority = 8, retryAnalyzer = retryAnnotation.class)
	public static void retryValidation() {
		assertEquals(false, true);
	}
	@Test (priority = 9)
	public static void retryValidationsTwo() {
		assertEquals(true, true);
	}
}
