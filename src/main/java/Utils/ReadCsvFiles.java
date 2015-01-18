package Utils;

import java.io.*;
import java.util.*;

public class ReadCsvFiles {
	
	private String BaseDir="./src/main/resources/Data_Files/Csv_Files/";
	private List<String> CsvList=new ArrayList<String>();

	public ReadCsvFiles(String filename){	
		//构造方法，从文件读取内容初始化ArrayList
		String temp;	
		try {
			FileInputStream fi=new FileInputStream(this.BaseDir+filename);
			//FileReader fr=new FileReader(this.BaseDir+filename);
			//有乱码
			InputStreamReader isr=new InputStreamReader(fi,"GB2312");
			//注意字符编码
			BufferedReader br=new BufferedReader(isr);
			
			while ((temp=br.readLine())!=null) {
				this.CsvList.add(temp);
			}
			br.close();
			isr.close();
			//fr.close();
			fi.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("找不到文件！");
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("系统IO错误！");
		}
	}
	
	public List<String> getCsvList() {
		//此方法获取被初始化的文件
		return CsvList;
	}
	
	public int getRowNum(){
		//获取CSV文件的行数
		return CsvList.size();
	}
	
	public int getColNum(){
		//获取CSV文件的列数
		if (!CsvList.toString().equals("[]")) {
			if (CsvList.get(0).contains(" ")) {
				//包含，表示长度大于1，即不仅仅有一个元素
				//可能不是string类型,由于此处声明list 的泛型为string，所以可以直接用，不需要强制转换
				return CsvList.get(0).split(" ").length;
				//split是返回的数组，返回第一行的长度，ps，第一行就能代表所有行
			} else if(CsvList.get(0).trim().length()!=0){
				//当有一个元素时候，截取后的长度不为0，则返回数量为1，（空格是例外）
				return 1;
			}else {
				return 0;
				//这种情况是空格
			}
		} else {
			return 0;
			//这种情况是list为空
		}
	}
	
	public String getRowValue(int index){
		//获取文件第index行的数据
		if (this.CsvList.size()!=0) {
			return this.CsvList.get(index);
		} else {
			return null;
		}
	}
	
	public enum ZiDuan{
		xpath,id
	}
	
	public String getColValue(int Row,int Col){
		//通过id号获取文件第Row行第Col列的数据
		String value = null;
		int ColNum=getColNum();
		//获取文件的列数
		if (ColNum>1) {
			value=this.CsvList.get(Row).split(" ")[Col];
		} else if(ColNum==1){
			value=this.CsvList.get(Row);
		}else{
			value=null;
		}
		return value;
	}

}