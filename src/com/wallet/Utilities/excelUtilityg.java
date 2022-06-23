package com.wallet.Utilities;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class excelUtilityg {
		
		static String projectPath;
		static XSSFWorkbook workbook;
		static XSSFSheet sheet;
		public String excelPath;
		public String sheetName;

		public XSSFSheet readExcelData(String excelPath, String sheetName) throws IOException {
			this.excelPath =excelPath;
			this.sheetName = sheetName;
			File excelFile = new File(excelPath);
			FileInputStream inputStream = new FileInputStream(excelFile);

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet activeSheet = workbook.getSheet(sheetName);
			return activeSheet;
		}

		public String getCellData(int rowNum, int ColNum) throws IOException {
			XSSFSheet activeSheet = readExcelData(excelPath,sheetName);
			XSSFRow rowData = activeSheet.getRow(rowNum);
			XSSFCell colData =rowData.getCell(ColNum);
			String cellData = colData.getStringCellValue();

			System.out.println("Fetched Cell Data: "+cellData);
			return cellData;

		}

				
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



