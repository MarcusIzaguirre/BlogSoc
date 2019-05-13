package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import repositories.Repositories;

public class PageHomeSoc extends BasePage {

	
	
	public PageHomeSoc() {
		super();
		
	}


	//PEGAR O MENU BLOG
	public WebElement getMenuBlog(){
		return browser.findElement(By.xpath(Repositories.XPATH_MENUBLOG));
	}
	
	
	//CLICAR NO MENU BLOG
	public PageBlog menuBlog(){
		getMenuBlog().click();
		return new PageBlog();
	}
}
