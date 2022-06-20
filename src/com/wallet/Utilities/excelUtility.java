package com.wallet.Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excelUtility(String excelPath,String sheetName) {
		try {
		//projectPath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook("excelPath");
		sheet = workbook.getSheet("SheetName");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	


//	public static void main(String[] args) {
//		getRowCount();
//		getCellDataString(1, 1);
//		getCellDataNumber(5, 1);
//	}
	
	public static void getRowCount(){
		try {
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows:" +rowCount);
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}
	
	}
	
	public static String getCellDataString(int rowNo, int colNo) {
		try {
			String cellData = sheet.getRow(rowNo).getCell(colNo).getStringCellValue();
			System.out.println(cellData);
			}
			catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				System.out.println(exp.getStackTrace());
			}
		return projectPath;
	}

	public static void getCellDataNumber(int rowNo, int colNo) {
		try {
			double cellData = sheet.getRow(rowNo).getCell(colNo).getNumericCellValue();
			System.out.println(cellData);
			}
			catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				System.out.println(exp.getStackTrace());
			}
	}
}
