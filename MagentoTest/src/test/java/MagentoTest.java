

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {
  
	@Test
	public void poscredentials() throws Exception {
		
		String url="http://www.magento.com";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(url);
		 Main m=new Main(driver);
         m.clickOnMyacc();
         
         Thread.sleep(3000);
         
         Login login=new Login(driver);
         login.typeEmail("sucheendra.abc@gmail.com");
         login.typepwd("Welcome123");
         login.clickOnLogin();
         
         Thread.sleep(3000);
         
         Logout logout=new Logout(driver);
         logout.clickOnLogout();
         driver.quit();
	}

}
