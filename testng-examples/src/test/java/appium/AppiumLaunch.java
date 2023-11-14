package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppiumLaunch {
	public static final String AUTOMATE_USERNAME = "alvinkaecabato_Avn8dc";
	public static final String AUTOMATE_ACCESS_KEY  = "JJPHDKxYzHu68nd6MVS7";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	AndroidDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Samsung Galaxy S21");
		caps.setCapability("os_version", "12.0");
		caps.setCapability("Project", "API demo App automation");
		caps.setCapability("build", "ANDROID");
		caps.setCapability("name", "Sample Test");
		caps.setCapability("app", "bs://f53d645f40081a14e4bea459fcbc68291f4291d8");
		WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
	}
	
	@Test
	public void clickOnPreference() {
		driver.findElement(ByAccessibilityId.accessibilityId("Preference")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(ByAccessibilityId.accessibilityId("Views")).click();
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
}