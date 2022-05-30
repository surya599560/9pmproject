package pack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import exceldata.Excel;
import objrep.HomePage;
import saicommonmethods.ScreenShot;
import saicommonmethods.TestBase;

public class PopTest extends TestBase  {
	static HomePage hp;
	static Excel ex ;
	static ScreenShot sc;
	
	@BeforeMethod
	public static void launchobrowser() {
		
		TestBase tb = new TestBase();
		
		tb.launchbrowser("edge");
		
		
	}
	
	@AfterMethod
	public static void closebrowser() {
		driver.quit();
	}
	
	@Test
	public static void tabletest() throws InterruptedException, IOException {
		
		hp = new HomePage(driver);
		 ex = new Excel();
		 sc = new ScreenShot(); 
		String expectedtabtext = ex.readdata(1, 0);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.tabletlink().click();
		Thread.sleep(5000);
	    String Actualtabtest = hp.elemnttext().getText();
	    if(Actualtabtest.contains(expectedtabtext)) {
	    	System.out.println("test is pass");
	    	ex.writedata(1, 1, "valid data");
	    	Assert.assertTrue(true,"expected and actual are same");
	    	
	    }else {
	    	System.out.println("test is fail");
	    	ex.writedata(1, 1, "invalid data");
	    	sc.shot();
	    	Assert.assertTrue(false,"expected and actual are not same");
	    	
	    }
	    
	
	}
	@Test
	public static void laptoptest() throws InterruptedException, IOException {
		
		hp = new HomePage(driver);
		 ex = new Excel();
		 sc = new ScreenShot(); 
		String expectedlaptext = ex.readdata(2, 0);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.laptoplink().click();
		Thread.sleep(5000);
	    String Actuallaptest = hp.elemnttext().getText();
	    if(Actuallaptest.contains(expectedlaptext)) {
	    	System.out.println("test is pass");
	    	ex.writedata(2, 1, "valid data");
	    	Assert.assertTrue(true,"expected and actual are same");
	    	
	    }else {
	    	System.out.println("test is fail");
	    	ex.writedata(2, 1, "invalid data");
	    	sc.shot();
	    	Assert.assertTrue(false,"expected and actual are not same");
	    	
	    }
	    
		
	}
	
	@Test
	public static void spketest() throws IOException, InterruptedException {
		
		
		hp = new HomePage(driver);
		 ex = new Excel();
		 sc = new ScreenShot(); 
		String expectedspktext = ex.readdata(3, 0);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.spklink().click();
		Thread.sleep(5000);
	    String Actualspktest = hp.elemnttext().getText();
	    if(Actualspktest.contains(expectedspktext)) {
	    	System.out.println("test is pass");
	    	ex.writedata(3, 1, "valid data");
	    	Assert.assertTrue(true,"expected and actual are same");
	    	
	    }else {
	    	
	    	System.out.println("test is fail");
	    	ex.writedata(3, 1, "invalid data");
	    	sc.shot();
	    	Assert.assertTrue(false,"expected and actual are not same");
	    	
	    }
	    
		
	
	
	}
	



}



