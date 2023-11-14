package com.browserstack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class FirstTest extends AppiumTest {

    @Test
    public void navigateTest(){
    	mainAccessibilityA().click();
    	navigateBack();
    	mainViews().click();
    	navigateBack();
    	mainAccessibilityB().click();
    	navigateBack();
    	mainAnimation().click();
    	navigateBack();
    	mainApp().click();
    	navigateBack();
    	mainContent().click();
    	navigateBack();
    	mainGraphics().click();
    	navigateBack();
    	mainMedia().click();
    	navigateBack();
    	mainNfc().click();
    	navigateBack();
    	mainOs().click();
    	navigateBack();
    	mainPreference().click();
    	navigateBack();
    	mainText().click();
    	navigateBack();	
    }
    
    @Test
    public void testA() {
    	
    }
}

