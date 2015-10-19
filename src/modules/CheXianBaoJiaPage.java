package modules;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ExcelHelper;

public class CheXianBaoJiaPage 
{
	 private  AndroidDriver driver;
	  
	 public  void ChooseCar()
	 {  
	    //String[][] testObjArray = ExcelHelper.getExcelData("C://Tesla's files//Projects//ZZB//src//data//_001_loginZZB.xls","Sheet1");	

	    //String partnerCode = testObjArray[i][0];
	    //String mobileNumber = testObjArray[i][1];
		 String cityName = "suzhou";
		//String licensePlateNumber = "苏E";
	    		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //选择城市
	    List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.TextView"));
	    textFieldsList.get(1).click();     
	    textFieldsList = driver.findElements(By.className("android.widget.Button"));
	    textFieldsList.get(0).click();   
	    textFieldsList = driver.findElements(By.className("android.widget.EditText"));
	    textFieldsList.get(0).sendKeys(cityName);
	    textFieldsList = driver.findElements(By.className("android.widget.TextView"));
	    textFieldsList.get(1).click();
	    
	    //输入车牌号码
	    //textFieldsList = driver.findElements(By.className("android.widget.EditText"));
	    //textFieldsList.get(0).sendKeys(licensePlateNumber);
	    textFieldsList = driver.findElements(By.className("android.widget.Button"));
	    textFieldsList.get(0).click();
	    
	    //WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.webkit.WebView")));
		
		try
		{
			Thread.sleep(2000); 
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	    
		Set<String> contextNames = driver.getContextHandles();

	     System.out.println(contextNames.size());
	     
	     for (String contextName : contextNames) 
	     {
	       System.out.println(contextName);
	       
	       if (contextName.contains("WEBVIEW"))
	       {
	         driver.context(contextName);
	       }
	     }
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
