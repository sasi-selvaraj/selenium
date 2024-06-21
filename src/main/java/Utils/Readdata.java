package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws IOException {
		 String FileLocation ="C:\\Users\\SwaminathaN\\eclipse-workspace\\maventest\\Test_data\\login.xlsx";
		 XSSFWorkbook wb = new XSSFWorkbook(FileLocation);
			XSSFSheet sheet = wb.getSheetAt(0);
			int LastRowNum = sheet.getLastRowNum();
			int PhysicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println("Inclusive of header:"+PhysicalNumberOfRows);
			System.out.println("No.Of Rows:"+LastRowNum);
			short LastCellNum =  sheet.getRow(0).getLastCellNum();
			System.out.println("No.Of cells ="+LastCellNum);
			for (int i = 1; i <= LastRowNum  ; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < LastCellNum ; j++) {
					XSSFCell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					System.out.println(value);
					
			
					
					
					
				}
			}
			
	wb.close();
	

}
	
}