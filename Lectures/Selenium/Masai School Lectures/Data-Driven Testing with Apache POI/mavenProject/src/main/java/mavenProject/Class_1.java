package mavenProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// FileInputStream file = new FileInputStream("C:\\Users\\kiran\\Downloads\\Excel File.xlsx");
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\Excel File.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rownum = sheet.getLastRowNum();
		int cellnum = sheet.getRow(1).getLastCellNum();
		System.out.println("Row Numbers: " + rownum); // Row Numbers: 4
		System.out.println("Column Numbers: " + cellnum); // Column Numbers: 2
		
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell name = row.getCell(0);
//		XSSFCell email = row.getCell(1);
//		System.out.println(name.toString());
//		System.out.println(email.toString());
//		for(int r = 1; r < rownum; r++) {
//			row = sheet.getRow(r);
//			name = row.getCell(0);
//			email = row.getCell(1);
//			System.out.println("Name: " + name + ", Email: "+ email);
//		}
		/*
Name
Email
Name: Routh, Email: routh123@gmail.com
Name: Kiran, Email: kiran456@gmail.com
Name: Babu, Email: babu789@gmail.com*/
		
		for(int r = 0; r < rownum; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < cellnum; c ++) {
				XSSFCell cell = row.getCell(c);
				System.out.println(cell.toString());
			}
		}
		/*
Name
Email
Routh
routh123@gmail.com
Kiran
kiran456@gmail.com
Babu
babu789@gmail.com*/
		workbook.close();
		file.close();
	}

}
