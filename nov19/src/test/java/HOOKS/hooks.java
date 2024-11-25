package HOOKS;
import TaskNov19.base;
import TaskNov19.browser;
import io.cucumber.java.en.Given;

public class hooks {
	base b1=new base();
	@Given("Launch the browser and website")
	public void launch_the_browser_and_website() {
		try {
		b1.setup(browser.CHROME);
		b1.pagelaunch("https://pharmeasy.in/online-medicine-order?isSEM=true&utm_source=google&utm_medium=cpc&utm_campaign=ITW_Brand_FP_Exact&gad_source=1&gclid=CjwKCAiArva5BhBiEiwA-oTnXdhGnsYKHN5z5cAPJOTXoCnCfDM8SD6OLBbCKbq-lKHmSQOVncpgfhoCLzsQAvD_BwE"); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}


}
