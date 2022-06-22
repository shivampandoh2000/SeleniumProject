import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://demoqa.com/radio-button");
		WebElement clickFeild = driv.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
		WebElement radioBtn1 = driv.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
		clickFeild.click();
		
//		WebElement radioBtn2 = driv.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
//		
//		radioBtn2.click();
		
		System.out.println(radioBtn1.isSelected());
		System.out.println(radioBtn1.isEnabled());
		System.out.println(radioBtn1.isDisplayed());
		
		
//		System.out.println(radioBtn2.isSelected());
//		System.out.println(radioBtn2.isEnabled());
//		System.out.println(radioBtn2.isDisplayed());

	}

}
