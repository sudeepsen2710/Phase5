import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*1. load the driver of the browser
 *2. set the build path with all the jar files,create an object for the webdriver
 *3.maximise the web browser screen
 *4.specify the webpage what u want to test
 *5.access the web components over the webpage
 * */
public class WebAccess {
	public static void main(String[] args) throws InterruptedException {
	//load the driver
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
	//maximise the web browser screen
		wd.manage().window().maximize();
	//load the webpage
		wd.get("file:///D:/Hi.html");
		Select sc=new Select(wd.findElement(By.name("subjects")));
		//sc.selectByIndex(2);
		sc.selectByValue("java");
	
		
		
	}
}


