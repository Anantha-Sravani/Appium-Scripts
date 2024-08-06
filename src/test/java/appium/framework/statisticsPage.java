package appium.framework;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
public class statisticsPage {
	public AndroidDriver driver;
	public  statisticsPage(AndroidDriver d)
	{
		driver=d;
	}

	public void method() throws InterruptedException
	{
		WebElement statisctics =driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[5]"));
		statisctics.click();
		Thread.sleep(4000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		WebElement swipe_Right_Up =driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View"));
		jse1.executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)swipe_Right_Up).getId(),"direction","up","percent",0.75));
		Thread.sleep(6000);
		TouchAction action =new TouchAction(driver);
		int a=658;
		int b=1892;
		action.tap(PointOption.point(a,b)).perform();
		Thread.sleep(4000);
		
		int a1=680;
		int b1=2234;
		action.tap(PointOption.point(a1,b1)).perform();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
		
		int c1=933;
		int d1=1900;
		action.tap(PointOption.point(c1,d1)).perform();
		Thread.sleep(3000);
		
		
		int c=610;
		int d=2245;
		action.tap(PointOption.point(c,d)).perform();
		Thread.sleep(3000);
		
//		for(int x=1;x<=2;x++)
//		{
//		driver.navigate().back();
//		}
//	
//
//		
//
//	}

}

