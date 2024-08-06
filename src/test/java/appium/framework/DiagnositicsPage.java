package appium.framework;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class DiagnositicsPage {
	public AndroidDriver driver;

	public  DiagnositicsPage(AndroidDriver d)
	{
		driver=d;
	}
	
	public void diagnostics() throws InterruptedException
	{
		WebElement statisctics =driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]"));
		statisctics.click();
		Thread.sleep(4000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		WebElement swipe_Up =driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View"));
		jse1.executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)swipe_Up).getId(),"direction","up","percent",0.75));
		Thread.sleep(6000);
		TouchAction action =new TouchAction(driver);
		
		int a1=178;
		int b1=1309;
		action.tap(PointOption.point(a1,b1)).perform();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		int a=223;
		int b=1691;
		action.tap(PointOption.point(a,b)).perform();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"View History\"]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Schedule Service\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"REGULAR\"]")).click();
		Thread.sleep(3000);
		
		WebElement description =driver.findElement(By.xpath("//android.widget.EditText"));
		description.click();
		Thread.sleep(3000);
		description.sendKeys("i am facing some issues with bike.");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		int c=216;
		int d=1446;
		action.tap(PointOption.point(c,d)).perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.providers.media.module:id/button_add\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")).click();
		Thread.sleep(5000);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"ISSUE\"]")).click();
		Thread.sleep(3000);
		
		WebElement description1 =driver.findElement(By.xpath("//android.widget.EditText"));
		description1.click();
		Thread.sleep(3000);
		description1.sendKeys("i am facing some issues with bike.");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		int e=212;
		int f=1442;
		action.tap(PointOption.point(e,f)).perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.providers.media.module:id/button_add\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")).click();
		Thread.sleep(4000);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"ACCIDENT\"]")).click();
		Thread.sleep(3000);
		
		WebElement description2 =driver.findElement(By.xpath("//android.widget.EditText"));
		description2.click();
		Thread.sleep(3000);
		description2.sendKeys("i am facing some issues with bike.");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		int g=216;
		int h=1442;
		action.tap(PointOption.point(g,h)).perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.providers.media.module:id/button_add\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")).click();
		Thread.sleep(4000);
		
	}

}


