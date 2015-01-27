package ApiTesting;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PluIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.plu.cn");
		driver.findElement(By.xpath(".//*[@id='topbar-header-login-btn']")).click();
		
		Iterator<String> it=driver.getWindowHandles().iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		WebElement frame=driver.findElement(By.xpath("/html/body/div[8]/div[2]/iframe"));
		driver.switchTo().frame(frame);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id='content-inner']/div/a")).click();
		WebElement frame2=driver.findElement(By.xpath("//*[@id='ptlogin_iframe']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("switcher_plogin")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id='u']")).sendKeys("卢军");
		driver.findElement(By.xpath("//*[@id='p']")).sendKeys("卢军");
		driver.findElement(By.xpath("//*[@id='login_button']")).click();
		driver.close();
		driver.quit();
	}

}
