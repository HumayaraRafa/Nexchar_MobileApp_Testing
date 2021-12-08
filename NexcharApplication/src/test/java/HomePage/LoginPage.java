package HomePage;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class LoginPage {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//DesiredCapabilities object create and named as dc
		DesiredCapabilities dc=new DesiredCapabilities();
				
		//Mobile details
				dc.setCapability("deviceName","Galaxy S9+");
				dc.setCapability("udid","235021d0ca0c7ece");
				dc.setCapability("platformName","Android");
				dc.setCapability("platformVersion","10");
			    
		//App Details
				dc.setCapability("appPackage","com.pointofsale.nexchar");
				dc.setCapability("appActivity","com.pointofsale.nexchar.MainActivity");
				
		//192.168.1.7:5555
				
		//Server setup
				URL server= new URL("http://127.0.0.1:4723/wd/hub");
				
		//AppiumDriver object creation & send DesiredCapabilities information & server details
				AppiumDriver testobj= new AppiumDriver(server,dc);
				
		//for verification purpose
				System.out.println("Hi,I'm Nexchar");
				
				//USERNAME
				WebElement username=testobj.findElement(By.id("com.pointofsale.nexchar:id/user_name"));
				username.sendKeys("feb96537@boofx.com");
				
				
				//Password
			    WebElement	password=testobj.findElement(By.id("com.pointofsale.nexchar:id/password"));
			    password.sendKeys("Abc12345");
			    
			  //Sign In
			    WebElement	signin=testobj.findElement(By.id("com.pointofsale.nexchar:id/email_sign_in_button"));
			    signin.click();
			    
	}
	

}
