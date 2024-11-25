package ObjectTaskNov19;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TaskNov19.base;

public class TCOO3Object {
	public TCOO3Object()
	{
		PageFactory.initElements(base.driver,this);
		}
		@FindBy(xpath ="//a[@class='Navbar_labTests__2SoAH']")
		private WebElement labTest;
		@FindBy(xpath ="//div[@class='_2viMf _1d8Yq' and text()='PharmEasy Labs (Thyrocare powered)']")
		private WebElement certifiedPartner;
		@FindBy(xpath ="//div[@class='PRjss']//h2[text()='Uric Acid Test']")
		private WebElement testType;
		@FindBy(xpath ="//button[@id='book-test-btn-pdp']")
		private WebElement book;
		@FindBy(xpath ="//div[@id='patient-2']")
		private WebElement patCount;
		@FindBy(xpath ="//p[text()='Uric Acid Test']")
		private WebElement labDetails;
		@FindBy(xpath ="//div[@id='cart-card-0-selectPatient']")
		private WebElement patientCount;
		public WebElement getLabTest() {
			return labTest;
		}
		public WebElement getCertifiedPartner() {
			return certifiedPartner;
		}
		public WebElement getTestType() {
			return testType;
		}
		public WebElement getPatCount() {
			return patCount;
		}
		public WebElement getLabDetails() {
			return labDetails;
		}
		public WebElement getPatientCount() {
			return patientCount;
		}
		public WebElement getBook() {
			return book;
		}

}
