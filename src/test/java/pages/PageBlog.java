package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import repositories.Repositories;

public class PageBlog extends BasePage {

	
	
	public PageBlog() {
		super();
	
	}


	//------------------PEGAR O CAMPO "BUSCAR"------------
	public WebElement getCampoBusca(){
		return browser.findElement(By.cssSelector(Repositories.CSSSELECTOR_CAMPOBUSCAR));
	}
	
	//--------------DIGITAR ALGO NO CAMPO DE "BUSCA"------------
	public PageBlog escreverNoCampoBusca(String dados) throws InterruptedException{
		getCampoBusca().click();
		Thread.sleep(2000);
		getCampoBusca().sendKeys(dados);
		return this;
	}
	
	
	
	//------------------------PEGAR O BOTAO "PESQUISA"-----------//
	public WebElement getbtnPesquisa(){
		return browser.findElement(By.cssSelector(Repositories.CSSSELECTOR_BTNPESQUISA));
	}
	
	//-----------------------CLICAR NO BOTAO "PESQUISA"--------//
	public PageBlog clicarbtnPesquisa(){
		getbtnPesquisa().click();
		return this;
	}
	
	
	
	//-------------PEGAR O BOTAO "LIMPAR"-------------------//
	public WebElement getbtnLimpar(){
		return browser.findElement(By.cssSelector(Repositories.CSSSELECTOR_BTNLIMPAR));
	}
	
	
	//----------CLICAR NO BOTAO "LIMPAR"-----------------//
	public PageBlog clicarLimpar(){
		getbtnLimpar().click();
		return this;
	}
	
	
	//----------PEGAR A MENSAGEM DA PESQUISA REALIZADA--------//
	public WebElement MSGdaPesquisa(){
		return browser.findElement(By.cssSelector(Repositories.CSSSELECTOR_MSGDAPESQUISA));
	}
	
	//----------------MENSAGEM---------------------//
	public void validarMSG(){
		MSGdaPesquisa();
	}
}
