package packOne;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_00 {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		/*
		FileOutputStream outfile = new FileOutputStream(System.getProperty("user.dir") + "\\dataStream\\intoFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		Scanner scanner = new Scanner(System.in);
		int r = 1;
		try {
			XSSFSheet sheet = workbook.createSheet("GoodSheet");
			XSSFRow row = sheet.createRow(0);
			row.createCell(0).setCellValue("Name");
			row.createCell(1).setCellValue("Password");
			boolean con = true;
			while (con) {
				System.out.print("Do you want to add row('yes' to add): ");
				con = scanner.next().equals("yes");
				if (!con) break;
				System.out.print("Enter the Name: ");
				String name = scanner.next();
				scanner.nextLine();
				System.out.print("Enter the Password: ");
				String pass = scanner.next();
				row = sheet.createRow(r); r += 1;
				row.createCell(0).setCellValue(name);
				row.createCell(1).setCellValue(pass);
			}
			workbook.write(outfile);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			outfile.close(); workbook.close();scanner.close();
			System.out.println("File Successfully Written...");
		}
		*/
		FileInputStream infile = new FileInputStream(System.getProperty("user.dir") + "\\dataStream\\intoFile.xlsx");
		XSSFWorkbook workbookr = new XSSFWorkbook(infile);
		XSSFSheet sheet = workbookr.getSheet("GoodSheet");
		int rows = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(0);
		XSSFCell name = row.getCell(0);
		XSSFCell pass = row.getCell(1);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		WebElement user = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		WebElement paswrd = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		WebElement lgbtn = driver.findElement(By.xpath("(//button)[1]"));
		try {
			for (int rs = 1; rs < rows + 1; rs ++) {
				//driver.get("https://www.instagram.com/accounts/login/?hl=en");
				row = sheet.getRow(rs);
				name = row.getCell(0);
				pass = row.getCell(1);
				System.out.println("Name: " + name + " pass: " + pass);
				user.sendKeys(name.toString());
				paswrd.sendKeys(pass.toString());
				lgbtn.click();
				user.clear();
				paswrd.clear();
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		workbookr.close(); infile.close();
	}

}
