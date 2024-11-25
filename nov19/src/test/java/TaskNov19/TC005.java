package TaskNov19;

import org.openqa.selenium.WebElement;

import ObjectTaskNov19.TCOO5Object;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC005 {
	base b1=new base();
	TCOO5Object t1=new TCOO5Object();
@When("Select the Pincode button TC5")
public void select_the_Pincode_button_TC5() {
	try
	{
	b1.click(t1.getPinIcon());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Enter the Pincode,Address and click Check button TC5")
public void enter_the_Pincode_Address_and_click_Check_button_TC5() {
	try
	{
	WebElement pincode=t1.getPinCode();
	b1.type(pincode,"628002");
	b1.click(t1.getCheck());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
  }

@When("Select the medicine tab TC5")
public void select_the_medicine_tab_TC5() throws InterruptedException {
	Thread.sleep(3000);
	try
	{
	b1.click(t1.getMedicine());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	b1.click(b1.element("xpath","//span[@class='Navbar_navLinkLabel___BPGF']"));
    }

@When("Enter valid medicine and click search button TC5")
public void enter_valid_medicine_and_click_search_button_TC5() {
	try
	{
	b1.click(t1.getSearchbox());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Choose particular product from product list TC5")
public void choose_particular_product_from_product_list_TC5() {
	try
	{
	b1.click(t1.getSuggestion());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Click AddToCart button TC5")
public void click_AddToCart_button_TC5() {
	try
	{
	b1.click(t1.getProduct());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Enter quantity of product and click ViewCart button TC5")
public void enter_quantity_of_product_and_click_ViewCart_button_TC5() {
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

@Then("Check the product name and quantity in Cart page TC5")
public void check_the_product_name_and_quantity_in_Cart_page_TC5() {
	try
	{
   WebElement location=t1.getLocation();
   String actLocation=location.getText();
   String expLocation="628002 Tuticorin-2";
   if(actLocation.equals(expLocation))
   {
	   System.out.println("TC005 passed");
	   System.out.println("Location is updated");
   }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

}
