package TaskNov19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;
	public static Actions action;
	//1.method for launching browser
	//input browser name,url of page
	//singleton
//	public static base b=null;
//	public static base getInstance()
//	{	
//		if(b==null)
//		{
//		b=new base();
//		}
//		return b;
//	}
//	private base(){}
	public void setup(browser browser)
	{ 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\pro\\drivers\\chromedriver.exe");
//other browser will be  added in upcoming days
		//for other browsers follow the same structure
		switch(browser)
		{
		case CHROME:              
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			opt.addArguments("--disable-popups");
			opt.addArguments("--start-maximized");
			driver=new ChromeDriver(opt);
			action = new Actions(driver);
		break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions optf=new FirefoxOptions();
			optf.addArguments("disable-notifications");
			optf.addArguments("disable-popups");
			optf.addArguments("start-maximized");
			driver=new FirefoxDriver(optf);
		break;
		default:
			System.out.println("driver not found");
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch page with url
		//driver.get(url);
		//maximize the window
		driver.manage().window().maximize();	
		
	}
	//2.Method to quit browser
	public void finish()
	{
		driver.quit();;
	}
	//3.method to find single element
	//input locator type,element attribute
	public WebElement element(String locator,String path)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		switch((locator).toLowerCase())
		{
		case "id":
			return driver.findElement(By.id(path));
		case "css":
			return driver.findElement(By.cssSelector(path));
		case "xpath":
			return driver.findElement(By.xpath(path));
		case "tag":
			return driver.findElement(By.tagName(path));
		case "class":
			return driver.findElement(By.className(path));
		case "text":
			return driver.findElement(By.linkText(path));
		case "partial":
			return driver.findElement(By.partialLinkText(path));
		case "name":
			return driver.findElement(By.name(path));		
		}
		return null;
		}
	//4.method for finding elements
	//returns in list
	public List<WebElement> elements(String locator,String path)
	{
		switch((locator).toLowerCase())
		{
		case "id":
			return driver.findElements(By.id(path));
		case "css":
			return driver.findElements(By.cssSelector(path));
		case "xpath":
			return driver.findElements(By.xpath(path));
		case "tag":
			return driver.findElements(By.tagName(path));
		case "class":
			return driver.findElements(By.className(path));
		case "text":
			return driver.findElements(By.linkText(path));
		case "partial":
			return driver.findElements(By.partialLinkText(path));
		case "name":
			return driver.findElements(By.name(path));
	}
		return null;
	}
	//5.method to click the element
	public void click(WebElement ele)
	{
		ele.click();
	}
	//6.method to type text in the element
	public void type(WebElement ele,Keys enter)
	{
		ele.sendKeys(enter);
	}
	public void type(WebElement ele,String text)
	{
		ele.sendKeys(text);
	}
	
	//7.method for basic navigations
	public void navigate(String nav)
	{
		switch((nav).toLowerCase())
		{
		case "forward":
			driver.navigate().forward();
		case "back":
			driver.navigate().back();
		case "refresh":
			driver.navigate().refresh();	
		}
		
	}
	//8.method for simple alert
	public void simplealert()
	{
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	//method for confirm alert
	public void confirmalert(String say)
	{
		Alert al=driver.switchTo().alert();
		if(say.equals("ok"))
		{
		al.accept();
		}
		else {
			al.dismiss();
		}
	}
	//9.method for prompt alert
	public void promptalert(String say,String type)
	{
		Alert al=driver.switchTo().alert();
		switch((say).toLowerCase())
		{
		case "type":
			al.sendKeys(type);
			//System.out.println(al.getText());
			break;
		case "ok":
			al.accept();;
			break;
		case "cancel":
			al.dismiss();;
			break;	
		}
	}
	//10.Method for iframes
	//entering iframe input; methodtype,frameindex,framename or id
	public void enterframe(String type,int index,String frame)
	{
		switch((type).toLowerCase())
		{
		case "name"://by frame name  or id
			driver.switchTo().frame(frame);
			break;
		case "index"://by iframe index
		driver.switchTo().frame(index);
		break;
		}			
	}
	//11.method for coming out of parent frame
	//input; type(parent or default frame)
	public void exitframe(String data)
	{
		//by parent frame
		if(data.equals("parent"))
		{
			driver.switchTo().parentFrame();
		}//by default content
		else if(data.equals("default"))
		{
		driver.switchTo().defaultContent();
		}
	}
	//12.method to check element is selected
	public boolean selected(WebElement ele)
	{
		return ele.isSelected();
	}
	//13.method to check element is enabled
	public boolean enabled(WebElement ele)
	{
		return ele.isEnabled();
	}
	//14.method to check element is displayed
	public boolean displayed(WebElement ele)
	{
		return ele.isDisplayed();
	}
	//15.method for window handle
	public void window()
	{
		String window= driver.getWindowHandle();
		driver.switchTo().window(window);
	}
	//16.method for  handling many windows
	public void windows(int index)
	{
		Set<String> win=driver.getWindowHandles();
		LinkedList<String> wind=new LinkedList<String>(win);
		if(index<wind.size())
		{
		driver.switchTo().window(wind.get(index));
		}
		else {
			System.out.println("Enter valid window index");
		}
	}
	//17.method to  take screenshot
	//note imput:screenshotname.fileformat(img/png)
//	public void screenshot(String scname)
//	{
//		File src=driver.getScreenshotAs(OutputType.FILE);
//	String	loc="C:\\Users\\karth\\eclipse-workspace\\cuccumber\\target";
//	String format=".png";
//		String path=loc+scname+format;
//		System.out.println(path);
//		File des=new File(path);
//		try {
//			FileHandler.copy(src, des);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	//18.method for both single and multiple select dropdown
	public void dropdown(WebElement dropdown,String value)
	{
		Select sc=new Select(dropdown);
		if(sc.isMultiple())//multiselect dropdown
		{
			sc.selectByVisibleText(value);
		}
		else//single select dropdown
		{
			sc.selectByVisibleText(value);
		}
	}
	//19.Basic method for web table
	public void webtable(WebElement table,String exp)
	{
		WebElement body=table.findElement(By.tagName("tbody"));
		List<WebElement> rows=body.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			WebElement row=rows.get(i);
			List<WebElement> column=row.findElements(By.tagName("td"));
			for(int j=0;j<column.size();j++)
			{
				WebElement data=column.get(j);
				String act=data.getText();
			if(act.equals(exp))
			{
				System.out.println(act);
			}
			}
		}
	}
	public void draganddrop(WebElement src,WebElement target)
	{
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, target).perform();
	}
	public void draganddropby(WebElement src,int x,int y)
	{
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(src, x, y).perform();		
	}
	public void moveto(WebElement target)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(target).perform();		
	}
	public void actionclick(String act,WebElement target)
	{
		Actions ac=new Actions(driver);
		switch(act)
		{
		case "double":
			ac.doubleClick(target).perform();
		case "rightclick":
			ac.contextClick(target).perform();
		}
	}
	public void implicitwait(int x)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(x));
	}
	public void scroll(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}

	public String readproperty(String path,String key) throws Exception
	
	{File props=new File("C:\\Users\\karth\\eclipse-workspace\\cuccumber\\src\\test\\resources\\utility.property");
	FileInputStream f1=new FileInputStream(props);
	Properties pro=new Properties();
	pro.load(f1);	
		return pro.getProperty(key);
	}
	public void writeproperty(String path, String key, String value) throws FileNotFoundException {
		File props=new File("C:\\Users\\karth\\eclipse-workspace\\cuccumber\\src\\test\\resources\\utility.property");
		FileOutputStream f2=new FileOutputStream(props);
		Properties pro=new Properties();
		pro.setProperty(key, value);
		pro.save(f2,"updated");
		
	}
//	public void brokenLinks(String websitename) throws MalformedURLException, IOException {
//		List<WebElement> links=By.elements("tag", "link");
//		Iterator<WebElement> iter=links.iterator();
//		while(iter.hasNext())
//		{
//			WebElement ele=iter.next();
//			String href=ele.getAttribute("href");
//			if(href.isEmpty()||href==null)
//			{
//				System.out.println(href +":" + "Link is empty");
//			}
//			else if(href.contains(websitename))
//			{
//			HttpURLConnection http=(HttpURLConnection)(new URL(href).openConnection());
//			http.setRequestMethod("HEAD");
//			http.connect();
//			System.out.println(href +":" + "Link is related to our website");
//			}
//			else
//			{
//				System.out.println(href +":" + "Link not related to our website");
//			}
//		}
//	}
	public void expWait(WebElement ele) {
	WebDriverWait wc=new WebDriverWait(driver,Duration.ofSeconds(30));
	wc.until(ExpectedConditions.visibilityOf(ele));
		
	}
	public void pagelaunch(String url) {
		driver.get(url);
		
	}
	public String pageTitle()
	{
		return driver.getTitle();
	}
	
	

}
