package practice2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class testjava {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//login in to facebook
			//driver.get("http://www.facebook.com/");
			//driver.manage().window().maximize();
			
			////driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
			//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("moatshe");
			
			//loginto hr system
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
			driver.manage().window().maximize();
			
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
			
			
					driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");	

					driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
					
					//Assign Leave
					
					driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img")).click();
					
					driver.findElement(By.xpath("//*[@id=\"assignleave_txtEmployee_empName\"]")).sendKeys("John Smith");
					
					
					
					//select leave type

					Select LeaveType = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
					
					LeaveType.selectByValue("3");
					
					
					//calender
					driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")).click();
					

					///driver.findElement(By.xpath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[5]/img")).click();
					

					//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();
					

					//driver.findElement(By.xpath("//*[@id=\"assignBtn\"]")).click();
	}

}
