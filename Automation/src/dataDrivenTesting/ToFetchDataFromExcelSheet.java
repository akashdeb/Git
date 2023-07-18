package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1. Converting the Physical representation of excel file into java representation 
		FileInputStream fis = new FileInputStream("./testData/ExcelData.xlsx");
		//2. Accessing the workbook of the Excel sheet
		Workbook workbook = WorkbookFactory.create(fis);
		//3. Accessing the sheet of the Workbook
		Sheet sheet = workbook.getSheet("Sheet1");
		//4. Accessing the Row of the Sheet
		Row row = sheet.getRow(3);
		//5. Accessing the cell of the Row
		Cell cell = row.getCell(0);
		//6. Accessing the value of the cell
		String employeeName1 = cell.getStringCellValue();
		
		System.out.println(employeeName1);
		
		long employee1PhoneNo = (long)row.getCell(1).getNumericCellValue();
		System.out.println(employee1PhoneNo);
		
		boolean employee1Status = row.getCell(3).getBooleanCellValue();
		
		if(employee1Status) {
			System.out.println("20% hike");
		}
		else
			System.out.println("Go home");
		
		System.out.println("===================================");
		String employee2Name = sheet.getRow(2).getCell(0).getStringCellValue();
		long employee2PhoneNo = (long)sheet.getRow(2).getCell(1).getNumericCellValue();
		int employee2ProjectsHandling = (int)sheet.getRow(2).getCell(2).getNumericCellValue();
		boolean employee2Status = sheet.getRow(2).getCell(3).getBooleanCellValue();
		
		System.out.println("Employee Name: "+employee2Name);
		System.out.println("Employee phone no: "+employee2PhoneNo);
		System.out.println("Employee projects Handling: "+employee2ProjectsHandling);
		
		if(employee2Status) {
			System.out.println("20% hike");
		}
		else
			System.out.println("Go home");
		

		

		
		

	}

}
