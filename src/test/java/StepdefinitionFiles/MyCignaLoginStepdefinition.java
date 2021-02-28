package StepdefinitionFiles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyCignaLoginStepdefinition {
	WebDriver driver;

	@Given("launch the mycigna url")
	public void launch_the_mycigna_url() {
		System.setProperty("webdriver.chrome.driver","E:\\WebDriver\\Prashanthi\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cigna.com/");
    }

	@When("click onMycign link")
	public void click_on_mycign_link() {
		driver.findElement(By.xpath("//li[@class='list-inline-item']//a[@class='btn btn-sm btn-primary' and text()='Log in to myCigna']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		 Set <String> Handles = driver.getWindowHandles();
		 int browsercount=Handles.size();
		 System.out.println(browsercount);
		 
		 for (String s1:Handles)
		 {
			 if (!s1.equals(parent))
			 {
				 driver.switchTo().window(s1);
				 System.out.println(driver.getCurrentUrl());
			 }
		 }
		 
	}
	
	@Then("enter {string} and {string}")
	public void enter_and(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}

//	@Then(" enter \"(.*)\" and \\\"(.*)\\\" ")
//	public void enter_username_and_password(String username, String password) {
//
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//	
//	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Then("click on popup")
	public void click_on_popup() {
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/cigna-modal-layout/footer/cigna-modal-layout-control[2]/button")).click();
	    
	}
	 

	@Then("hover on logout flow")
	public void hover_on_logout_flow() {
		 Actions action = new Actions(driver);
		 WebElement profileHead=driver.findElement(By.xpath("//div[contains(text(),'Hi,')]"));
		 action.moveToElement(profileHead).build().perform();
	    
	}

	@Then("clikc on logout link")
	public void clikc_on_logout_link() {
		driver.findElement(By.xpath("//a[text()=' Log Out ']")).click();
	}

	@Then("click on close browser")
	public void click_on_close_browser() {
		driver.quit();

	}
	
	
}
