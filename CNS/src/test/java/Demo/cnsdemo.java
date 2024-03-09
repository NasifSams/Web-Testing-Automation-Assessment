package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cnsdemo {
	
	   WebDriver driver;
	@BeforeMethod
	public void setUp2() throws InterruptedException {
		  System.setProperty("C:\\eclipse\\chrome-win64\\chrome.exe\"", "C:\\eclipse");
		  driver= new ChromeDriver();
		  
		  driver.get("http://123.200.20.20:5302/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  String Exp_Title="CPA Job Portal Dashboard";
		  String Act_Title=driver.getTitle();
		  Assert.assertEquals(Exp_Title, Act_Title);
		  
	}
	
	@Test
	public void Test1() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"circularMst\"]/tbody/tr[1]/td[6]/a[1]/span")).click();
		Thread.sleep(2000);
         
	      WebElement RegLink=driver.findElement(By.xpath("//*[@id=\"circularDtl\"]/tbody/tr/td[7]/a"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", RegLink); 
	    //driver.findElement(By.className("bx bx-show")).click();
	   
		//document.querySelector('.bx.bx-show')
	    //  JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("document.querySelector('.bx.bx-show',':before').click();");
	     
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement element = driver.findElement(By.xpath("//a[@href='http://123.200.20.20:5302/circular-individual-dtl/23120654']"));
		//js.executeScript("arguments[0].click()", element);
        
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='http://123.200.20.20:5302/circular-individual-dtl/23120654']")));

        // Click on the element
        element.click(); */
		
	/*	WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='http://123.200.20.20:5302/circular-individual-dtl/23120654']")));

        // Click on the element
        element.click(); */
		
		/* 
		 * WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr/td[7]/a/i")));

        // Scroll to the element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        // Attempt to click the element
        try {
            element.click();
        } catch (Exception e) {
            System.out.println("Failed to click element: " + e.getMessage());
        }

        
	 */
		
		/* I've modified the XPath selector to be more flexible by using contains() function to match the partial href attribute
		 * WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'circular-individual-dtl')]")));
         element.click(); */
		
		 
		/*I've used a CSS selector to target the anchor (<a>) element containing the substring "circular-individual-dtl" in its href attribute
		 * WebDriverWait wait = new WebDriverWait(driver, 60);
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='circular-individual-dtl']")));

	        
	        element.click(); */
	
	}	
	
	
	@AfterMethod
	public void tearDown1() {
		
		driver.close();
		driver.quit();
	}
	

}
