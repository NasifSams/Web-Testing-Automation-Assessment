package CNSTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomCN14_2024 {
      WebDriver driver;
	
   PomCN14_2024(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
		}
   
  /*  @FindBy(xpath="//*[@id=\"circularMst\"]/tbody/tr[1]/td[6]/a[1]/span/i")
    WebElement details;
    
    public void ClickDetails() {
    	details.click();
    }
    
    @FindBy(xpath="//*[@id=\"circularDtl\"]/tbody/tr/td[7]/a")
    WebElement eye;
    
    public void Clickeye() {
    	JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", eye);
    }*/
    
    
    //Apply
    @FindBy(xpath="//*[@id=\"circularDtlCard\"]/div[1]/div[1]/div/p[1]/a/strong")
    WebElement Apply;
    
    public void ClickApply() {
    	Apply.click();
    }
    
    //With out login
    @FindBy(xpath="//*[@id=\"login-form\"]/div[2]/a")
    WebElement WOLogin;
    public void ClickWithOutLogin() {
    	WOLogin.click();
    }
    
    //Basic Information
    @FindBy(xpath="//*[@id=\"gov_org_no\"]")
    WebElement WorkNo;
    public void ClickWorkNo() {
    	WorkNo.click();
    }
    
    @FindBy(id="quota")
    WebElement Quota;
    
    public void ClickQuota(String quota) {
    	Select co1= new Select(Quota);
		co1.selectByVisibleText(quota);
    }
    
    //National ID Verify
    @FindBy(id="national_id")
    WebElement NID;
    
    public void SetNID(String nid) {
    	NID.sendKeys(nid);
    }
    @FindBy(id="national_id_attachment")
    WebElement NIDA;
    
    public void SetNIDAttach(String nida) {
    	NIDA.sendKeys(nida);
    }
    @FindBy(id="date_of_birth")
    WebElement DOB;
    
    public void ClickDOB() {
    	DOB.click();
    }
    @FindBy(xpath="//*[@id=\"basic-info\"]/div/div[4]/div[1]/fieldset/div/div[3]/div/div/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]")
    WebElement click1;
    
    public void Clickclick1() {
    	click1.click();
    }
    @FindBy(xpath="//*[@id=\"basic-info\"]/div/div[4]/div[1]/fieldset/div/div[3]/div/div/ul/li[1]/div/div[2]/table/thead/tr/th[2]")
    WebElement click2;
    
    public void Clickclick2() {
    	click2.click();
    }
    @FindBy(xpath="//*[@id=\"basic-info\"]/div/div[4]/div[1]/fieldset/div/div[3]/div/div/ul/li[1]/div/div[3]/table/thead/tr/th[1]/span")
    WebElement click3;
    
    public void Clickclick3() {
    	click3.click();
    }
    @FindBy(xpath="//*[@id=\"basic-info\"]/div/div[4]/div[1]/fieldset/div/div[3]/div/div/ul/li[1]/div/div[3]/table/thead/tr/th[1]/span")
    WebElement click4;
    
    public void Clickclick4() {
    	click4.click();
    }
    @FindBy(xpath="//*[@id=\"basic-info\"]/div/div[4]/div[1]/fieldset/div/div[3]/div/div/ul/li[1]/div/div[3]/table/thead/tr/th[1]/span")
    WebElement click5;
    
    public void Clickclick5() {
    	click5.click();
    }
    @FindBy(xpath="//*[@id=\"basic-info\"]/div/div[4]/div[1]/fieldset/div/div[3]/div/div/ul/li[1]/div/div[3]/table/tbody/tr/td/span[7]")
    WebElement Year;
    
    public void SetYear() {
    	Year.click();
    }
    @FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/div/div/div/div/div[3]/div/form/div[1]/div/div[4]/div[1]/fieldset/div/div[3]/div/div/ul/li[1]/div/div[2]/table/tbody/tr/td/span[8]")
    WebElement Month;
    
    public void SetMonth() {
    	Month.click();
    }
    @FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/div/div/div/div/div[3]/div/form/div[1]/div/div[4]/div[1]/fieldset/div/div[3]/div/div/ul/li[1]/div/div[1]/table/tbody/tr[4]/td[4]")
    WebElement Date;
    
    public void SetDate() {
    	Date.click();
    }
    @FindBy(id="nid_verification")
    WebElement NIDVarify;
    
    public void ClickNIDVarify() {
    	NIDVarify.click();
    }
    
    //Personal Info
    
    @FindBy(id="father_name")
    WebElement Fname;
    
    public void setFatherName(String fname) {
    	Fname.sendKeys(fname);
    }
    @FindBy(id="mother_name")
    WebElement Mname;
    public void setMotherName(String mname) {
    	Mname.sendKeys(mname);
    }
    @FindBy (id="mobile")
    WebElement Mobile;
    public void SetMobile(String mobile) {
    	Mobile.sendKeys(mobile);
    	
    }
    
    @FindBy(id="otp")
    WebElement OTP;
    public void SetOTP(String otp) {
    	OTP.sendKeys(otp);
    	
    }
    
    @FindBy (id="email")
    WebElement Email;
    public void SstEmail(String email) {
    	Email.sendKeys(email);
    }
    @FindBy(xpath="//*[@id=\"basic-info\"]/div/div[4]/div[2]/fieldset/div/div[12]/div/div[2]/div/div[1]/label/span")
    WebElement Gender;
    
    public void SetGender() {
    	Gender.click();
    }
    @FindBy(id="marital_status")
    WebElement MS;
    
    public void SetMaritalStatus(String ms) {
    	Select co1= new Select(MS);
		co1.selectByVisibleText(ms);
    }
    @FindBy(id="religion")
    WebElement Religion;
    public void SetReligion(String religion) {
    	Select co1= new Select(Religion);
		co1.selectByVisibleText(religion);
    }
    @FindBy(id="photo")
    WebElement Photo;
    public void UploadPhoto(String photo) {
    	Photo.sendKeys(photo);
    }
    
    @FindBy(id="signature")
    WebElement Signature;
    
    public void uploadSignature(String signature) {
    	Signature.sendKeys(signature);
    }
    
    @FindBy(xpath="//*[@id=\"enable_after_nid_verification\"]/div/button")
    WebElement Next1;
    public void ClickNext() {
    	Next1.click();
    	
    }
    
    //Address
    @FindBy(id="permanent_division")
    WebElement Division;
    public void SetDivision(String division) {
    	Select co1= new Select(Division);
		co1.selectByVisibleText(division);
    }
    
    @FindBy(id="permanent_district")
    WebElement District;
     public void setDistrict(String district) {
    	 Select co1= new Select(District);
 		co1.selectByVisibleText(district);
    }
     
    @FindBy(xpath="//*[@id=\"address\"]/div/div[1]/div/fieldset/div[1]/div[3]/div/div/span/span[1]/span") 
     WebElement Thana;
    public void ClickThana() {
    	Thana.click();
    }
    
    @FindBy(xpath="/html/body/span/span/span[1]/input")
    WebElement ThanaN;
    
    
    public void setThanaName(String thanan) {
    	//Select co1= new Select(Thana);
 		//co1.selectByVisibleText("thana");
    	ThanaN.sendKeys(thanan);
    }
    
    @FindBy(id="permanent_post_office_name")
    WebElement POE;
    
    public void SetPostOfficeNameEng(String poe) {
    	POE.sendKeys(poe);
    }
    
    @FindBy(id="permanent_post_code")
    WebElement PCODE;
    
    public void SetPostalCode(String pcode) {
    	PCODE.sendKeys(pcode);
    }
    @FindBy(id="permanent_address")
    WebElement PAdd;
    
    public void SetPermanentAddress(String padd) {
    	PAdd.sendKeys(padd);
    }
    
    @FindBy(xpath="//*[@id=\"address\"]/div/div[2]/fieldset/div/div/div/label/span")
     WebElement SAMEAS;
    public void ClickSameAsPA() {
    	SAMEAS.click();
    }

    @FindBy(xpath="//*[@id=\"enable_after_district_verification\"]/button")
     WebElement NextADD;
    public void ClickNextAddreessPage() {
    	NextADD.click();
    }
    
    //Education
    
    //HSC
    @FindBy(id="education_0_exam")
    WebElement HSC;
     public void setHSC(String hsc) {
    	 Select co1= new Select(HSC);
 		co1.selectByVisibleText(hsc);
    }
     @FindBy(id="select2-education_0_subject-container") 
     WebElement Subject;
    public void ClickSubject() {
    	Subject.click();
    }
    
    @FindBy(xpath="/html/body/span/span/span[1]/input")
    WebElement SubjectS;
    
    
    public void setSubjectSience(String subjects) {
    	
    	SubjectS.sendKeys(subjects);
    }
    
    
   @FindBy(id="education_0_other_exam_body_checkbox")
   WebElement HSCB;
   public void SelcetHscBoard() {
	   HSCB.click();
   }
   @FindBy(id="education_0_other_exam_body")
   WebElement HSCBValue;
   
   public void SetHscBoardName(String hscbv) {
	   HSCBValue.sendKeys(hscbv);
   }
   
   @FindBy(id="education_0_passing_year")
    WebElement HSCPYear;
   public void SetHscPassingYear() {
	   HSCPYear.click();
   }
   
   @FindBy(xpath="//*[@id=\"educationForm\"]/tr[1]/td[5]/div/ul/li[1]/div/div[3]/table/thead/tr/th[1]/span")
   WebElement HscYearClick1;
   public void setHscYearClick1() {
	   HscYearClick1.click();
	  
   }
   //2011 selecting
   @FindBy(xpath="//*[@id=\"educationForm\"]/tr[1]/td[5]/div[1]/ul/li[1]/div/div[3]/table/tbody/tr/td/span[3]")
   WebElement HSC11;
   
   public void setHSC2011() {
	   HSC11.click();
   }
   @FindBy(id="select2-education_0_result_type-container")
   WebElement SresultHSC;
   
   public void SelectHSCresult() {
	   SresultHSC.click();
   }
   @FindBy(xpath="/html/body/span/span/span[1]/input")
   WebElement HSCGPAField;
   
   public void ClickedGPAHSC(String hscgpafield) {
	   HSCGPAField.sendKeys(hscgpafield);
   }
   @FindBy(id="education_0_result")
   WebElement HSCResult;
   public void HscResult(String hscresult) {
	   HSCResult.sendKeys(hscresult);
   }

   //SSC
   
   @FindBy(id="education_1_exam")
   WebElement SSC;
    public void setSSC(String ssc) {
   	 Select co1= new Select(SSC);
		co1.selectByVisibleText(ssc);
   }
    @FindBy(id="select2-education_1_subject-container") 
    WebElement SubjectSSC;
   public void ClickSubjectSSC() {
   	SubjectSSC.click();
   }
   
   @FindBy(xpath="/html/body/span/span/span[1]/input")
   WebElement SSCS;
   public void SelectSSCGroup(String sscs) {
	   SSCS.sendKeys(sscs);
   }
   @FindBy(id="select2-education_1_exam_body-container")
   WebElement SSCBoard;
   
   public void selectSSCBoard() {
	   SSCBoard.click();
   }
   @FindBy(xpath="/html/body/span/span/span[1]/input")
   WebElement SSCBoadName;
   public void SetSSCBoadName(String sscbv) {
	   SSCBoadName.sendKeys(sscbv);
   }
   @FindBy(id="education_1_passing_year")
   WebElement SSCPYear;
  public void SetSscPassingYear() {
	   SSCPYear.click();
  }
   @FindBy(xpath="//*[@id=\"educationForm\"]/tr[2]/td[5]/div/ul/li[1]/div/div[3]/table/thead/tr/th[1]/span")
   WebElement SSCPYClick1;
   public void SetSSCPYClick1() {
	   SSCPYClick1.click();
   }
   @FindBy(xpath="//*[@id=\"educationForm\"]/tr[2]/td[5]/div/ul/li[1]/div/div[3]/table/tbody/tr/td/span[1]")
    WebElement SSC2009;
   
   public void SetSSC2009() {
	   SSC2009.click();
   }

   @FindBy(id="select2-education_1_result_type-container")
   WebElement SresultSSC;
   
   public void SelectSSCresult() {
	   SresultSSC.click();
   }
   @FindBy(xpath="/html/body/span/span/span[1]/input")
   WebElement SSCGPAField1;
   
   public void ClickedGPASSC(String sscgpafield) {
	   SSCGPAField1.sendKeys(sscgpafield);
   }
   @FindBy(id="education_1_result")
   WebElement SSCResult1;
   public void SscResult1(String sscresult1) {
	   SSCResult1.sendKeys(sscresult1);
   }
   @FindBy(xpath="//*[@id=\"nextButtonContainer\"]/button")
   WebElement EduNext;
   public void clickEducationPageNextButton() {
	   EduNext.click();
   }
   //Job Experience
   
   @FindBy(id="jobexperience_0_organization")
   WebElement ORGANIZATION1;
   
   public void setORGANIZATION(String org) {
	   ORGANIZATION1.sendKeys(org);
   }
   @FindBy(xpath="//*[@id=\"select2-jobexperience_0_designation-container\"]/span")
   WebElement DESIGNATION1;
   
   public void clickDESIGNATION() {
	   DESIGNATION1.click();
   }
   @FindBy(xpath="/html/body/span/span/span[1]/input")
   WebElement degEngg;
   public void setClick3RD_ENGINEER(String engg) {
	   degEngg.sendKeys(engg);
   }
   @FindBy(id="jobexperience_0_start_date")
   WebElement StartDate1;
   public void SetStartDate1(String SD) {
	   StartDate1.sendKeys(SD);
   }
   @FindBy(id="jobexperience_0_end_date")
   WebElement EndDate1;
   public void SetEndDate1(String ED) {
	   EndDate1.sendKeys(ED);
   }
   @FindBy(id="jobexperience_0_end_date")
   WebElement OfficeAdd1;
   public void SetOfficeAdd1(String oa) {
	   OfficeAdd1.sendKeys(oa);
   }
   
   @FindBy(xpath="//*[@id=\"next-or-auth-button\"]/button")
   WebElement JENext;
   public void clickJobExperienceNextButton() {
	   JENext.click();
   }
   
   //Certificate
   @FindBy(id="select2-training_0_course-container")
   WebElement Course1;
   public void CllickCourse() {
	   Course1.click();
	   
   }
   @FindBy(xpath="/html/body/span/span/span[1]/input")
   WebElement CourseName;
   public void setCouseName(String courseNamme) {
	   CourseName.sendKeys(courseNamme);
   }
   @FindBy(id="training_0_duration")
   WebElement CourseDuration;
   public void setCourseDuration(String courseDuration) {
	   CourseDuration.sendKeys(courseDuration);
   }
   @FindBy(id="training_0_type")
   WebElement CourseDtime;
   public void CllickCourseDtime(String CDT) {
	   Select button1= new Select(CourseDtime);
	   button1.deselectByVisibleText(CDT);
	   
   }
   @FindBy(id="addCertificateForm")
   WebElement addCourse;
   public void AddCourse() {
	   addCourse.click(); 
   }
   @FindBy(id="select2-training_1_course-container")
   WebElement Course2;
   public void CllickCourse2() {
	   Course2.click();
	   
   }
   @FindBy(xpath="/html/body/span/span/span[1]/input")
   WebElement CourseName2;
   public void setCouseName2(String courseNamme2) {
	   CourseName2.sendKeys(courseNamme2);
   }
   @FindBy(id="training_1_duration")
   WebElement CourseDuration2;
   public void setCourseDuration2(String courseDuration2) {
	   CourseDuration2.sendKeys(courseDuration2);
   }
   @FindBy(id="training_1_type")
   WebElement CourseDtime2;
   public void CllickCourseDtime2(String CDT2) {
	   Select button1= new Select(CourseDtime2);
	   button1.deselectByVisibleText(CDT2);
	   
   }
   
   
   
   
   
   @FindBy(xpath="//button[@class='btn btn-secondary trainingExpNext nextBtn']")
   WebElement CertificateNext;
   public void clickCertificateNextButton() {
	   //CertificateNext.click();
	   JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click()", CertificateNext);
	   
	   
   }
   
   
   //Declaration
   @FindBy(xpath="//p[contains(text(),'I hereby affirm that I have')]")
   WebElement DeclarationFinal;
   public void setDeclaration() {
	  // DeclarationFinal.click();
	   JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click()", DeclarationFinal);
	   
   }
   /*
   @FindBy(id="accepted")
   WebElement DeclarationFinal;
   public void setDeclaration() {
	   DeclarationFinal.click();


	   
   }*/
   @FindBy(xpath="//button[normalize-space()='Complete']")
   WebElement FComplete1ast;
   public void clickCompleteButton() {
	   //FComplete1ast.click();
	   JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click()", FComplete1ast);
   }
   @FindBy(xpath="/html/body/div[7]/div/div[6]/button[1]")
   WebElement ButtonYes;
   public void ClickYesButton() {
	   ButtonYes.click();
   }
   
   
}
