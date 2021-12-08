package HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class AfterLoginPage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//DesiredCapabilities obj creation as named dc
				DesiredCapabilities dc=new DesiredCapabilities();
				
				//Mobile details
				dc.setCapability("deviceName","Galaxy S9+");
				dc.setCapability("udid","235021d0ca0c7ece");
				dc.setCapability("platformName","Android");
				dc.setCapability("platformVersion","10");
				
				//App Details
				dc.setCapability("appPackage", "com.pointofsale.nexchar");
				dc.setCapability("appActivity", "com.pointofsale.nexchar.MainActivity");
		        
				//save info capability
				dc.setCapability("noReset", "true");
				//dc.setCapability("fullReset", "false");
				//192.168.0.100:5555
				
				//Server setup
				URL Server= new URL("http://127.0.0.1:4723/wd/hub");
				
				////AppiumDriver object creation & send DesiredCapabilities information & server details
				AppiumDriver Nexobj= new AppiumDriver(Server,dc);
				
			    //for verification purpose
				System.out.println("Hello,I'm Nexchar");
				
				//store_name
				WebElement store =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/store_name"));
				store.sendKeys("Rafa's_Shop");
				
				//Phone number
				WebElement phonenub =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/store_phone"));
				phonenub.sendKeys("01700001234");
				
				//address
				WebElement address =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/store_address"));
				address.sendKeys("Dhaka");
				
				//vat
				WebElement vat =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/store_vat"));
				vat.sendKeys("5");
				
				//Currency Code
				WebElement currencycode =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/store_currency_code"));
				currencycode.sendKeys("BDT");
				
				//back button
				Nexobj.navigate().back();
				
				//Currency symbol
				WebElement currencysymbol =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/store_currency_symbol"));
				currencysymbol.sendKeys("$");
				
				//save
				WebElement savebtn =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/btn_sign_up"));
				savebtn.click();
				
				
	}

}
