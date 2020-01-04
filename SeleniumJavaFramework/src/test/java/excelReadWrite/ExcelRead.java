package excelReadWrite;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	static XSSFWorkbook workBook = null;
	static XSSFSheet sheet = null;

	public ExcelRead(String Path, String Sheet) throws IOException{
		workBook  = new XSSFWorkbook(Path);
		sheet = workBook.getSheet(Sheet);
	}

	public static int getRowCount() throws IOException{
		int rows = sheet.getPhysicalNumberOfRows();
		return rows;
	}

	public static int getColumnCount() throws IOException{
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		return col;
	}
	
	public static Object[][] getData(int row, int col){
		Object data[][] = new Object[row][col];
		for (int i =1; i <= row; i++){
			for(int j=0;j<col;j++){
				data[i -1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.print(data[i -1][j] +"\t" +"| \t");
			}
			//System.out.println();
		}
		return data;
	}


}
