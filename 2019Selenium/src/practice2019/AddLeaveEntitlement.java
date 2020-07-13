package practice2019;

///import java.io.File;
//import java.io.IOException;
import java.util.ResourceBundle;
//import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//////import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class AddLeaveEntitlement {

	public static void main(String[] args) {


		//test

		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		
		////////////////////////
		//object repository
		ResourceBundle rb = ResourceBundle.getBundle("ObjectRepository");
		//Actions act = new Actions(driver);
		
				//username
		driver.findElement(By.xpath(rb.getString("username_xpath"))).click ();
		driver.findElement(By.xpath(rb.getString("username_xpath"))).sendKeys("Admin");
		
				//password
		
		driver.findElement(By.xpath(rb.getString("password_xpath"))).click ();
		driver.findElement(By.xpath(rb.getString("password_xpath"))).sendKeys("admin123");
		
				//click login button
		
		driver.findElement(By.xpath(rb.getString("loginbutton_xpath"))).click ();
		
		System.out.println("loggedin");	
		
		driver.close();
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		
		
				driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");	

				driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
				
				//clcik on leave menu
				
				driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
				
				//select entitlement dropdown list
				

				driver.findElement(By.xpath("	//*[@id=\"menu_leave_Entitlements\"]")).click();
				
				//click add entitlement

				driver.findElement(By.xpath("//*[@id=\"menu_leave_addLeaveEntitlement\"]")).click();
				
				//click checkbox
				
				driver.findElement(By.xpath("//*[@id=\"entitlements_filters_bulk_assign\"]")).click();
				
				
				//select lOcation
				//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

				Select Location = new Select(driver.findElement(By.id("entitlements_filters_location")));
				
				Location.selectByValue("4");
				
				
				//sub unit//leave type
				
	Select Subunit = new Select(driver.findElement(By.id("entitlements_filters_subunit")));
				
	Subunit.selectByValue("4");
				
			
	//leavetype
	
	Select leavetype = new Select(driver.findElement(By.id("entitlements_leave_type")));
	
	leavetype.selectByValue("3");
	//leave period
				
	Select LeavePeriod = new Select(driver.findElement(By.id("period")));
				
	LeavePeriod.selectByValue("2018-01-01$$2018-12-31");
				
				
				//entitlement
				driver.findElement(By.id("entitlements_entitlement")).click();
				driver.findElement(By.id("entitlements_entitlement")).sendKeys("2");	
				
				
				//click save
				
				driver.findElement(By.id("btnSave")).click();
				
			//take screenshots
				
				
				///TakesScreenshot scrShot =((TakesScreenshot)driver);
				
				   //File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				   
				   //File DestFile=new File("c:\\screenshot.png");
				   //try {
					//FileUtils.copyFile(SrcFile, DestFile);
				//} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			
	}


