package appium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
	

	public class OnBording {
		public AndroidDriver driver;

		public  OnBording(AndroidDriver d)
		{
			driver=d;
		}
		public void onboardingMethod() throws InterruptedException
		{
		TouchAction action =new TouchAction(driver);
		int x=275;
		int y=985;
		action.tap(PointOption.point(x,y)).perform();


		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		Thread.sleep(5000);
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
		//int i=123;
		//int j=1889;
		//action.tap(PointOption.point(i,j)).perform();
		driver.navigate().back();
		//Thread.sleep(2000);
		//int a=539;
		//int b=2141;
		//action.tap(PointOption.point(a,b)).perform();
		Thread.sleep(2000);
		//WebElement continue2=driver.findElement(AppiumBy.accessibilityId("Continue"));
		//continue2.click();
		WebElement allow_Button =driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
		allow_Button.click();
		Thread.sleep(2000);
		WebElement allow =driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
		allow.click();
		Thread.sleep(3000);
		}
		

	}

