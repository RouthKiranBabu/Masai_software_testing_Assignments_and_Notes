// https://students.masaischool.com/lectures/91790?tab=notes
// 55:47
package mavenProject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "//testData//dynamicTest.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("User data");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rowsnum = scanner.nextInt();
		System.out.println("Enter the number of columns: ");
		int colnum = scanner.nextInt();
		for(int r = 0; r < rowsnum; r++) {
			XSSFRow row = sheet.createRow(r);
			int sum = r + 1;
			System.out.println("Next Row Number: " + sum);
			for(int c = 0; c < colnum; c++) {
				System.out.println("Add Cell Data");
				row.createCell(c).setCellValue(scanner.next());
			}
		}
		workbook.write(file);
		System.out.println("File is created!");
		workbook.close();
		file.close();
	}

}
