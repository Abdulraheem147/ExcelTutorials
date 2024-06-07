package com.excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadIntegerFromExcel {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\ELCOT\\Documents\\Excel\\Email.xlsx");
	FileInputStream input=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(input);
	Sheet sheet = book.getSheet("Sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			CellType type = cell.getCellType();
			switch (type) {
			case STRING:
				String cellValue = cell.getStringCellValue();
				System.out.print(cellValue+"\t");
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat format=new SimpleDateFormat("dd/MMMM/yyyy");
					String format2 = format.format(date);
					System.out.print(format2);
					
					
				} else {
					double cellValue2 = cell.getNumericCellValue();
					   long x=(long)cellValue2;
					   BigDecimal valueOf = BigDecimal.valueOf(x);
					   String string = valueOf.toString();
						System.out.print(string+"\t");
		                

				}
                 break;
			default:
				break;
			}
			
			
		}
		System.out.println();
		
	}
	
}
}
