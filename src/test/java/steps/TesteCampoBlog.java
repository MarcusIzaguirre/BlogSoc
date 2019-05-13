package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.PageBlog;
import pages.PageHomeSoc;


public class TesteCampoBlog {
	
	
	
	
	//PAGINAS INSTANCIADAS
	//BasePage BP = new BasePage();
	//PageHomeSoc PHS = new PageHomeSoc();
	PageBlog PB = new PageBlog();
	
	
	
	//------------------ACESSA A HOME DA SOC E CLICA NO MENU "BLOG"----------------//
	/*@Given("que usuario acesse o site da soc e clique no menu blog")
	public void que_usuario_acesse_o_site_da_soc_e_clique_no_menu_blog() {
	   BasePage.inicializa(); //ACESSO A HOME
	   //PHS.getMenuBlog(); //CLICAR NO MENU BLOG
		
	}*/
	
	
	
	//-----------------DIGITAR ALGO NO CAMPO DE "BUSCA" DO BLOG-----------------//
	@When("digitar {string} no campo de busca na pagina do blog")
	public void digitar_no_campo_de_busca_na_pagina_do_blog(String busca) throws InterruptedException {
	    PB.escreverNoCampoBusca(busca);
		
	}

	//---------------CLICAR NO BOTAO DE ""PESQUISA"--------------------------//
	@When("clicar no botao de pesquisa")
	public void clicar_no_botao_de_pesquisa() {
	  PB.clicarbtnPesquisa();
		
	}

	//-------------TELA DAS INFORMAÇÕES(VÁLIDAS) PESQUISADAS
	@Then("sistema retorna a tela com as informacoes pesquisadas")
	public void sistema_retorna_a_tela_com_as_informacoes_pesquisadas() {
	 
	}
}
