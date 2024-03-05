package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyFileUtil {

	
		         public String getDataFromPropertyFile(String keyname) throws IOException {
		        	 
		     		FileInputStream fis = new FileInputStream("src\\test\\resources\\LoginCredentials.txt");	
		     		Properties p = new Properties();
		     		p.load(fis);
		     		String value = p.getProperty(keyname);
		     		return value;
		 
		 
	}

	
	

}
