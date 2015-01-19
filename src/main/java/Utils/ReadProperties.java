package Utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ReadProperties {
	
	public String BaseDir="./src/main/resources/Data_Files/Properties_Files/";
	
	private  Properties pro=new Properties();
	
	public Properties ReadFromProperties(String filename) {
		
			FileInputStream fis=null;
			InputStreamReader isr=null;
			BufferedReader bf=null;
			
			try {
				fis = new FileInputStream(this.BaseDir+filename);
				isr=new InputStreamReader(fis);
				
				bf=new BufferedReader(isr);
				
				pro.load(bf);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("无法找到文件！");
			}catch (IOException e){
				e.printStackTrace();
				System.out.println("系统IO错误!");
			}finally{
				try {
					bf.close();
					isr.close();
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return pro;
		}
}
