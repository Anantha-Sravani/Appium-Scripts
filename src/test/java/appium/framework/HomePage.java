package appium.framework;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class HomePage {
	public AndroidDriver driver;
	public HomePage(AndroidDriver d)
	{
		driver=d;
	}
	public void home() throws InterruptedException
	{
		WebElement settings =driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]"));
		settings.click();
		Thread.sleep(4000);
		
	TouchAction action =new TouchAction(driver);
		int a=610;
		int b=576;
		action.tap(PointOption.point(a,b)).perform();
		Thread.sleep(3000);
		
		int c=967;
		int d=149;
		action.tap(PointOption.point(c,d)).perform();
		Thread.sleep(3000);
		
		WebElement name_feild =driver.findElement(By.xpath("//android.view.View[@content-desc=\"sravs\"]"));
		name_feild.click();
		Thread.sleep(2000);
		
		WebElement change_name =driver.findElement(By.xpath("//android.widget.EditText[@text=\"sravs\"]"));
		change_name.clear();
		Thread.sleep(2000);
		
		WebElement pass_data =driver.findElement(By.xpath("//android.widget.EditText"));
		 pass_data.sendKeys("sravs");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Save\"]")).click();
		Thread.sleep(2000);
		
		int e=970;
		int f=152;
		action.tap(PointOption.point(e,f)).perform();
		Thread.sleep(3000);
		

		int g=967;
		int h=152;
		action.tap(PointOption.point(g,h)).perform();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Documents\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"DRIVING LICENSE\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Open Gallery\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Crop\"]")).click();
		Thread.sleep(5000);
//	
////		WebElement move_to_Insurence =driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"DRIVING LICENSE\"]"));
////		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
////		jse1.executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)move_to_Insurence).getId(),"direction","right","percent",0.75));
////		Thread.sleep(4000);
////		
////		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"INSURANCE\"]")).click();
////		Thread.sleep(2000);
////		
////		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Open Gallery\"]")).click();
////		Thread.sleep(2000);
////		
////		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[5]")).click();
////		Thread.sleep(2000);
////		
////		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Crop\"]")).click();
////		Thread.sleep(2000);
////		
////		WebElement swipe =driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"INSURANCE\"]"));
////		swipe.click();
////		Thread.sleep(4000);
////		
////		jse1.executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)swipe).getId(),"direction","left","percent",0.75));
//		Thread.sleep(4000);
//		
		int i=929;
		int j=401;
		action.tap(PointOption.point(i,j)).perform();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Delete\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Vehicle Info\"]")).click();
		Thread.sleep(3000);
		
		int k=907;
		int l=387;
		action.tap(PointOption.point(k,l)).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"sravs\"]")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("sravs");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Save\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"SOFTWARE\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"WARRANTY\"]")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		int m=862;
		int n=1520;
		action.tap(PointOption.point(m,n)).perform();
		Thread.sleep(3000);
		
		int o=862;
		int p=1720;
		action.tap(PointOption.point(o,p)).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Update\"]")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\"]")).click();
		Thread.sleep(3000);

		
		////driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Get Started")).click();
		Thread.sleep(5000);


		WebElement mobile =driver.findElement(By.xpath("//android.widget.EditText"));
		mobile.click();
		Thread.sleep(2000);
		mobile.sendKeys("6305961502");
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		Thread.sleep(2000);

		Thread.sleep(10000);
		WebElement continue_OTP = driver.findElement(AppiumBy.accessibilityId("Continue"));
		continue_OTP.click();
		Thread.sleep(10000);
		
//		WebElement allow_Button =driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
//		allow_Button.click();
//		Thread.sleep(2000);
//		WebElement allow =driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
//		allow.click();
//		Thread.sleep(2000);
//		int s=216;
//		int t=1446;
		//TouchAction action =new TouchAction(driver);
		//action.tap(PointOption.point(s,t)).perform();
		//Thread.sleep(3000);
		
		WebElement assist = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]"));
		assist.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Feedback\"]")).click();
		Thread.sleep(2000);
		
		WebElement description =driver.findElement(By.xpath("//android.widget.EditText"));
		description.click();
		Thread.sleep(2000);
		description.sendKeys("i have an issue through the bike");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		int q=216;
		int r=1446;
		
		action.tap(PointOption.point(q,r)).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[9]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.providers.media.module:id/button_add\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Send Feedback\"]")).click();
		Thread.sleep(7000);
	
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"User's Manual\"]")).click();
		
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Lockdown\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Lock My F77\"]")).click();
		Thread.sleep(5000);
		
		for(int x=1;x<=2;x++)
		{
			driver.navigate().back();
			Thread.sleep(3000);
		}
		
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Roadside Assist\"]")).click();
		Thread.sleep(3000);
		
		for(int y=1;y<=2;y++)
		{
			driver.navigate().back();
			Thread.sleep(3000);
		}
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"FAQ\"]")).click();
		Thread.sleep(7000);
		
		int u=476;
		int v=1045;
		
		action.tap(PointOption.point(u,v)).perform();
		Thread.sleep(3000);
		
		int x=476;
		int y=1045;
		
		action.tap(PointOption.point(x,y)).perform();
		Thread.sleep(3000);
	
		driver.navigate().back();
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Contact Us\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"EMAIL\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"android:id/icon\"])[1]")).click();
		Thread.sleep(5000);
		
		for(int z=1;z<=2;z++)
		{
			driver.navigate().back();
			Thread.sleep(3000);
		}
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"CALL US\"]")).click();
		Thread.sleep(3000);
		for(int q1=1;q1<=4;q1++)
		{
			driver.navigate().back();
			Thread.sleep(3000);
		}
		
		
	}

}


