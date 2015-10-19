package modules;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ExcelHelper;

public class LoginPage 
{
	 private  AndroidDriver driver;
	  
	 public  void LoginZZB(int i)
	 {  
	    String[][] testObjArray = ExcelHelper.getExcelData("C://Tesla's files//Projects//ZZB//src//data//_001_loginZZB.xls","Sheet1");	
	    String partnerCode = testObjArray[i][0];
	    String mobileNumber = testObjArray[i][1];
	    String verifyCode = testObjArray[i][2];	    		
	  
	    List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
	    textFieldsList.get(0).sendKeys(partnerCode);
	    textFieldsList.get(1).sendKeys(mobileNumber);
	    textFieldsList.get(2).sendKeys(verifyCode);
	    
	    List<WebElement> buttonFieldsList = driver.findElements(By.className("android.widget.Button"));	  
	    buttonFieldsList.get(1).click();  	       
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
