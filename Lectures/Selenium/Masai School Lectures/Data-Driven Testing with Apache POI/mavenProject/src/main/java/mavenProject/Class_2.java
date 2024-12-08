package mavenProject;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\write.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		try {
			
			XSSFSheet sheet = workbook.createSheet("TabSheet");
			XSSFRow row1 = sheet.createRow(0);
			row1.createCell(0).setCellValue("Username");
			row1.createCell(1).setCellValue("Password");
			
			XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("Kiran");
			row2.createCell(1).setCellValue(241234);
	
			XSSFRow row3 = sheet.createRow(2);
			row3.createCell(0).setCellValue("Routh");
			row3.createCell(1).setCellValue(true);
			
			workbook.write(file);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			workbook.close();
			file.close();
			System.out.println("File is created...");
		}
		
	}

}
