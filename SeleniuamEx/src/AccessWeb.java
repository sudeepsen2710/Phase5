import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. load the driver of the browser
 *2. set the build path with all the jar files,create an object for the webdriver
 *3.maximise the web browser screen
 *4.specify the webpage what u want to test
 *5.access the web components over the webpage
 * */
public class AccessWeb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("file:///D:/Hi.html?submit=Submit");
		wd.findElement(By.name("submit")).submit();
		Alert alert=wd.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
				
	}

}
