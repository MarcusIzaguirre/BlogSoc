package repositories;

public class Repositories {
	

	//--------------------------------------HOME-----------------------------//
	// CLICK MENU "BLOG" DA HOME
	public static final String XPATH_MENUBLOG = "//*[@id='menu-item-12077']/a"; 
	
	
	
	//--------------------------------------BLOG-----------------------------//
	
	//CAMPO BUSCAR DA PAG BLOG
	public static final String CSSSELECTOR_CAMPOBUSCAR = "section form input[name='s']";
	
	
	
	//CLICK NO BOTAO "PESQUISA" da p�gina BLOG
	public static final String CSSSELECTOR_BTNPESQUISA = "section form input[type='submit']";
	
	
	
	//CLICK NO BOTAO "LIMPAR" da p�gina BLOG
	public static final String CSSSELECTOR_BTNLIMPAR = "section form a[class='limpar-busca']";
	
	
	//VALIDAR MENSAGEM AP�S PESQUISA
	public static final String CSSSELECTOR_MSGDAPESQUISA = "section div h2[class='pagetitle search']";
}
