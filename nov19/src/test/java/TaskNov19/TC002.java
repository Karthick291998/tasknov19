package TaskNov19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import ObjectTaskNov19.TCOO1Object;
import ObjectTaskNov19.TCOO2Object;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC002 {
	base b1=new base();
	TCOO2Object t1=new TCOO2Object();
@When("Select the medicine tab TC2")
public void select_the_medicine_tab_TC2() {
	try
	{
	b1.click(t1.getMedicine());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Enter valid medicine and click search button TC2")
public void enter_valid_medicine_and_click_search_button_TC2() throws InterruptedException {
	try
	{
	b1.click(t1.getSearchbox());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
   }

@Then("Check the error message showing on the screen TC2")
public void check_the_error_message_showing_on_the_screen_TC2() {
	String act="💊 Order Medicines Online at Flat 24% Off | Home Delivery";
	String exp=b1.pageTitle();
	if(act.equals(exp))
	{
		System.out.println("Enter valid medicine");
		System.out.println("TC002 passed");
	}
   }



}
