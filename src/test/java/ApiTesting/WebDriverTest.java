package ApiTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla Firefox/firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.plu.cn");
		WebElement LoginButton=driver.findElement(By.xpath(PluXpath.LoginButton));
		LoginButton.click();
		WebElement Frame1=driver.findElement(By.xpath(PluXpath.Frame1));
		driver.switchTo().frame(Frame1);
		WebElement LoginLink=driver.findElement(By.xpath(PluXpath.LoginLink));
		LoginLink.click();
		
		WebElement Frame2=driver.findElement(By.xpath(PluXpath.Frame2));
		driver.switchTo().frame(Frame2);
		
		WebElement SwitchTab=driver.findElement(By.xpath(PluXpath.SwitchTab2));
		SwitchTab.click();


	}

}
