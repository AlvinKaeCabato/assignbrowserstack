package com.browserstack;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class AppiumTest {
	String userName = System.getenv("BROWSERSTACK_USERNAME");
	String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
	String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
	String buildName = System.getenv("BROWSERSTACK_BUILD_NAME");
	String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
	String app = System.getenv("BROWSERSTACK_APP_ID");
    public AndroidDriver driver;

    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
    	/*
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("app", app);
        caps.setCapability("device", "Samsung Galaxy S21");
        caps.setCapability("build", buildName);
        driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
    	*/
    	System.out.println("HERE_-------------------------->>>: " + buildName);
    	System.out.println("HERE_-------------------------->>>: ");System.out.println("HERE_-------------------------->>>: ");
    	System.out.println("HERE_-------------------------->>>: ");
    	System.out.println("HERE_-------------------------->>>: ");
    	System.out.println("HERE_-------------------------->>>: ");
    	System.out.println("HERE_-------------------------->>>: ");
    	System.out.println("HERE_-------------------------->>>: ");
    	System.out.println("HERE_-------------------------->>>: ");
    	System.out.println("HERE_-------------------------->>>: ");
    	
        MutableCapabilities capabilities = new UiAutomator2Options();
		capabilities.setCapability("deviceName", "Samsung Galaxy S21");
		capabilities.setCapability("os_version", "12.0");
		capabilities.setCapability("Project", "API demo App automation");
		capabilities.setCapability("build", buildName);
		capabilities.setCapability("name", "Sample Test");
        capabilities.setCapability("app", "bs://f53d645f40081a14e4bea459fcbc68291f4291d8");
        driver = new AndroidDriver(new URL("http://alvinkaecabato_Avn8dc:JJPHDKxYzHu68nd6MVS7@hub-cloud.browserstack.com/wd/hub"),capabilities);
        /*
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setUdid("RF8N403BDGA");
		options.setCapability("appium:appPackage","io.appium.android.apis");
		options.setCapability("appium:appActivity","io.appium.android.apis.ApiDemos");
		options.setCapability("platformName", "Android");
		options.setCapability("appium:platformVersion", "12");
		options.setCapability("appium:automationName","uiautomator2");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		*/
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
    //----Generic
    
	public void navigateBack() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	public String getText(WebElement ele) {
		return ele.getText();
	}
	
	public void typeText(WebElement ele, String s) {
		ele.sendKeys(s);
	}
    
    //----Main Menu
	public WebElement mainAccessibilityA() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Accessibility")));
	}
	public WebElement mainViews() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Views")));
	}
	
	public WebElement mainAccessibilityB() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Access'ibility")));
	}
	
	public WebElement mainAnimation() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Animation")));
	}
	
	public WebElement mainApp() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("App")));
	}
	
	public WebElement mainContent() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Content")));
	}
	
	public WebElement mainGraphics() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Graphics")));
	}
	
	public WebElement mainMedia() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Media")));
	}
	
	public WebElement mainNfc() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("NFC")));
	}
	
	public WebElement mainOs() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("OS")));
	}
	public WebElement mainPreference() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Preference")));
	}
	
	public WebElement mainText() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text")));
	}
	//------------------------------------------Access'ibility
	
	public WebElement accessNodeProvider() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Accessibility Node Provider")));
	}
	
	
	public WebElement accessNodeQuerying() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Accessibility Node Querying")));
	}
	
	public WebElement accessService() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Accessibility Service")));
	}
	
	public WebElement accessCustomView() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Accessibility Custom View")));
	}
	
	//--------------------------------------------Views
	public WebElement viewsWebView() {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("WebView")));
	}
	
	//------------------------------------------Gestures
	public  void longPressAction(WebElement e) {
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)e).getId(),"duration",2000));
		
	}
	public void scrollToText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text.trim()+"\"))"));
		
	}
	
	public void androidScrollGesture() {
		boolean canScrollMore;
		int x = 1;
		do {
			canScrollMore=(Boolean)((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
					"left",100,
					"top",100,
					"width",200,
					"height",200,
					"direction","down",
					"percent",50
					));
			System.out.println("Times: "+x);
			x++;
		}while(canScrollMore);
	}
	
	public void androidScrollGestureUp() {
		boolean canScrollMore;
		do {
			canScrollMore=(Boolean)((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
					"left",100,
					"top",100,
					"width",200,
					"height",200,
					"direction","up",
					"percent",15
					));
		}while(canScrollMore);
	}
	
	public void androidScrollGestureUntil(WebElement webe) {
		boolean canScrollMore;
		do {
			canScrollMore=(Boolean)((JavascriptExecutor)driver).executeScript("mobile:scrollGesture", ImmutableMap.of(
					"left",100,
					"top",100,
					"width",200,
					"height",200,
					"direction","down",
					"percent",20.0
					));
			if(webe.isDisplayed()) {
				break;
			}
		}while(canScrollMore);
		
	}

	public  void swipeGesture(WebElement webEle) {
		((JavascriptExecutor)driver).executeScript("mobile:swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)webEle).getId(),
				"direction","left",
				"percent",0.75));
	}
}
