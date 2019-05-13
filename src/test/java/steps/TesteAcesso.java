package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.PageHomeSoc;

public class TesteAcesso {
	
	//INSTANCIAS
	BasePage BP = new BasePage();
	PageHomeSoc PHS = new PageHomeSoc();
	
	
	//--------------ACESSANDO A "HOME" DO SITE DA SOC-------------//
	@Given("que usuario acesse o site da soc")
	public void que_usuario_acesse_o_site_da_soc() {
	    BasePage.inicializa();
	}

	
	//--------------CLICAR NO MENU BLOG--------------------//
	@When("clicar no menu blog")
	public void clicar_no_menu_blog() {
	   PHS.menuBlog();
	}

	
	@Then("sistema redireciona para a pagina de blog da soc")
	public void sistema_redireciona_para_a_pagina_de_blog_da_soc() {
	    
	}

}
