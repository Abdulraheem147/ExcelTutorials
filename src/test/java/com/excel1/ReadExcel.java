
package com.excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\ELCOT\\Documents\\Excel\\Email.xlsx");
		FileInputStream input=new FileInputStream (file);//FileNotFoundException
		Workbook book=new XSSFWorkbook(input); //IO Exception
		Sheet sheet = book.getSheet("Sheet2");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		String value2 = cell2.getStringCellValue();
		System.out.println(value+"\n"+value2);
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row3 = sheet.getRow(i);
			for (int j = 0; j <row3.getPhysicalNumberOfCells(); j++) {
				Cell cell3 = row3.getCell(j);
				String value3 = cell3.getStringCellValue();
				System.out.print(value3+"\t");
			}
			System.out.println();
		}
	} 

}
