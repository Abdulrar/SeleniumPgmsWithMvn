package CommanFun;

public class ExcelHelperFormKatalon {

	
	/**	

		// Create Work book

		private XSSFWorkbook getWorkBook(){
			return new XSSFWorkbook();
		}

		// Create the Sheet

		private XSSFSheet getSheet(XSSFWorkbook workBook,String sheetName){
			return workBook.createSheet(sheetName);
		}

		//Keyword , which write the data to excel

		@Keyword
		public void writeTOExcelFile(String excelPath,String sheetName,String value,int rowNo,int colNo){
			XSSFWorkbook book = getWorkBook() // created the book
			XSSFSheet sheet = getSheet(book, sheetName) //created the sheet
			XSSFRow aRow = sheet.createRow(rowNo) // created the row-> index
			XSSFCell bCell = aRow.createCell(colNo) // created the col -> index
			bCell.setCellValue(value)
			writeToFileSystem(book,excelPath)
		}


		//Write the excel to the FS

		private void writeToFileSystem(XSSFWorkbook book,String excelPath){
			try {
				FileOutputStream aOut = new FileOutputStream(excelPath)
				book.write(aOut)
				aOut.close()
			} catch (Exception e) {
				KeywordUtil.markError(e.toString())
			}
		}



		//Write the data into excel file with index start zero row and zero column

		@Keyword
		public void writeDataIntoExcel(String excelPath, String reqSheetName,int i, String WriteDept){
			try {

				File file = new File(excelPath)

				FileInputStream finput = new FileInputStream(file)

				XSSFWorkbook workbook = new XSSFWorkbook(finput);

				XSSFSheet sheetName = workbook.getSheet(reqSheetName)
				//XSSFSheet sheetName = workbook.getSheetAt(3)

				int Num = ++i
				System.out.println(" -------> Current i value in data write = " + Num)
				sheetName.getRow(Num).createCell(0).setCellValue(WriteDept)

				FileOutputStream aOut = new FileOutputStream(file)

				workbook.write(aOut)

				aOut.close()

			} catch (Exception e) {
				KeywordUtil.markError(e.toString())
			}
		}





		@Keyword
		public String readDataFromExcel_Emp(String excelPath, String reqSheetName, int i){
			try {

				File file = new File(excelPath)

				FileInputStream finput = new FileInputStream(file)

				XSSFWorkbook workbook = new XSSFWorkbook(finput);

				//get the sheet from the workbook by index
				XSSFSheet sheetName = workbook.getSheet(reqSheetName)

				int Num = i

				String deptData = sheetName.getRow(Num).getCell(0).getStringCellValue()

				return deptData

			} catch (Exception e) {
				KeywordUtil.markError(e.toString())
			}
		}



		@Keyword
		public String readDataFromExcel(String excelPath, String reqSheetName, int i){
			try {

				File file = new File(excelPath)

				FileInputStream finput = new FileInputStream(file)

				XSSFWorkbook workbook = new XSSFWorkbook(finput);

				//get the sheet from the workbook by index
				XSSFSheet sheetName = workbook.getSheet(reqSheetName)

				int Num = ++i

				String deptData = sheetName.getRow(Num).getCell(0).getStringCellValue()

				return deptData

			} catch (Exception e) {
				KeywordUtil.markError(e.toString())
			}
		}
	
	*/
	
	
}
