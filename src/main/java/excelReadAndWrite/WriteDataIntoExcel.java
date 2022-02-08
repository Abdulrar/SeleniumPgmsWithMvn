package excelReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	static String excelPath ="C:\\Users\\araha\\Desktop\\Book1.xlsx";
	static String reqSheetName = "Sheet1";
	
	public static void main(String[] args) {
		
		//writeDataIntoExcel(excelPath,reqSheetName, "serviceDept");
		
	//}
		
		//public static void writeDataIntoExcel(String excelPath, String reqSheetName, String WriteDept){
			try {

				File file = new File(excelPath);

				FileInputStream finput = new FileInputStream(file);

				XSSFWorkbook workbook = new XSSFWorkbook(finput);

				XSSFSheet sheetName = workbook.getSheet(reqSheetName);
				//XSSFSheet sheetName = workbook.getSheetAt(3)

				for(int Num=0;Num<=10;Num++) {
				System.out.println(" -------> Current i value in data write = " + Num);
				sheetName.getRow(Num).createCell(0).setCellValue("serviceDept"+Num);  ///Importent step
				}
				FileOutputStream aOut = new FileOutputStream(file);

				workbook.write(aOut);

				aOut.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}

	

}
