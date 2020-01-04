package excelReadWrite;
import java.io.IOException;
import java.util.Arrays;

import excelReadWrite.ExcelRead;

public class UseExcelClass {
	public static void main(String[] args) throws IOException {
		ExcelRead obj = new ExcelRead("D:/Anuradha/Eclipse/WorkSpace/SeleniumJavaFramework/ExcelFiles/TestData.xlsx", "TestSheet");

		int row = obj.getRowCount() -1;
		int col = obj.getColumnCount();
		Object data[][] = new Object [row][col];
		data = obj.getData(row, col);

	
	}

}
