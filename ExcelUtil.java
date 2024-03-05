package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public  String getDataFromExcel(String Sheetname, int Rownum, int Cellnum ) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\ADSelResources.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		Row row = sh.getRow(Rownum);
		Cell cl = row.getCell(Cellnum);
		String value = cl.getStringCellValue();
		return value;
		
		
		
		
	}
	

}
