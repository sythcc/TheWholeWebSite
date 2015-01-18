package Utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Properties;

public class TestGetProperties {
	
	private static Properties pro=new Properties();
	private static String path="./src/main/resources/Data_Files/Properties_Files/a.properties";
	
	public static void main(String[] args){
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis);
			
			BufferedReader bf=new BufferedReader(isr);
		
			pro.load(bf);
			String value=pro.getProperty("x");
			
			System.out.println("Key"+value);
		
			Enumeration<Object> c = pro.elements();
			while (c.hasMoreElements()) {
				System.out.println(c.nextElement());
			}
			
			bf.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("找不到文件！");
		}catch (IOException e){
			e.printStackTrace();
			System.out.println("系统IO错误！");
		}
	}

}
