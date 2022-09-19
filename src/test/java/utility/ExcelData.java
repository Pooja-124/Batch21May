package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{

	public static String importExcelData(int row,int cell) throws EncryptedDocumentException, IOException
	{

		String path="C:\\Users\\BEST\\Desktop\\pooja.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
       String Value= WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
	 return Value;
		
		
	}
	
	
}
