package Utils;

import org.openqa.selenium.WebDriver;

public class Constant {

	public static String url = "http://newtours.demoaut.com/index.php";
	public static WebDriver driver;
	public static final String Path_Chromedriver =  "chromedriver.exe";
	public static final String Path_IEdriver =  "IEDriverServer.exe";
	public static final String Path_Geckodriver =  "geckodriver.exe";
	public static final String Path_Edgedriver =  "MicrosoftWebDriver.exe";
	
	/*Location  of Test Data excel file*/
	public static String Path_TestData =System.getProperty("user.dir") + "\\TestData.xlsx";
	
	/*Initial row to get test data*/
	public static int RowNum = 1;
	
	/*LastRow of the excelfile*/
	public static int LastRow;
	
	/*Location of the html report*/
	public static String  Path_Report =System.getProperty("user.dir") + "\\src\\Report\\HTML_Report.html";
	
	
	
}
