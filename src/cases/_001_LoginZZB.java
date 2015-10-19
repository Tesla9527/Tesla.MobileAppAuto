package cases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.URL;
import junit.framework.TestCase;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import modules.*;

public class _001_LoginZZB extends TestCase
{
    private AndroidDriver driver;   
    private LoginPage LoginPage;
    private HomePage HomePage;
    private CheXianBaoJiaPage CheXianBaoJiaPage;
    
    @Test
    public void _001__loginZiZhuBao()
    {      	 	   
    	LoginPage.LoginZZB(0);    	
    	HomePage.NavigateToZiZhuTou();
    	CheXianBaoJiaPage.ChooseCar();
    }

    @BeforeTest
    public void setUp() throws Exception 
    {
        // Setup Appium
        File appDir = new File("..//ZZB//apps//");
        File app = new File(appDir, "ZiZhuBao0518_1436.apk");  
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android");      
        capabilities.setCapability("platformName", "Android");
        //capabilities.setCapability("automationName", "Selendroid");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability(CapabilityType.VERSION, "4.4");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("app-activity", ".ZiZhuBao0518_1436");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);                   
        
        LoginPage = new LoginPage();       
        LoginPage.setDriver(driver);    
        HomePage = new HomePage();       
        HomePage.setDriver(driver);  
        CheXianBaoJiaPage = new CheXianBaoJiaPage();       
        CheXianBaoJiaPage.setDriver(driver);  
    }

    @AfterTest
    public void tearDown() throws Exception 
    {
        driver.quit();
    }   
}
