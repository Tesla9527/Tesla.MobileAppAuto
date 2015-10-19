package modules;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	 private  AndroidDriver driver;
	 
	 //进入自助投页面
	 public  void NavigateToZiZhuTou()
	 {  	    	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   // WebDriverWait wait = new WebDriverWait(driver, 5);
	   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));
		// try
		// {
			//Thread.sleep(2000); 
		 //}
		 //catch(InterruptedException e)
		 //{
			// e.printStackTrace();
		 //}
	    List<WebElement> buttonFieldsList = driver.findElements(By.className("android.widget.ImageButton"));
	    buttonFieldsList.get(0).click();        	                
	 }
	 
	 //进入推好友页面
	 public  void NavigateToTuiHaoYou()
	 {  	    	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    List<WebElement> buttonFieldsList = driver.findElements(By.className("android.widget.ImageButton"));
	    buttonFieldsList.get(1).click();        	                
	 }
	 
	 //进入我的账户页面
	 public  void NavigateToMyAccount()
	 {  	    	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    List<WebElement> buttonFieldsList = driver.findElements(By.className("android.widget.ImageButton"));
	    buttonFieldsList.get(2).click();        	                
	 }

	 //进入消息中心页面
	 public  void NavigateToMessageCenter()
	 {  	    	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    List<WebElement> buttonFieldsList = driver.findElements(By.className("android.widget.ImageButton"));
	    buttonFieldsList.get(3).click();        	                
	 }
	 
	public AndroidDriver getDriver() 
	{
		return driver;
	}

	public void setDriver(AndroidDriver driver) 
	{
		this.driver = driver;
	}	 	
}