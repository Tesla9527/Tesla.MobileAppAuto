package modules;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ExcelHelper;

public class GeneralInfoPage 
{
	 private  AndroidDriver driver;
	  
	 public  void LoginZZB(int i)
	 {  
		driver.switchTo().window("WEBVIEW");
	    String[][] testObjArray = ExcelHelper.getExcelData("C://Tesla's files//Projects//ZZB//src//data//_001_loginZZB.xls","Sheet1");	

	    String partnerCode = testObjArray[i][0];
	    String mobileNumber = testObjArray[i][1];
	    String verifyCode = testObjArray[i][2];
	    		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));

	    textFieldsList.get(0).sendKeys(partnerCode);
	    textFieldsList.get(1).sendKeys(mobileNumber);
	    textFieldsList.get(2).sendKeys(verifyCode);
	                
	    textFieldsList = driver.findElements(By.className("android.widget.Button"));
	    textFieldsList.get(1).click();         	                
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
