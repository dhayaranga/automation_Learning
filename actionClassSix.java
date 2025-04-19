package testNGAutomation;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class actionClassSix extends actionClassFive{
	@Test(priority = 5)
	public static void screenshot() {
		PageFactory.initElements(driver, pageObjectModelThree.class);
		Actions act = new Actions(driver);
		act.moveToElement(pageObjectModelThree.mouseHover).build().perform();
	}
	@Test(priority = 6)
	public static void takeScreenshotAction() throws AWTException, IOException {
		Robot robo = new Robot();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(dim);
		BufferedImage bfi = robo.createScreenCapture(rect);
		File png= new File("D:\\sample.png");
		ImageIO.write(bfi, "png", png);
		
		
	}
	@Test(priority=7)
	public static void fullPageScreenshot() throws IOException {
		Screenshot ss = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		ImageIO.write(ss.getImage(), "png", new File("sample1.png"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(pageObjectModelThree.footerElement));
		System.out.println("Screenshot saved Successfully");
		
	}

}
