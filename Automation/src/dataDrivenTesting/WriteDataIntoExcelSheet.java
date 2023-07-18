package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\AkashDeb\\eclipse-workspace_Automation1130May\\Automation\\testData\\ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.createRow(6);
		
		row.createCell(0).setCellValue("Rupesh Raj");
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\AkashDeb\\eclipse-workspace_Automation1130May\\Automation\\testData\\ExcelData.xlsx");
		workbook.write(fos);
		workbook.close();
		
		System.out.println("The data is written in the Excel");
		

	}

}
