package appium.framework;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.google.common.io.Files;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ControlPage {
	public AndroidDriver driver;

	public  ControlPage (AndroidDriver d)
	{
		driver=d;
	}

	public void appiumtest() throws InterruptedException, IOException {
		TouchAction action =new TouchAction(driver);
		int a=327;
		int b=2201;
		action.tap(PointOption.point(a,b)).perform();
		Thread.sleep(2000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		WebElement swipe_Up =driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View"));
		jse1.executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)swipe_Up).getId(),"direction","up","percent",0.75));
		Thread.sleep(6000);
		
		
		WebElement Jet_Hold =driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"JET HOLD\"]"));
		Jet_Hold.click();
		Thread.sleep(2000);
		
		WebElement ABS_Change =driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"ABS\"]"));
		ABS_Change.click();
		Thread.sleep(4000);
		for(int i=1;i<=3;i++)
		{
			int g=312;
			int h=1859;
			action.tap(PointOption.point(g,h)).perform();
		Thread.sleep(2000);
		}
		Thread.sleep(2000);
		
		int m=744;
		int n=1383;
		action.tap(PointOption.point(m,n)).perform();
	    Thread.sleep(2000);
		
		
		WebElement energy_feauture =driver.findElement(By.xpath("//android.view.View[@content-desc=\"ENERGY\"]"));
		energy_feauture.click();
		Thread.sleep(2000);
		
		WebElement trip_feauture =driver.findElement(By.xpath("//android.view.View[@content-desc=\"TRIPS\"]"));
		trip_feauture.click();
		Thread.sleep(2000);
		
	   WebElement reset_feature  =	driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Reset\"])[2]"));
	   reset_feature.click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//android.view.View[@content-desc=\"Reset\"]")).click();
	   Thread.sleep(2000);
	   
	  WebElement console_feature =driver.findElement(By.xpath("//android.view.View[@content-desc=\"CONSOLE\"]"));
	  console_feature.click();
	  Thread.sleep(2000);
	  
	  for(int i=1;i<=2;i++)
		{
			int j=777;
			int k=1074;
			action.tap(PointOption.point(j,k)).perform();
		Thread.sleep(2000);
		}
	  int p=454;
		int q=1402;
		action.tap(PointOption.point(p,q)).perform();
	  
//	  WebElement bluetooth_Disconnected =driver.findElement(By.xpath("//android.view.View[@content-desc=\"DISCONNECTED\r\n"
//	  		+ "BLUETOOTH\"]"));
//	  Thread.sleep(2000);
//	  bluetooth_Disconnected.click();
	  Thread.sleep(4000);
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Files.copy(f,new File("C:\\Users\\SRAVANI\\Downloads\\App Screenshots//controlsScreenshoot.jpg"));
	  Thread.sleep(4000);
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  
	 WebElement remove_pairedDevices = driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Remove\"])[1]"));
	 remove_pairedDevices.click();
	 Thread.sleep(2000);
	 driver.navigate().back();
	  Thread.sleep(2000);
	  
	  int s=543;
		int t=2201;
		action.tap(PointOption.point(s,t)).perform();
		  Thread.sleep(5000);
		  
		  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(file,new File("C:\\Users\\SRAVANI\\Downloads\\App Screenshots//homepageScreenshoot.jpg"));
		  Thread.sleep(4000);
	 		
}

	
}


