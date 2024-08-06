package appium.framework;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
public AndroidDriver driver;
	
	public void configure() throws MalformedURLException, InterruptedException
	{
UiAutomator2Options options = new 	UiAutomator2Options();
options.setDeviceName("samsung SM-M325F");
options.setApp("C:\\Users\\SRAVANI\\Downloads\\app-debug 5.apk");
driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

}
}