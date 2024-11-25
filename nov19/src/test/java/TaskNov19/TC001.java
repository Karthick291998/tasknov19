package TaskNov19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ObjectTaskNov19.TCOO1Object;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001 extends base {
	base b1=new base();
	TCOO1Object t1=new TCOO1Object();

@When("Select the medicine tab TC1")
public void select_the_medicine_tab_TC1() {
	try
	{
	b1.click(t1.getMedicine());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Enter valid medicine and click search button TC1")
public void enter_valid_medicine_and_click_search_button_TC1() {
	try
	{
	b1.click(t1.getSearchbox());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
 
}

@When("Choose particular product from product list TC1")
public void choose_particular_product_from_product_list_TC1() {
	try
	{
	b1.click(t1.getSuggestion());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Click AddToCart button TC1")
public void click_AddToCart_button_TC1() {
	try
	{
	b1.click(t1.getProduct());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Enter quantity of product and click ViewCart button TC1")
public void enter_quantity_of_product_and_click_ViewCart_button_TC1() {
	try
	{
	b1.click(t1.getQuantity());
	b1.click(t1.getViewcart());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

  }

@Then("Check the product name and quantity in Cart page TC1")
public void check_the_product_name_and_quantity_in_Cart_page_TC1() {
	try
	{
	WebElement productDetails=t1.getProductDetails();
	WebElement quantityCount=t1.getQuantityCount();
	String pdText=productDetails.getText();
	String qText=quantityCount.getText();
	if(pdText.equals("Ecosprin 75mg Strip Of 14 Tablets") && qText.equals("Qty 4"))
	{
		System.out.println("TC001 passed");
	}
	else
	{
		System.out.println("TC001 failed");
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

}
