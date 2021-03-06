package HomePage;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class SignInPage {

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
		dc.setCapability("fullReset", "false");
		//192.168.0.100:5555
		
		//Server setup
		URL Server= new URL("http://127.0.0.1:4723/wd/hub");
		
		////AppiumDriver object creation & send DesiredCapabilities information & server details
		AppiumDriver Nexobj= new AppiumDriver(Server,dc);
		
	    //for verification purpose
		System.out.println("Hello,I'm Nexchar");
		
		//Username field with valid info
		WebElement username =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/user_name"));
		//username.click();
		username.sendKeys("gift_shop");
		
		/*//Username field with Invalid info
		WebElement username =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/user_name"));
		username.sendKeys("gift_corner"); */
		
		//Password field with valid password
		WebElement password =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/password"));
		password.sendKeys("12345");
		//password.click(); 
		
		/*//Password field with Invalid password
		WebElement password =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/password"));
		password.sendKeys("      "); */
		
		//backbutton
		//Nexobj.navigate().back();
		
		//Signin Button 
		WebElement signinbtn =Nexobj.findElement(By.id("com.pointofsale.nexchar:id/email_sign_in_button"));
		signinbtn.click();
		
		
		
		
	
		
	}

}
