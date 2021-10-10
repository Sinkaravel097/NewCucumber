package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPOJO;

public class Sample extends BaseClass {

	public static void main(String[] args) throws IOException {		
		
		 browserLaunch();
		
		 launchUrl("https://en-gb.facebook.com/");
		
		 LoginPOJO l = new LoginPOJO();
		
		 passText(l.getEmail(), "Java");
		
		 passText(l.getPassword(), "8765678");
		 
		 clickButtons(l.getLoginFindAll());
		 
	}

}
