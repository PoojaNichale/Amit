package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	public static WebDriver driver;
	
	//WebDriverManager.Chromedriver().setup();
    public void initialization () throws Exception{
    	
    	String browserValue = readproperty("browser");
    	if(browserValue.equals("Chrome"))
    	{
    	  WebDriverManager.chromedriver().setup();
    	   driver = new ChromeDriver();  
    	}
    	else if(browserValue.equals("Opera"))
    	{
    		WebDriverManager.operadriver().setup();
    		 driver = new OperaDriver();
    	}
    	
    	
    	
    	//WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	//driver.get("https://kite.zerodha.com/");
    	driver.get(readproperty("url"));
      	 //driver.get(readexcelfile(0, 0));	
    }
    public String readexcelfile(int row,int col) throws Exception {
    	
    	FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Framework1\\Testdata\\Books1.xlsx");
        Sheet excelsheet = WorkbookFactory.create(file).getSheet("Sheet1");
        String value = excelsheet.getRow(row).getCell(col).getStringCellValue();
        return value;
   	
    }
    
    public String readproperty(String value) throws Exception
    {
    	Properties prop = new Properties();
    	FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Framework1\\Testdata\\Config.Properties");
    	prop.load(file);
		return prop.getProperty(value);
    	
    	
    	
    	
    	
    }
	
    
    
    
    
    
    
    
    
    
    
    
    
}
