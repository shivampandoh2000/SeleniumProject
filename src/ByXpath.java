import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		driv.get("https://demo.guru99.com/test/selenium-xpath.html");
		WebElement searchBox = driv.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		WebElement passcodeBox = driv.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		searchBox.sendKeys("testUser");
		passcodeBox.sendKeys("x@123");
		driv.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		

	}

}
