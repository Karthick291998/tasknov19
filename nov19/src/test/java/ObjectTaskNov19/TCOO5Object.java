package ObjectTaskNov19;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TaskNov19.base;

public class TCOO5Object {
	public TCOO5Object()
	{
		PageFactory.initElements(base.driver,this);
		}
		@FindBy(xpath ="//div[@class='PincodeTrigger_wrapper___dldv']")
		private WebElement pinIcon;
		@FindBy(xpath ="//input[@class='Input_input__AFI4R PincodeDrawer_pincodeInput__ar6v7']")
		private WebElement pinCode;
		@FindBy(xpath ="//button[text()='Check']")
		private WebElement check;
		@FindBy(xpath ="//a[@class='Navbar_medicine__AoMQm']")
		private WebElement medicine;
		@FindBy(xpath ="//div[@class='SearchStrip_lhs__PXeX_']")
		private WebElement searchbox;
		@FindBy(xpath ="//div[text()='Ecosprin 75mg Strip Of 14 Tablets']")
		private WebElement suggestion;
		@FindBy(xpath ="//button[@id='proceed' and text()='Add To Cart']")
		private WebElement product;
		@FindBy(xpath ="//li[@data-value='4']")
		private WebElement quantity;
		@FindBy(xpath ="//button[@id='proceed']//span")
		private WebElement viewcart;
		@FindBy(xpath ="//span[@class='PincodeTrigger_pinDetailsText__2M8UP']")
		private WebElement location;
		public WebElement getPinIcon() {
			return pinIcon;
		}
		public WebElement getPinCode() {
			return pinCode;
		}
		public WebElement getCheck() {
			return check;
		}
		public WebElement getMedicine() {
			return medicine;
		}
		public WebElement getSearchbox() {
			return searchbox;
		}
		public WebElement getSuggestion() {
			return suggestion;
		}
		public WebElement getProduct() {
			return product;
		}
		public WebElement getQuantity() {
			return quantity;
		}
		public WebElement getViewcart() {
			return viewcart;
		}
		public WebElement getLocation() {
			return location;
		}
}
