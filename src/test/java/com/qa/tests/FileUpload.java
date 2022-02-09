package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
	public void uploadFIle(String fileName) {
		try {
		//File file = new File(".\\src\\main\resources\\uploads\\" + fileName);
			
		File file = new File("C:\\Users\\Dheerendra\\eclipse-workspace\\Web_Mobile_BDD_Framework\\Docs\\" + fileName);
		
		StringSelection ss = new StringSelection(file.getAbsolutePath());
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//imitate keyboard events like ENTER, CTRL + C, CTRL+V
		
		
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyPress(KeyEvent.VK_ENTER);			
			
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testUpload() throws InterruptedException {
		Thread.sleep(10000);
		uploadFIle("Test.txt");
	}

}
