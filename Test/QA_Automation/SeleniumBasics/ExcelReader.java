package SeleniumBasics;

 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
		 public String path;
		 public FileInputStream fis;
		 public FileOutputStream fos;
		 
		 private XSSFWorkbook wb;
		 private XSSFSheet sheet;
		 private XSSFRow row;
		 private XSSFCell cell;
		 
		 public ExcelReader(String path) throws IOException {
			 
			 try {
				fis = new FileInputStream(path);
				 wb = new XSSFWorkbook(fis);
				 sheet = wb.getSheetAt(0);
				 fis.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		 
		 
		 public int getRowCount(String sheetName) {
			 
			 int index = wb.getSheetIndex(sheetName);
			 
			 if(index == -1) 
			 return 0;
		     else {
			    sheet = wb.getSheetAt(index);
			    int Number = sheet.getLastRowNum()+1;
			    return Number;
		     }
		 }

		 
		 public String getcellData(String sheetName, String colName, int rowNum) {
			return colName;
			 
		 }

}
