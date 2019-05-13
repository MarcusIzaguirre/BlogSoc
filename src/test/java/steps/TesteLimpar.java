package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.PageBlog;
import pages.PageHomeSoc;

public class TesteLimpar {
	

	
	//PAGINAS INSTANCIADAS
	BasePage BP = new BasePage();
	PageHomeSoc PHS = new PageHomeSoc();
	PageBlog PB = new PageBlog();
	
	
	
	
	//------------------ACESSA A HOME DA SOC E CLICA NO MENU "BLOG"----------------//
	/*@Given("que usuario acesse o site da soc e clique no menu blog")
	public void que_usuario_acesse_o_site_da_soc_e_clique_no_menu_blog() {
	   BasePage.inicializa(); //ACESSO A HOME
	   PHS.getMenuBlog(); //CLICAR NO MENUBLOG
		
	}*/

	//-----------------DIGITAR ALGO NO CAMPO DE "BUSCA" DO BLOG-----------------//
	/*@When("digitar {string} no campo de busca na pagina do blog")
	public void digitar_no_campo_de_busca_na_pagina_do_blog(String busca) {
	    PB.escreverNoCampoBusca(busca);
		
	}*/
	
	
	//-----------------CLICAR NO BOTAO "LIMPAR"---------------------//
	@When("clicar no botao limpar")
	public void clicar_no_botao_limpar() throws InterruptedException {
	    //PB.clicarLimpar();
		Thread.sleep(2000);
	    PB.getCampoBusca().clear();//LIMPAR O CAMPO
	}
	

	@Then("sistema exclui os dados digitados no campo de busca")
	public void sistema_exclui_os_dados_digitados_no_campo_de_busca() {
	   return;
	}

}
