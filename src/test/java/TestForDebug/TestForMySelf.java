package TestForDebug;

import java.util.Iterator;

import Utils.ReadCsvFiles;

public class TestForMySelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadCsvFiles f = new ReadCsvFiles("b.csv");
		Iterator<String> iterator = f.getCsvList().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

		System.out.println("列: "+f.getColNum());
		System.out.println("行: "+f.getRowNum());
		System.out.println("行值: "+f.getRowValue(1));
		System.out.println("行列值: "+f.getColValue(0, 2));
		
		for(int i=0;i<f.getCsvList().toArray().length;i++){
			System.out.println(f.getCsvList().toArray()[i]);
		}
		
	}

}
