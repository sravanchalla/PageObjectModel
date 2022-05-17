package wrappers;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
 
	public static RemoteWebDriver driver;
	public static Properties prop;
	
	public void loadObjects() {
		try {
		    prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unLoadObjects() {
		prop = null;
	}
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
	  try {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		    driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		  driver.manage().window().maximize();
		  driver.get(url);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //System.out.println("The browser " +browser+ " is launched with given url " +url+ " successfully");
		  reportStep("The browser "+browser+" is launched with given url "+url+" successfully", "pass");
	} catch (InvalidArgumentException e) {
		// TODO Auto-generated catch block
		 // System.err.println("The browser " +browser+ " is not launched with url as URL doesnot contain http/https");
		  reportStep("The browser "+browser+" is not launched with url as URL doesnot contain http/https", "fail");
	} catch (SessionNotCreatedException e) {
		// TODO: handle exception
		 //System.err.println("The browser " +browser+ " is not launched due to session not created error");
		 reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
	} catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The browser " +browser+ " is not launched due to unknown error");
		reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
	}

	}
	

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
	//		System.out.println("The element with id " +idValue+ " is entered with data " +data+ " successfully");
			reportStep("The element with id "+idValue+" is entered with data "+data+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with id " +idValue+ " is not found in The DOM");
			reportStep("The element with id "+idValue+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +idValue+ " is not visible in The application");
			reportStep("The element with id "+idValue+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +idValue+ " is not interactable in The application");
			reportStep("The element with id "+idValue+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +idValue+ " is not stable in The application");
			reportStep("The element with id "+idValue+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +idValue+ " is not entered with data " +data+ " due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
	//		System.out.println("The element with name " +nameValue+ " is entered with data " +data+ " successfully");
			reportStep("The element with name "+nameValue+" is entered with data "+data+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with name " +nameValue+ " is not found in The DOM");
			reportStep("The element with name "+nameValue+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with name " +nameValue+ " is not visible in The application");
			reportStep("The element with name "+nameValue+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with name " +nameValue+ " is not interactable in The application");
			reportStep("The element with name "+nameValue+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with name " +nameValue+ " is not stable in The application");
			reportStep("The element with name "+nameValue+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with name " +nameValue+ " is not entered with The data " +data+ " due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with The data "+data+" due to unknown error", "fail");
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
	//		System.out.println("The element with xpath " +xpathValue+ " is entered with data " +data+ " successfully");
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with xpath " +xpathValue+ " is not found in The DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpathValue+ " is not visible in The application");
			reportStep("The element with xpath "+xpathValue+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathValue+ " is not interactable in The application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpathValue+ " is not stable in The application");
			reportStep("The element with xpath "+xpathValue+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpathValue+ " is not entered with data " +data+ " due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "fail");
		}
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if (actualTitle.equals(title)) {
			//	System.out.println("The title of The page " +actualTitle+ " is matched with expected title " +title);
				reportStep("The title of The page "+actualTitle+" is matched with expected title "+title, "pass");
			}else {
	//			System.err.println("The title of The page " +actualTitle+ " is not matched with expected title " +title);
				reportStep("The title of The page "+actualTitle+" is not matched with expected title "+title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The title of The page cannot be verified due to unknown error");
			reportStep("The title of The page cannot be verified due to unknown error", "fail");
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if (actualText.equals(text)) {
		//		System.out.println("The element with id " +id+ " is having The text " +actualText+ " is matched with expected text " +text);
				reportStep("The element with id "+id+" is having The text "+actualText+" is matched with expected text "+text, "pass");
			}else {
		//		System.err.println("The element with id " +id+ " is having The text " +actualText+ " is not matched with expected text " +text);
				reportStep("The element with id "+id+" is having The text "+actualText+" is not matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with id " +id+ " is not found in The DOM");
			reportStep("The element with id "+id+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +id+ " is not visible in The application");
			reportStep("The element with id "+id+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +id+ " is not interactable in The application");
			reportStep("The element with id "+id+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +id+ " is not stable in The application");
			reportStep("The element with id "+id+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The text of The element with id " +id+ " is not verified due to unknown error");
			reportStep("The text of The element with id "+id+" is not verified due to unknown error", "fail");
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
		//		System.out.println("The element with xpath " +xpath+ " is having The text " +actualText+ " is matched with expected text " +text);
				reportStep("The element with xpath "+xpath+" is having The text "+actualText+" is matched with expected text "+text, "pass");
			}else {
		//		System.err.println("The element with xpath " +xpath+ " is having The text " +actualText+ " is not matched with expected text " +text);
				reportStep("The element with xpath "+xpath+" is having The text "+actualText+" is not matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with xpath " +xpath+ " is not foundd in The DOM");
			reportStep("The element with xpath "+xpath+" is not foundd in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpath+ " is not visible in The application");
			reportStep("The element with xpath "+xpath+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpath+ " is not interactable in The application");
			reportStep("The element with xpath "+xpath+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpath+ " is not stable in The application");
			reportStep("The element with xpath "+xpath+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The text of The element with xpath " +xpath+ " is not verified due to unknown error");
			reportStep("The text of The element with xpath "+xpath+" is not verified due to unknown error", "fail");
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			 if (actualText.contains(text)) {
		//		System.out.println("The element with xpath " +xpath+ " is contains The text " +actualText+ " is matched with expected text " +text);
				reportStep("The element with xpath "+xpath+" is contains The text "+actualText+" is matched with expected text "+text, "pass");
			}else {
		//		System.err.println("The element with xpath " +xpath+ " is contains The text " +actualText+ " is not matched with expected text " +text);
				reportStep("The element with xpath "+xpath+" is contains The text "+actualText+" is not matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//     System.err.println("The element with xpath " +xpath+ " is not found in The DOM");
		     reportStep("The element with xpath "+xpath+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpath+ " is not visible in The application");
			reportStep("The element with xpath "+xpath+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpath+ " is not interactable in The application");
			reportStep("The element with xpath "+xpath+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpath+ " is not stable in The application");
			reportStep("The element with xpath "+xpath+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The text of The element with " +xpath+ " is not verified due to unknown error");
			reportStep("The text of The element with "+xpath+" is not verified due to unknown error", "fail");
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
	//		System.out.println("The element with id " +id+ " is clicked successfully");
			reportStep("The element with id "+id+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with id " +id+ " is not found in The DOM");
			reportStep("The element with id "+id+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +id+ " is not visible in The application");
			reportStep("The element with id "+id+" is not visible in The application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +id+ " is not intercepted in The application");
			reportStep("The element with id "+id+" is not intercepted in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +id+ " is not interactable in The application");
			reportStep("The element with id "+id+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +id+ " is not stable in The application");
			reportStep("The element with id "+id+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +id+ " is not clicked due to unknown error");
			reportStep("The element with id "+id+" is not clicked due to unknown error", "fail");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
	//		System.out.println("The element with classname " +classVal+ " is clicked successfully");
			reportStep("The element with classname "+classVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with classname " +classVal+ " is not found in The DOM");
			reportStep("The element with classname "+classVal+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
	//		System.err.println("The element with classname " +classVal+ " is not visible in The application");
			reportStep("The element with classname "+classVal+" is not visible in The application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
	//		System.err.println("The element with classname " +classVal+ " is not intercepted in The application");
			reportStep("The element with classname "+classVal+" is not intercepted in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with classnam " +classVal+ " is not interactable in The application");
			reportStep("The element with classnam "+classVal+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with classname " +classVal+ " is not stable in The application");
			reportStep("The element with classname "+classVal+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with classname " +classVal+ " is not clicked due to unknown error");
			reportStep("The element with classname "+classVal+" is not clicked due to unknown error", "fail");
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
	//		System.out.println("The element with name " +name+ " is clicked successfully");
			reportStep("The element with name "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with name " +name+ " is not found in The DOM");
			reportStep("The element with name "+name+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException  e) {
			// TODO: handle exception
//			System.err.println("The element with name " +name+ " is not visible in The application");
			reportStep("The element with name "+name+" is not visible in The application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
	//		System.err.println("The element with name " +name+ " is not intercepted in The application");
			reportStep("The element with name "+name+" is not intercepted in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with name " +name+ " is not interactable in The application");
			reportStep("The element with name "+name+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with name " +name+ " is not stable in The application");
			reportStep("The element with name "+name+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with name " +name+ " is not clicked due to unknown error");
			reportStep("The element with name "+name+" is not clicked due to unknown error", "fail");
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
		//	System.out.println("The element with linktext " +name+ " is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with linktext " +name+ " is not found in DOM");
			reportStep("The element with linktext "+name+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with linktext " +name+ " is not visible in The application");
			reportStep("The element with linktext "+name+" is not visible in The application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with linktext " +name+ " is not intercepted in The application");
			reportStep("The element with linktext "+name+" is not intercepted in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with linktext " +name+ " is not interactable in The application");
			reportStep("The element with linktext "+name+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with linktext " +name+ " is not stable in The application");
			reportStep("The element with linktext "+name+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with linktext " +name+ " is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error", "fail");
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
	//		System.out.println("The element with linktext " +name+ " is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with linktext " +name+ " is not found in The DOM");
			reportStep("The element with linktext "+name+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with linktext " +name+ " is not visible in The application");
			reportStep("The element with linktext "+name+" is not visible in The application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with linktext " +name+ " is not intercepted in The application");
			reportStep("The element with linktext "+name+" is not intercepted in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with linktext " +name+ " is not interactable in The application");
			reportStep("The element with linktext "+name+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with linktext " +name+ " is not stable in The application");
			reportStep("The element with linktext "+name+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with linktext " +name+ " is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error", "fail");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
	//		System.out.println("The element with xpath " +xpathVal+ " is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with xpath " +xpathVal+ " is not found in The DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not visible in The application");
			reportStep("The element with xpath "+xpathVal+" is not visible in The application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not intercepted in The application");
			reportStep("The element with xpath "+xpathVal+" is not intercepted in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not interactable in The application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not stable in The application");
			reportStep("The element with xpath "+xpathVal+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
	}
	
	public void clickByXpath(String xpathVal, String expectedValue) {
		// TODO Auto-generated method stub
		String actualXPath=null;
		   try {
		    	if(xpathVal.contains("$option$")) {
				 actualXPath = xpathVal.replace("$option$", expectedValue);
				 driver.findElementByXPath(actualXPath).click();
		} else {
				driver.findElementByXPath(xpathVal).click();
		}
			//System.out.println("The Element with Xpath "+xpathVal+" is clicked");
			reportStep("The Element with Xpath "+actualXPath+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The Element with Xpath "+actualXPath+" is not found in DOM", "fail");  
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with Xpath "+actualXPath+" is not visible in the application", "fail");
        } catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Intercepted in the application");
			reportStep("The Element with Xpath "+actualXPath+" is clickable in the application", "fail");
        } catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with Xpath "+xpathVal+" is not Interactable in the application");
			reportStep("The Element with Xpath "+actualXPath+" is not Interactable in the application", "fail");
        } catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Stable in the application");
			reportStep("The Element with Xpath "+actualXPath+" is not Stable in the application", "fail");
        } catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not clicked due to Unknown error");
			reportStep("The Element with Xpath "+actualXPath+" is not clicked due to Unknown error", "fail");
		}
	}
	

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		 try {
			driver.findElementByXPath(xpathVal).click();
	//		System.out.println("The element with xpath " +xpathVal+ " is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with xpath " +xpathVal+ " is not found in The DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not visible in The application");
			reportStep("The element with xpath "+xpathVal+" is not visible in The application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpathVal+ " is not intercepted in The application");
			reportStep("The element with xpath "+xpathVal+" is not intercepted in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath " +xpathVal+ " is not interactable in The application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not stable in The application");
			reportStep("The element with xpath "+xpathVal+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualText = null;
		try {
			actualText = driver.findElementById(idVal).getText();
	//		System.out.println("The element with id " +idVal+ " is hold The text " +actualText+ " successfully");
			reportStep("The element with id "+idVal+" is hold The text "+actualText+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with id " +idVal+ " is not found in The DOM");
			reportStep("The element with id "+idVal+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +idVal+ " is not visible in The application");
			reportStep("The element with id "+idVal+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with id " +idVal+ " is not interactable in The application");
			reportStep("The element with id "+idVal+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +idVal+ " is not stable in The application");
			reportStep("The element with id "+idVal+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +idVal+ " is not getting The text due to unknown error");
			reportStep("The element with id "+idVal+" is not getting The text due to unknown error", "fail");
		}
		return actualText;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualtext = null;
		try {
			actualtext = driver.findElementByXPath(xpathVal).getText();
	//		System.out.println("The element with xpath " +xpathVal+ " is hold The text " +actualtext+ " successfully");
			reportStep("The element with xpath "+xpathVal+" is hold The text "+actualtext+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with xpath " +xpathVal+ " is not found in The DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not visible in The application");
			reportStep("The element with xpath "+xpathVal+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not interactable in The application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not stable in The application");
			reportStep("The element with xpath "+xpathVal+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with xpath " +xpathVal+ " is not getting The text due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not getting The text due to unknown error", "fail");
		}
		return actualtext;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementById(id);
			Select select = new Select(element);
			select.selectByVisibleText(value);
	//		System.out.println("The element with id " +id+ " is selected with visible text " +value+ " successfully");
			reportStep("The element with id "+id+" is selected with visible text "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with id " +id+ " is not found in The DOM");
			reportStep("The element with id "+id+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not visible in The application");
			reportStep("The element with id "+id+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not interactable in The application");
			reportStep("The element with id "+id+" is not interactable in The application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not selectable in The application");
			reportStep("The element with id "+id+" is not selectable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not stable in The application");
			reportStep("The element with id "+id+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not working due to unknown error");
			reportStep("The element with id "+id+" is not working due to unknown error", "fail");
		}
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementById(id);
			Select select = new Select(element);
			select.selectByIndex(value);
	//		System.out.println("The element with id " +id+ " is selected with value " +value+ " successfully");
			reportStep("The element with id "+id+" is selected with value "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with id " +id+ " is not found in The DOM");
			reportStep("The element with id "+id+" is not found in The DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not visible in The application");
			reportStep("The element with id "+id+" is not visible in The application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not interactable in The application");
			reportStep("The element with id "+id+" is not interactable in The application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not selectable in The application");
			reportStep("The element with id "+id+" is not selectable in The application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not stable in The application");
			reportStep("The element with id "+id+" is not stable in The application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with id " +id+ " is not working due to unknown error");
			reportStep("The element with id "+id+" is not working due to unknown error", "fail");
		}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String>allWinIDAfterClick = driver.getWindowHandles();
			for (String eachId : allWinIDAfterClick) {
				driver.switchTo().window(eachId);
		//		System.out.println("The parent window is switched");
				reportStep("The parent window is switched", "pass");
			break;
		  }
	    } catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The window is not switched to parent window due to no such window in that browser");
			reportStep("The window is not switched to parent window due to no such window in that browser", "fail");
	    }catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The window is not switched to parent window due to unknown error");
			reportStep("The window is not switched to parent window due to unknown error", "fail");
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String>allWinIdAfterClick = driver.getWindowHandles();
			for (String eachId : allWinIdAfterClick) {
				driver.switchTo().window(eachId);
			}
	//		System.out.println("The control is switched to last window");
			reportStep("The control is switched to last window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
	//	   System.err.println("The control is not switched to last window due to no such window in that browser");
		   reportStep("The control is not switched to last window due to no such window in that browser", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The control is not switched to last window due to unknown error");
			reportStep("The control is not switched to last window due to unknown error", "fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			Alert alert = driver.switchTo().alert();
			driver.switchTo().alert().accept();
	//		System.out.println("The opened alert is accepted");
			reportStep("The opened alert is accepted", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
	//	    System.err.println("The opened alert is not accepted due to no alert is present");
		    reportStep("The opened alert is not accepted due to no alert is present", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The opened alert is not accepted due to unknown error");
			reportStep("The opened alert is not accepted due to unknown error", "fail");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
	//		System.out.println("The opened alert is dismissed");
			reportStep("The opened alert is dismissed", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The opened alert is not dismissed due to no alert is present");
			reportStep("The opened alert is not dismissed due to no alert is present", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The opened alert is not dismissed due to unknown error");
			reportStep("The opened alert is not dismissed due to unknown error", "fail");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = null;
		try {
			
			 Alert alert = driver.switchTo().alert();
			 WebDriverWait wait = new WebDriverWait(driver, 10);
			 wait.until(ExpectedConditions.alertIsPresent());
			 alertText=driver.switchTo().alert().getText();
	//		 System.out.println("The text " +alertText+ " is getting from The alert");
			 reportStep("The text "+alertText+" is getting from The alert", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
	//		 System.err.println("The text is not getting due to no alert is present");
			 reportStep("The text is not getting due to no alert is present", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
	//		System.err.println("The text is not getting due to unhandled alert is present");
			reportStep("The text is not getting due to unhandled alert is present", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The text is not getting due to unknown error");
			reportStep("The text is not getting due to unknown error", "fail");
		}
		return alertText;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		long number = 0;
		try {
			
		number=(long) (Math.floor(Math.random()*100000000)+100000);
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
	       } catch (IOException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The screeshot of browser is not snapped due to file not found error");
			reportStep("The screeshot of browser is not snapped due to file not found error", "fail",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The screenshot of broswer is not snapped due to unknown error");
			reportStep("The screenshot of broswer is not snapped due to unknown error", "fail",false);
		}
		return number;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
	//		System.out.println("The active browser is closed");
			reportStep("The active browser is closed", "pass", false);
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The active browser is not closed due to session not created");
			reportStep("The active browser is not closed due to session not created", "fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The active browser is not closed due to unknown error");
			reportStep("The active browser is not closed due to unknown error", "fail", false);
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
	//		System.out.println("The all browsers are closed");
			reportStep("The all browsers are closed", "pass" , false);
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
	//	    System.err.println("The all browsers are not closed due to session not created");
		    reportStep("The all browsers are not closed due to session not created", "fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The all browsers are not closed due to unknown error");
			reportStep("The all browsers are not closed due to unknown error", "fail", false);
		}
	}

		public void waitProperty(long time) {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(time);
		//		System.out.println("The element is slept for " +time+ " milliseconds");
				reportStep("The element is slept for " +time+ " milliseconds", "pass",false);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
		//        System.err.println("The element is not slept due to interrupted error");
		        reportStep("The element is not slept due to interrupted error", "fail",false);
			} catch (WebDriverException e) {
				// TODO: handle exception
		//		System.err.println("The element is not slept due to unknown error");
				reportStep("The element is not slept due to unknown error", "fail",false);
			}
		}


		public void selectVisibleTextByXpath(String xpath, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpath);
				Select select = new Select(element);
				select.selectByVisibleText(value);
		//		System.out.println("The element with xpath " +xpath+ " is selected with value " +value+ " sucessfully");
				reportStep("The element with xpath "+xpath+" is selected with value "+value+" sucessfully", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The element with xpath " +xpath+ " is not found in the DOM");
				reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not visible in the application");
				reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not interactable in the application");
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
			} catch (ElementNotSelectableException e) {
				// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not selectable in the application");
				reportStep("The element with xpath "+xpath+" is not selectable in the application", "fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not stable in the application");
				reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not working due to unknown error");
				reportStep("The element with xpath "+xpath+" is not working due to unknown error", "fail");
			}
		}


		public void pageScrollDown() {
			// TODO Auto-generated method stub
			try {
				driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		//		System.out.println("The page is scrolled down successfully");
				reportStep("The page is scrolled down successfully", "pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The page is not scrolled due to unknown error");
				reportStep("The page is not scrolled due to unknown error", "fail");
			}
		}


		public void selectVisibleTextByClassName(String classname, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByClassName(classname);
				Select select = new Select(element);
				select.selectByVisibleText(value);
		//		System.out.println("The element with classname " +classname+ " is selected with value " +value+ " successfully");
				reportStep("The element with classname "+classname+" is selected with value "+value+" successfully", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The element with classname " +classname+ " is not found in the DOM");
				reportStep("The element with classname "+classname+" is not found in the DOM", "fail");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +classname+ " is not visible in the application");
				reportStep("The element with classname "+classname+" is not visible in the application", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +classname+ " is not interactable in the application");
				reportStep("The element with classname "+classname+" is not interactable in the application", "fail");
			} catch (ElementNotSelectableException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +classname+ " is not selectable in the application");
				reportStep("The element with classname "+classname+" is not selectable in the application", "fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +classname+ " is not stable in the application");
				reportStep("The element with classname "+classname+" is not stable in the application", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +classname+ " is not working due to unknown error");
				reportStep("The element with classname "+classname+" is not working due to unknown error", "fail");
			}
		}


		public void selectVisibleTextByName(String name, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByName(name);
				Select select = new Select(element);
				select.selectByVisibleText(value);
		//	    System.out.println("The element with classname " +name+ " is selected with value " +value+ " successfully");
			    reportStep("The element with classname "+name+" is selected with value "+value+" successfully", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The element with classname " +name+ " is not found in the DOM");
				reportStep("The element with classname "+name+" is not found in the DOM", "fail");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +name+ " is not visible in the application");
				reportStep("The element with classname "+name+" is not visible in the application", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +name+ " is not interactable in the application");
				reportStep("The element with classname "+name+" is not interactable in the application", "fail");
			} catch (ElementNotSelectableException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +name+ " is not selectable in the application");
				reportStep("The element with classname "+name+" is not selectable in the application", "fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +name+ " is not stable in the application");
				reportStep("The element with classname "+name+" is not stable in the application", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
		//		System.err.println("The element with classname " +name+ " is not working due to unknown error");
				reportStep("The element with classname "+name+" is not working due to unknown error", "fail");
			}
		}


		public void switchToFrameByWebElement(String xpathVal) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpathVal);
				driver.switchTo().frame(element);
		//		System.out.println("The new frame is switched");
				reportStep("The new frame is switched", "pass");
			} catch (NoSuchFrameException e) {
				// TODO Auto-generated catch block
		//	    System.err.println("The new frame is not switched due to no such frame error in the application");
			    reportStep("The new frame is not switched due to no such frame error in the application", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
		//		System.err.println("The new frame is not switched due to unknown error");
				reportStep("The new frame is not switched due to unknown error", "fail");
			}
		}


		public void switchToDefaultContent() {
			// TODO Auto-generated method stub
			try {
				driver.switchTo().defaultContent();
		//		System.out.println("The element is switched to default successfully");
				reportStep("The element is switched to default successfully", "pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The element is not switched due to unknown error");
				reportStep("The element is not switched due to unknown error", "fail");
			}
		}
		
		public String getAlertTextByNoSnap() {
			// TODO Auto-generated method stub
			String alertText = null;
			try {
				 alertText = driver.switchTo().alert().getText();
	//			 System.out.println("The text " +alertText+ " is getting from The alert");
				 reportStep("The text "+alertText+" is getting from The alert", "pass",false);
			} catch (NoAlertPresentException e) {
				// TODO Auto-generated catch block
	//			 System.err.println("The text is not getting due to no alert is present");
				 reportStep("The text is not getting due to no alert is present", "fail",false);
			} catch (UnhandledAlertException e) {
				// TODO: handle exception
		//		System.err.println("The text is not getting due to unhandled alert is present");
				reportStep("The text is not getting due to unhandled alert is present", "fail",false);
			} catch (WebDriverException e) {
				// TODO: handle exception
		//		System.err.println("The text is not getting due to unknown error");
				reportStep("The text is not getting due to unknown error", "fail",false);
			} return alertText;
		}


		public void refreshThePage() {
			// TODO Auto-generated method stub
			try {
				driver.navigate().refresh();
		//		System.out.println("The page is refreshed");
				reportStep("The page is refreshed", "pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The page is not getting refreshed due to unknown error");
				reportStep("The page is not getting refreshed due to unknown error", "fail");
			}
		}


		public void sendKeysToAlert(String value) {
			// TODO Auto-generated method stub
			try {
				driver.switchTo().alert().sendKeys(value);
			//	System.out.println("The element entered the value " +value+ " in alert");
				reportStep("The element entered the value "+value+" in alert", "pass");
			} catch (ElementNotInteractableException e) {
			//	System.err.println("The element is not interactable in the alert");	
				reportStep("The element is not interactable in the alert", "fail");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
			//    System.err.println("The element is not entered the value due to unknown error");
			    reportStep("The element is not entered the value due to unknown error", "fail");
			}
		}


		public void sendKeysToAlertByNoSnap(String value) {
			// TODO Auto-generated method stub
			try {
				driver.switchTo().alert().sendKeys(value);
	//			System.out.println("The element entered the value " +value+ " in alert");
				reportStep("The element entered the value "+value+" in alert", "pass",false);
			} catch (ElementNotInteractableException e) {
	//			System.err.println("The element is not interactable in the alert");	
				reportStep("The element is not interactable in the alert", "fail",false);
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
	//		    System.err.println("The element is not entered the value due to unknown error");
			    reportStep("The element is not entered the value due to unknown error", "fail",false);
			}
		}


		public void tabKey() {
			// TODO Auto-generated method stub
			try {
				driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
		//		System.out.println("The tabKey is accessed successfully");
				reportStep("The tabKey is accessed successfully", "pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The tabKey is not accessed due to unknown error");
				reportStep("The tabKey is not accessed due to unknown error", "fail");
			}
		}


		public void selectVisibleTextByXpathNoSnap(String xpath, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpath);
				Select select = new Select(element);
				select.selectByVisibleText(value);
		//		System.out.println("The element with xpath " +xpath+ " is selected with value " +value+ " sucessfully");
				reportStep("The element with xpath "+xpath+" is selected with value "+value+" sucessfully", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The element with xpath " +xpath+ " is not found in the DOM");
				reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not visible in the application");
				reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//	System.err.println("The element with xpath " +xpath+ " is not interactable in the application");
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
			} catch (ElementNotSelectableException e) {
				// TODO: handle exception
			//	System.err.println("The element with xpath " +xpath+ " is not selectable in the application");
				reportStep("The element with xpath "+xpath+" is not selectable in the application", "fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not stable in the application");
				reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not working due to unknown error");
				reportStep("The element with xpath "+xpath+" is not working due to unknown error", "fail");
			}
		}


		public void mouseHoverByXpath(String xpath) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpath);
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
		//		System.out.println("The element with xpath "+xpath+" is mouseHovered Successfully");
				reportStep("The element with xpath "+xpath+" is mouseHovered Successfully", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
		//		System.err.println("The element with xpath "+xpath+" is not found in the DOM");
				reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
			}
		}


		public void clickByExplicitWait(String xpath,long time) {
			// TODO Auto-generated method stub
			try {
				WebElement destination = driver.findElementByXPath(xpath);
				 WebDriverWait wait1 = new WebDriverWait(driver, time);
				 wait1.until(ExpectedConditions.elementToBeClickable(destination)).click();
//				System.out.println("The element with xpath "+xpath+" is clicked Successfully");
				reportStep("The element with xpath "+xpath+" is clicked Successfully", "pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
//				System.out.println("The element with xpath "+xpath+" is mouseHovered Successfully");
				reportStep("The element with xpath "+xpath+" is mouseHovered Successfully", "pass");
			}
		}

		public void selectValueByXpath(String xpath, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpath);
				Select sel = new Select(element);
				sel.selectByValue(value);
//				System.out.println("The element with xpath " +xpath+ " is selected with value " +value+ " successfully");
				reportStep("The element with classname "+xpath+" is selected with value "+value+" successfully", "pass");
			} catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
		//		System.err.println("The element with xpath " +xpath+ " is not found in the DOM");
				reportStep("The element with classname "+xpath+" is not found in the DOM", "fail");
			} catch (ElementNotVisibleException e) {
						// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not visible in the application");
				reportStep("The element with classname "+xpath+" is not visible in the application", "fail");
			} catch (ElementNotInteractableException e) {
						// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not interactable in the application");
				reportStep("The element with classname "+xpath+" is not interactable in the application", "fail");
			} catch (ElementNotSelectableException e) {
						// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not selectable in the application");
				reportStep("The element with classname "+xpath+" is not selectable in the application", "fail");
			} catch (StaleElementReferenceException e) {
						// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not stable in the application");
				reportStep("The element with classname "+xpath+" is not stable in the application", "fail");
	    	} catch (WebDriverException e) {
						// TODO: handle exception
		//		System.err.println("The element with xpath " +xpath+ " is not working due to unknown error");
	 			reportStep("The element with classname "+xpath+" is not working due to unknown error", "fail");
				
			} 
			
			
			
		}
		
		public void acceptAlerts() {
			Robot rbt;
			try {
				rbt = new Robot();
				rbt.keyPress(KeyEvent.VK_ENTER);
				rbt.keyRelease(KeyEvent.VK_ENTER);
//				System.out.println("The opened alert is accepted");
				reportStep("The opened alert is accepted", "pass");
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (WebDriverException e) {
				// TODO: handle exception
			}
			
		}

		public void clickByMouse(String xpath) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpath);
				Actions builder = new Actions(driver);
				builder.click(element).perform();
//				System.out.println("The click action is performed successfully");
				reportStep("The click action is performed successfully", "pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
		
		
        

		



}
