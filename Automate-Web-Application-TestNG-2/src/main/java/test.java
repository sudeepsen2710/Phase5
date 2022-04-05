import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class test {
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
	      WebDriver wd=new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("SUDEEP");
	      //wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
	      wd.findElement(By.id("ap_email")).sendKeys("SUDEEP@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("12345678");
	      wd.findElement(By.id("ap_password_check")).sendKeys("12345678");
	      Thread.sleep(2000);
	     // wd.findElement(By.id("continue")).click();

	     
	  }
	@Test
	  public void login() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
	      WebDriver wd=new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("SUDEEP@gmail.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("12345678");
	      Thread.sleep(2000);

	  }
	  @Test
	  public void addToCart() throws InterruptedException {
		  	WebDriverManager.chromedriver().setup();
		  	WebDriver wd=new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("Google Pixel 6 5G");
		    Thread.sleep(2000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		    wd.findElement(By.linkText("Google Pixel 6 5G (Stromy Black, 8GB RAM, 128GB Storage)")).click();
	        //wd.findElement(By.id("add-to-cart-button")).click();
	  }

}
