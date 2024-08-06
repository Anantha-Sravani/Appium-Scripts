package appium.framework;
import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Navigation {
	public AndroidDriver driver;

	public  Navigation(AndroidDriver d)
	{
		driver=d;
	}

	public void appiumtest() throws InterruptedException, IOException {
		TouchAction action =new TouchAction(driver);
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(file,new File("C:\\Users\\SRAVANI\\Downloads\\App Screenshots//HomeScreenshoot.jpg"));
		Thread.sleep(4000);

Thread.sleep(5000);
int a=762;
int b=2201;
action.tap(PointOption.point(a,b)).perform();
Thread.sleep(2000);






JavascriptExecutor jse1 = (JavascriptExecutor)driver;
WebElement swipe_Right_Up =driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View"));
jse1.executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)swipe_Right_Up).getId(),"direction","up","percent",0.75));
Thread.sleep(6000);
File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//Files.copy(f,new File("C:\\Users\\SRAVANI\\Downloads\\App Screenshots//navigationScreenshoot.jpg"));
Thread.sleep(4000);

  WebElement send_Message=driver.findElement(By.xpath("//android.view.View[@content-desc='Search']"));
send_Message.click();
Thread.sleep(2000);
WebElement search =driver.findElement(By.xpath("//android.widget.EditText"));
search.click();
Thread.sleep(3000);
search.sendKeys("domlur");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(2000);
int c=257;
int d=877;
action.tap(PointOption.point(c,d)).perform();

Thread.sleep(7000);

JavascriptExecutor jse2 = (JavascriptExecutor)driver;
Thread.sleep(4000);
WebElement send_Bike =driver.findElement(AppiumBy.accessibilityId("Send to bike"));
Thread.sleep(4000);
jse2.executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)send_Bike).getId(),"direction","right","percent",0.75
		));
Thread.sleep(7000);
for(int i=1;i<=2;i++) 
{
driver.navigate().back();
Thread.sleep(2000);

}
Thread.sleep(2000);
int p=186;
int n=989;
action.tap(PointOption.point(p,n)).perform();

Thread.sleep(2000);
WebElement add_address =driver.findElement(By.xpath("//android.widget.EditText"));

add_address.sendKeys("nellore");
Thread.sleep(2000);
int l=152;
int m=1093;
action.tap(PointOption.point(l,m)).perform();
Thread.sleep(4000);
driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("AP");
Thread.sleep(2000);

driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add to Favourites\"]")).click();
Thread.sleep(2000);
for(int i=1;i<=2;i++)
{
	driver.navigate().back();
	Thread.sleep(2000);
}
int x=955;
int y=2082;
action.tap(PointOption.point(x,y)).perform();
Thread.sleep(4000);
int r=539;
int s=1338;
action.tap(PointOption.point(r,s)).perform();
Thread.sleep(4000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")).click();
Thread.sleep(4000);
WebElement send_to_Bike =driver.findElement(AppiumBy.accessibilityId("Send to bike"));

jse2.executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)send_to_Bike).getId(),"direction","right","percent",0.75
		));
Thread.sleep(7000);

for(int k=1;k<=2;k++)
{
driver.navigate().back();
Thread.sleep(2000);
}

int t=546;
int u=2138;
action.tap(PointOption.point(t,u)).perform();
Thread.sleep(4000);


		
		
	}
	

}




