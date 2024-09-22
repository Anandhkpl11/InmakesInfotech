package org.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	
public static WebDriver driver;
	
	public  void browser() {
		
		
		WebDriverManager.chromedriver().setup();

		 driver=new ChromeDriver();
		
	}
	
	public  void maximize() {
		
		driver.manage().window().maximize();
	}
	
	public  void url(String url) {
		
		driver.get(url);
		
	}
	
	public  void pagetitle( ) {
		
		driver.getTitle();
		
	}
	
	public static void pageUrl( ) {
		
		driver.getCurrentUrl();
		
	}
	
	public void sendkey(WebElement element, String text) {
		element.sendKeys(text);
		
	}
	
	public  void click(WebElement element) {
		element.click();
		
	}
	
	public  void implicitywait() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public  void quit() {
		
		driver.quit();
		
	}
	
	public  void createsheet( int rownum, int cellnum,String newdata) throws IOException {
		
		 File f=new File("C:\\Users\\HAPPY\\Desktop\\InamkesAutomation\\Task11\\DataDriven\\execel\\writeexecelmultipledata.xlsx");
			
			Workbook fis=new XSSFWorkbook();
			
			Sheet sheet = fis.createSheet("Data");
			
			Row row = sheet.createRow(rownum);
			
			Cell cell = row.createCell(cellnum);
			
			cell.setCellValue(newdata);
			
			FileOutputStream s=new FileOutputStream(f);
			
			fis.write(s);


	}
	
	
	public  void createrow(int rownum, int cellnum,String newdata) throws IOException {
		 File f=new File("C:\\Users\\HAPPY\\Desktop\\InamkesAutomation\\Task11\\DataDriven\\execel\\writeexecelmultipledata.xlsx");
			
		 FileInputStream d=new FileInputStream(f);
			
			Workbook fis=new XSSFWorkbook(d);
			
			Sheet sheet = fis.getSheet("Data");
			
			Row row = sheet.createRow(rownum);
			
			Cell cell = row.createCell(cellnum);
			
			cell.setCellValue(newdata);
			
			FileOutputStream s=new FileOutputStream(f);
			
			fis.write(s);
		
	}
	
	public  void createcell(int rownum, int cellnum,String newdata) throws IOException {
		 File f=new File("C:\\Users\\HAPPY\\Desktop\\InamkesAutomation\\Task11\\DataDriven\\execel\\writeexecelmultipledata.xlsx");
			
		 FileInputStream d=new FileInputStream(f);
			
			Workbook fis=new XSSFWorkbook(d);
			
			Sheet sheet = fis.getSheet("Data");
			
			Row row = sheet.getRow(rownum);
			
			Cell cell = row.createCell(cellnum);
			
			cell.setCellValue(newdata);
			
			FileOutputStream s=new FileOutputStream(f);
			
			fis.write(s);
		
	}


}
