package ObjectTaskNov19;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TaskNov19.base;

public class TCOO2Object {
	public TCOO2Object()
	{
		PageFactory.initElements(base.driver,this);
		
		}
		@FindBy(xpath ="//a[@class='Navbar_medicine__AoMQm']")
		private WebElement medicine;
		public WebElement getMedicine() {
			return medicine;
		}
		@FindBy(xpath ="//div[@class='SearchStrip_lhs__PXeX_']")
		private WebElement searchbox;
		public WebElement getSearchbox() {
			return searchbox;
		}
		@FindBy(xpath ="//div[text()='Ecosprin 75mg Strip Of 14 Tablets']")
		private WebElement suggestion;
		public WebElement getSuggestion() {
			return suggestion;
		}
		@FindBy(xpath ="//button[@id='proceed' and text()='Add To Cart']")
		private WebElement product;
		@FindBy(xpath ="//li[@data-value='4']")
		private WebElement quantity;
		@FindBy(xpath ="//button[@id='proceed']//span")
		private WebElement viewcart;
		@FindBy(xpath ="//p[text()='Ecosprin 75mg Strip Of 14 Tablets']")
		private WebElement productDetails;
		@FindBy(xpath ="//div[text()='Qty 4']")
		private WebElement quantityCount;
		public WebElement getProduct() {
			return product;
		}
		public WebElement getQuantity() {
			return quantity;
		}
		public WebElement getViewcart() {
			return viewcart;
		}
		public WebElement getProductDetails() {
			return productDetails;
		}
		public WebElement getQuantityCount() {
			return quantityCount;
		}


}
