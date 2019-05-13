package pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
	
	public static WebDriver browser;
	
	public BasePage() {
		this.browser = browser;
}


	@Before
	public static WebDriver inicializa(){
		System.setProperty("webdriver.chrome.driver", "C:/TesteSoc/marcusTstSoc/drivers/chromedriver.exe"); //CHROME DRIVER
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("disable-infobars"); //DESABILITAR A BARRA DO CHROME
		browser = new ChromeDriver(CO);
		browser.manage().window().maximize();
		browser.get("https://ww2.soc.com.br/");
		return browser;
		
	}
	
	
	@After
	public void finaliza(){
		browser.quit();
	}

}
