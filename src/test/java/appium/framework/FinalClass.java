package appium.framework;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;
public class FinalClass {
	@Test
	public void method() throws IOException, InterruptedException
	{

		BaseClass bt = new BaseClass();
		bt.configure();
		OnBording ob = new OnBording(bt.driver);
		HomePage hp = new HomePage(bt.driver);
		Navigation np = new Navigation(bt.driver);
		statisticsPage sp = new statisticsPage(bt.driver);
		ControlPage cp = new ControlPage(bt.driver);
		DiagnositicsPage dp = new DiagnositicsPage(bt.driver);
		
//		ob.onboardingMethod();
//		np.appiumtest();
//		sp.method();
	hp.home();
		cp.appiumtest();
		//dp.diagnostics();
		

	}

}


