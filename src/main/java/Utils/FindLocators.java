package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLocators {
	public void testFind(){
		
		WebDriver driver=new FirefoxDriver();
		driver.findElement(By.xpath(""));
	}
	
	public FindLocators DemoA(){
		//返回页面对象本身
		return this;
	}
	
	public WebElement DynamicXapth(String first,String Second){
		String a="欢迎！你,来到未来世界！";
		String a1 = a.replace("你", first);
		System.out.println(a1);
		/*String.format("%1$first%2$Second", first,Second);*/
		return null;
		
	}
	
	public static void main(String[] args){
		
		ReadProperties rp = new ReadProperties();
		String value=rp.ReadFromProperties("a.properties").getProperty("x");
		
		FindLocators fl=new FindLocators();
		fl.DemoA();
		fl.DynamicXapth("猫", "狗");
		System.out.println(value);
	}
}
