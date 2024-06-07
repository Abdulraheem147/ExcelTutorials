package com.excel1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteValueInExcel {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("TestSheet");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = sheet.getRow(0).createCell(0);
		cell.setCellValue("Username");
		sheet.getRow(0).createCell(1).setCellValue("Password");
		File file=new File("C:\\Users\\ELCOT\\Documents\\Excel\\Test1.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		book.write(fos);
		book.close();
	}

}
