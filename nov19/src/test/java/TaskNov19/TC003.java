package TaskNov19;

import org.openqa.selenium.WebElement;

import ObjectTaskNov19.TCOO3Object;
import ObjectTaskNov19.TCOO3Object;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC003 {
	base b1=new base();
	TCOO3Object t1=new TCOO3Object();
@When("Select the Lab Test tab TC3")
public void select_the_Lab_Test_tab_TC3() {
	try {
		b1.click(t1.getLabTest());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Select any Certified Lab partner TC3")
public void select_any_Certified_Lab_partner_TC3() {
	try {
		b1.click(t1.getCertifiedPartner());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Choose the Test type TC3")
public void choose_the_Test_type_TC3() {
	try {
		b1.click(t1.getTestType());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}	
   }

@When("Enter the number of patients TC3")
public void enter_the_number_of_patients_TC3() {
	try {
		b1.click(t1.getBook());
		b1.click(t1.getPatCount());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

@When("Click ViewCart button TC3")
public void click_ViewCart_button_TC3() {
   
}

@Then("Check the Test type and Patient count in Cart page TC3")
public void check_the_Test_type_and_Patient_count_in_Cart_page_TC3() {
	try {
		WebElement labDetails=t1.getLabDetails();
		String labText=labDetails.getText();
		WebElement patientCount=t1.getPatientCount();
		String pcText=patientCount.getText();
		if(labText.equals("Uric Acid Test") && pcText.equals("2 patients"))
		{
			System.out.println("TC003 passed");
		}
		else
		{
			System.out.println("TC003 failed");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
  }

	}
