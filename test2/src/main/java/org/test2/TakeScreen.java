package org.test2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.bcel.classfile.SourceFile;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.Netapi32Util.User;
/**
 * 
 * @author yyf
 *
 */
public class TakeScreen {
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat sFormat = new SimpleDateFormat("YYYY-MM-dd");
	String date = sFormat.format(calendar.getTime());
	
	public void snapshot(WebDriver webdriver) throws IOException {
	
		System.out.println(date);

		//String currentPath = System.getProperty("user.dir");
		
		File scrFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE); //OutputType.FILE
		

		try {
			System.out.println("save snapshot path is:" + "E:\\pic" + "/" + "testReport" + date + ".jpg");
			FileUtils.copyFile(scrFile, new File("E:\\pic" + "/" + "testReport" + date + ".jpg"));
		} finally {

			System.out.println("screen shot finished");
		}

	}

	@Test
	public void test() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\autoWeb\\browserDriver\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("file:///D:\\workspacenew\\app-all\\test1\\test-output\\html\\index.html");
		snapshot(webDriver);
	}
}
