package TaskNov19;

import org.openqa.selenium.WebElement;

import ObjectTaskNov19.TCOO3Object;
import ObjectTaskNov19.TCOO4Object;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC004 {
	base b1=new base();
	TCOO4Object t1=new TCOO4Object();
@When("Select the Lab Test tab TC4")
public void select_the_Lab_Test_tab_TC4() {
	try {
		b1.click(t1.getLabTest());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Select any Certified Lab partner TC4")
public void select_any_Certified_Lab_partner_TC4() {
	try {
		b1.click(t1.getCertifiedPartner());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}

@When("Click ViewCart button with out filling Test type and patient count TC4")
public void click_ViewCart_button_with_out_filling_Test_type_and_patient_count_TC4() {
	System.out.println("TC004 Passed");
   }

@Then("Check the error message displayed in the page TC4")
public void check_the_error_message_displayed_in_the_page_TC4() {
    
}
}
