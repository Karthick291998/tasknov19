package TaskNov19;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;

public interface ibase {
	void setup(browser browser);
	void pagelaunch(String url);
	void finish();
	WebElement element(String locator,String path);
	List<WebElement> elements(String locator,String path);
	void click(WebElement ele);
	void type(WebElement ele,String data);
	void navigate(String nav);
	void simplealert();
	void confirmalert(String say);
	void promptalert(String say,String type);
	void enterframe(String type,int index,String frame);
	void exitframe(String data);
	boolean selected(WebElement ele);
	boolean enabled(WebElement ele);
	boolean displayed(WebElement ele);
	void window();
	void windows(int index);
	void screenshot(String scname);
	void dropdown(WebElement dropdown,String value);
	void webtable(WebElement table,String exp);
	void scroll(WebElement element);
	void implicitwait(int x);
	void actionclick(String act,WebElement target);
	void moveto(WebElement target);
	void draganddropby(WebElement src,int x,int y);
	void draganddrop(WebElement src,WebElement target);
	String readproperty(String path,String key) throws FileNotFoundException, Exception;
	void writeproperty(String path,String key,String value) throws FileNotFoundException;
	void brokenLinks(String websitename) throws MalformedURLException, IOException;
	void expWait(WebElement ele); 
	
			

}
