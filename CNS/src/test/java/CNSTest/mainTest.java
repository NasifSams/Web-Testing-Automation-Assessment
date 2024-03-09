package CNSTest;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class mainTest {
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeSuite
	public void ExtentSetUp() {
		extent= new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("MyTestReport.html");
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Web Testing Automation Assessment");
		spark.config().setReportName("Nasif Sadiq");
		extent.attachReporter(spark);
		
		
	   
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		  System.setProperty("C:\\eclipse\\chrome-win64\\chrome.exe\"", "C:\\eclipse");
		     driver= new ChromeDriver();
		//System.setProperty("driver.firfox.mariontee", "C:\\eclipse");
		//  driver= new FirefoxDriver();
		  driver.get("http://123.200.20.20:5302/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  String Exp_Title="CPA Job Portal Dashboard";
		  String Act_Title=driver.getTitle();
		  Assert.assertEquals(Exp_Title, Act_Title);
		  
	}
	@Test
	public void CN14_2024() throws Exception {
		
		
		ExtentTest test=extent.createTest("CIRCULAR NO:14/2014","Opening Registration Link for: 3RD ENGINEER Dept:Marine").assignAuthor("Nasif").assignDevice("Windows 11: Chrome Browser");
         
		Thread.sleep(2000);
		PomCN14_2024 pm=new PomCN14_2024(driver);
		//pm.details.click();
		
		test.pass("Clicked in details on CNo 14/2024 and new page opened");
		
		//pm.eye.click();
		test.fail(" no such element: Unable to locate element");
		test.skip("skipped clicking on eye icon and opening new url");
		
		Thread.sleep(2000);
		
		driver.get("http://123.200.20.20:5302/circular-individual-dtl/23120654");
		test.pass("page opens successfully");
		
		Thread.sleep(2000);
		
		pm.Apply.click();
		test.pass("Clicked in Apply and new page opened",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		
		Thread.sleep(2000);
		
		pm.WOLogin.click();
		test.pass("Clicked in With Out Login and new page opened",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		
		Thread.sleep(1000);
		pm.WorkNo.click();
		test.info("Clicked on No button where asked 'DO YOU CURRENTLY WORK FOR CPA OR ANY OTHER GOVT. ORGANIZATION?'");
	    
		//Quota
		Thread.sleep(1000);
		pm.Quota.sendKeys("GENERAL");
		test.info("General Quota Selected");
		
		//National ID Verify
		Thread.sleep(1000);
		pm.NID.sendKeys("8231771135");
		test.info("NID Number provided");
		
		Thread.sleep(1000);
		pm.NIDA.sendKeys("D:\\important\\NASIF SADIQ.JPG");
		test.info("NATIONAL ID ATTACHMENT added");
		
		//DOB
		pm.DOB.click();
		test.info("Cliked on Day of Birth");
		
		Thread.sleep(1000);
		pm.click1.click();
		Thread.sleep(1000);
		pm.click2.click();
		Thread.sleep(1000);
		pm.click3.click();
		Thread.sleep(1000);
		pm.click4.click();
		Thread.sleep(1000);
		pm.click5.click();
		test.info("selecting DOB using Debuger ");
		Thread.sleep(1000);
		pm.Year.click();
		test.info("Year=1995");
		Thread.sleep(1000);
		pm.Month.click();
		test.info("Month=Aug");
		Thread.sleep(1000);
		pm.Date.click();
		test.info("Date=23");
		Thread.sleep(1000);
		pm.NIDVarify.click();
        test.info("age showed");
		test.info("Clicked on Varify button");
		test.pass("NID Varified",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		
		//Personal Info
		Thread.sleep(5000);
		pm.Fname.sendKeys("MD. SIDDIQUE HAQUE");
		test.info("Father's Name Given");
		Thread.sleep(1000);
		pm.Mname.sendKeys("AMENA BEGAM");
		test.info("Mother's Name Given");
		Thread.sleep(1000);
		pm.Mobile.sendKeys("01521466347");
		test.info(" Mobile No. Given");
		Thread.sleep(5000);
		 Alert alert = driver.switchTo().alert();
		 test.info("Switch to the alert popup");
		
		 String alertMessage = alert.getText();
		 test.info("Get the text from the alert popup");
		 alert.accept();
		 test.info("close the alert");
		 String otpValue = alertMessage.split(" ")[4];
		 test.info(" Extract OTP from the alert message");
		 System.out.println("OTP Value: " + otpValue);
		 test.info("Print OTP value");
		
		//driver.findElement(By.id("otp")).sendKeys(otpValue);
		pm.OTP.sendKeys(otpValue);
		test.info("Entered OTP");
		Thread.sleep(2000);
		 Alert alert1 = driver.switchTo().alert();
		 alert1.accept();
	//	driver.switchTo().alert().accept();
		test.pass("OTP Matched");
		

		
		
		
		
		Thread.sleep(1000);
		pm.Email.sendKeys("nasifsadiq16@gmail.com");
		test.info(" Email Given");
		
		Thread.sleep(1000);
		pm.Gender.click();
		test.info("Selecting Gender=male");
		Thread.sleep(1000);
		pm.MS.sendKeys("SINGLE");
		test.info("Selecting Maritial Status=Single");
		Thread.sleep(1000);
		pm.Religion.sendKeys("ISLAM");
		test.info("Selecting Religion =Islam");
		
		Thread.sleep(1000);
		pm.Photo.sendKeys("D:\\important\\NASIF SADIQ.JPG");
		test.info("Photo Uploaded");
		
		Thread.sleep(1000);
		pm.Signature.sendKeys("D:\\important\\SIGNATURE.jpg");
		test.info("Signature Uploaded");
		
		
		Thread.sleep(3000);
		pm.Next1.click();
		test.info("Clicked Next Button ");
		test.pass("Personal Info has been uploaded",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());		

		
		//Address page
		Thread.sleep(4000);
		
		pm.Division.sendKeys("DHAKA");
		test.info("Select Divison=Dhaka");
		Thread.sleep(1000);
		pm.District.sendKeys("DHAKA");
		test.info("Select District=Dhaka");
		Thread.sleep(1000);
		pm.Thana.click();
		Thread.sleep(1000);
		pm.ThanaN.sendKeys("RAMNA",Keys.ENTER);
		test.info("Select Thana=Ramna");
		Thread.sleep(1000);
		pm.POE.sendKeys("RAMNA");
		test.info("Select Post Office=Ramna");
		Thread.sleep(1000);
		pm.PCODE.sendKeys("1217");
		test.info("Select Post Code=1217");
		Thread.sleep(1000);
		pm.PAdd.sendKeys("HOUSE -786 ; ROAD - 24, BLOCK -F,  BASHUNDHARA R/A");
		test.info("Select Permanent Address=HOUSE -786 ; ROAD - 24, BLOCK -F,  BASHUNDHARA R/A");
		
		//same as
		Thread.sleep(1000);
	    pm.SAMEAS.click();
		test.info("Selecting: Same As Permanent Address");
		
		Thread.sleep(2000);
		pm.NextADD.click();
		test.pass("Clicked next",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		
		//Education
		//HSC
		Thread.sleep(4000);
		
		pm.HSC.sendKeys("HSC");
		test.info("Selecting:HSC");
		
		Thread.sleep(1000);
		pm.Subject.click();
		
		Thread.sleep(1000);
		pm.SubjectS.sendKeys("Science",Keys.ENTER);
		test.info("Subject Science selected");
		Thread.sleep(1000);
		pm.HSCB.click();
		test.info("Others Board Selected");
		Thread.sleep(1000);
		pm.HSCBValue.sendKeys("DINAJPUR BOARD");
		test.info("Others Board=DINAJPUR BOARD  Selected");
		Thread.sleep(1000);
		pm.HSCPYear.click();
		test.info("Selecting passing year");
		Thread.sleep(1000);
		pm.HscYearClick1.click();
		Thread.sleep(1000);
		pm.HSC11.click();
		test.info("Selecting passing year=2011");
		Thread.sleep(1000);
		pm.SresultHSC.click();
		Thread.sleep(2000);
		pm.HSCGPAField.sendKeys("GPA OUT OF 5.00",Keys.ENTER);
		test.info("Selecting GPA out of 5.00");
		Thread.sleep(2000);
		pm.HSCResult.sendKeys("5.00");
		test.info("HSC GPA=5.00");
		Thread.sleep(1000);
		
		//SSC
		Thread.sleep(1000);
		pm.SSC.sendKeys("SSC");
		test.info("SSC selected");
		Thread.sleep(1000);
		pm.SubjectSSC.click();
		Thread.sleep(1000);
		pm.SSCS.sendKeys("Science",Keys.ENTER);
		test.info("Subject Science selected");
		Thread.sleep(1000);
		pm.SSCBoard.click();
		Thread.sleep(1000);
		pm.SSCBoadName.sendKeys("DINAJPUR BOARD",Keys.ENTER);
		test.info("SSC Board:DINAJPUR BOARD selected");
		Thread.sleep(4000);
		pm.SSCPYear.click();
		test.info("Selecting passing year");
		Thread.sleep(2000);
		pm.SSCPYClick1.click();
		Thread.sleep(2000);
		pm.SSC2009.click();
		test.info("Selecting SSC passing year=2009");
		Thread.sleep(2000);
		pm.SresultSSC.click();
		Thread.sleep(2000);
		pm.SSCGPAField1.sendKeys("GPA OUT OF 5.00",Keys.ENTER);
		test.info("Selecting GPA out of 5.00");
		
		Thread.sleep(3000);
		pm.SSCResult1.sendKeys("5.00");
		test.info("HSC GPA=5.00");
		Thread.sleep(3000);
		pm.EduNext.click();
		test.pass("Clicked next",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
       
		//Job Experience
		Thread.sleep(4000);
		pm.ORGANIZATION1.sendKeys("kk corporation");
		test.info("ORGANIZATION name= kk corporation");
		Thread.sleep(2000);
		pm.DESIGNATION1.click();
		Thread.sleep(2000);
		pm.degEngg.sendKeys("3RD ENGINEER",Keys.ENTER);
		test.info("DESIGNATION name= 3RD ENGINEER");
		Thread.sleep(2000);
		pm.StartDate1.sendKeys("11/11/2016",Keys.ENTER);
		test.info("Starting date added");
		Thread.sleep(2000);
		pm.EndDate1.sendKeys("12/12/2022",Keys.ENTER);
		test.info("Starting date added");
		Thread.sleep(2000);
		pm.OfficeAdd1.sendKeys("Dhaka");
		test.info("Starting date added");
		Thread.sleep(3000);
		pm.JENext.click();
		test.pass("Clicked next",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());

		//Certificate
		Thread.sleep(4000);
		pm.Course1.click();
		
		Thread.sleep(3000);
		pm.CourseName.sendKeys("Microsoft Office Course",Keys.ENTER);
		test.info("microsoft office course name enetred");
		Thread.sleep(3000);
		pm.CourseDuration.sendKeys("3");
		Thread.sleep(3000);
		//pm.CourseDtime.click();
		//Thread.sleep(4000);
		pm.CourseDtime.sendKeys("YEAR",Keys.ENTER);
		test.info("Course DURATION time= 3 Years");
		Thread.sleep(2000);
		pm.addCourse.click();
		
		test.info("Clicked on addcourse");
		Thread.sleep(2000);
		pm.Course2.click();
		Thread.sleep(2000);
		pm.CourseName2.sendKeys("Cooking",Keys.ENTER);
		test.info("Cooking course name enetred");
		pm.CourseDuration2.sendKeys("3");
		Thread.sleep(3000);
		
	
		pm.CourseDtime2.sendKeys("YEAR",Keys.ENTER);
		test.info("Course DURATION time= 3 Years");
		
		
		
		
		Thread.sleep(4000);
	    pm.CertificateNext.click();
		test.pass("Clicked next",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		
        //Declaration
		Thread.sleep(5000);
        pm.DeclarationFinal.click();
       test.info("Clicked in Declaration");
        Thread.sleep(4000);
        pm.FComplete1ast.click();
        
        test.info("clicked complete");
        Thread.sleep(4000);
        
       /* Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		*/
        pm.ButtonYes.click();
        test.info("Save Confirm? Yes");
        Thread.sleep(3000);
	    test.pass("Applying Complete",MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());

        
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown1() {
		
		driver.close();
		
	}
	@AfterSuite
	public void tearDwon() {
		extent.flush();
		
	}
	public String getBase64() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

}
