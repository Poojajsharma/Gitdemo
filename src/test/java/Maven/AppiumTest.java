package Maven;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppiumTest {
	@Parameters({"Url"})
	@Test
	public void MobileLogin(String n) {
		System.out.println(n);

	}
	
	@Test
	public void MobileLogout()
	{
		System.out.println("MobileLogout");
	}
	
	@Test(groups={"Mobile"})
	public void MobileDataEntry()
	{
		System.out.println("MobileDataEntry");
	}
	
}
