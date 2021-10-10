package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	}

	public static String pageTitle() { 
		String title = driver.getTitle();
		return title;
	}

	public static String pageUrl() { 
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void passText(WebElement targetElement, String value) {
		// email.sendKeys()
		// password.sendKeys()
		targetElement.sendKeys(value);
	}

	public static void clickButtons(WebElement element) {

		element.click();
	}

	public static void closeBrowser() {

		driver.quit();
	}

	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\NewMaven\\Maven4.30pm\\Images\\" + imgName + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {

		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();

	}

	public static void dragDrop(WebElement source, WebElement target) {

		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement targetWebElement) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", targetWebElement);

	}

	public static void clickByUsingJavaScript(WebElement targetWebElement) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", targetWebElement);
	}

	public static String excelRead(String fileName, String sheetName, int rowNum, int cellNum) throws IOException {

		// 1. mention excel sheet path
		File f = new File("D:\\NewMaven\\Maven4.30pm\\ExcelFile\\" + fileName + ".xlsx");

		// 2. read the excel file
		FileInputStream fis = new FileInputStream(f); // throw FileNotFoundException

		// 3. read the .xlsx format file
		Workbook wb = new XSSFWorkbook(fis); // throw IOException

		// 4. get sheet from workbook
		Sheet mySheet = wb.getSheet(sheetName);

		Row r = mySheet.getRow(rowNum);

		Cell c = r.getCell(cellNum);

		int cellType = c.getCellType();

		// cellType by default 1 --> String cell
		// other than 1 --> Numeric cell or Date cell

		String value;

		if (cellType == 1) {

			value = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd MMMM yyyy");
			value = s.format(d);
		} else {

			double dd = c.getNumericCellValue(); // 87654.0
			long l = (long) dd; // 87654
			value = String.valueOf(l); // "87654"
		}
		return value;
	}

	
	
	
	// Create new Sheet
	public static void createExcel(int rowNum , int cellNum , String passValue) throws IOException {
		
		File f = new File("D:\\NewMaven\\Maven4.30pm\\ExcelFile\\NewFile.xlsx");

		Workbook wb = new XSSFWorkbook();

		Sheet newSheet = wb.createSheet("Sample Datas");

		Row newRow = newSheet.createRow(rowNum);

		Cell newCell = newRow.createCell(cellNum);

		newCell.setCellValue(passValue); 

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("Writed....");
	}
	
	
	
	
	
	
	// Create new Cell
	public static void createCell(int rownum , int cellNum , String passValue) throws IOException {
		File f = new File("D:\\NewMaven\\Maven4.30pm\\ExcelFile\\NewFile.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);

		Sheet newSheet = wb.getSheet("Sample Datas");

		Row newRow = newSheet.getRow(rownum);

		Cell newCell = newRow.createCell(cellNum);

		newCell.setCellValue(passValue); 

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("Writed....");

	}
	
	
	
	
	// Create new Row
	public static void createRow(int rownum , int cellNum , String passValue) throws IOException {
		File f = new File("D:\\NewMaven\\Maven4.30pm\\ExcelFile\\NewFile.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);

		Sheet newSheet = wb.getSheet("Sample Datas");

		Row newRow = newSheet.createRow(rownum);

		Cell newCell = newRow.createCell(cellNum);

		newCell.setCellValue(passValue); 

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("Writed....");

	}
	
	public static void excelUpdate(int rowNum , int cellNum , String existingValue , String updatingValue) throws IOException {
		File f = new File("D:\\NewMaven\\Maven4.30pm\\ExcelFile\\NewFile.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheet("Sample Datas");

		Row r = s.getRow(rowNum);
		
		Cell c = r.getCell(cellNum);
		
		String value = c.getStringCellValue();
		
		//  Data Driven.equals("Data Driven")
		if (value.equals(existingValue)) {
			
			c.setCellValue(updatingValue);
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
	}

	
	
}
