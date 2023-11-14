package appium;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumNewTest {

	public static void main(String[] args) {
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setUdid("RF8N403BDGA");
		options.setCapability("appium:appPackage","com.sec.android.app.popupcalculator");
		options.setCapability("appium:appActivity","com.sec.android.app.popupcalculator.Calculator");
		options.setCapability("platformName", "Android");
		options.setCapability("appium:platformVersion", "12");
		options.setCapability("appium:automationName","uiautomator2");
		
		try {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
