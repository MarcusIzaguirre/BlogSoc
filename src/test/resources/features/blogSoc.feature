
@blog
Feature: Testes de funcionalidade da busca do blog
 

  @acesso
  Scenario: acesso ao blog
    Given que usuario acesse o site da soc
    When clicar no menu blog
    #Then sistema redireciona para a pagina de blog da soc


  @busca
  Scenario: busca valida
    #Given que usuario acesse o site da soc e clique no menu blog
    When digitar "dia mundial da saude" no campo de busca na pagina do blog
    And clicar no botao de pesquisa
    Then sistema retorna a tela com as informacoes pesquisadas
   
 @limpar
 Scenario: botao limpar
		#Given que usuario acesse o site da soc e clique no menu blog
    When digitar "dia mundial da saude" no campo de busca na pagina do blog
    And clicar no botao limpar
    Then sistema exclui os dados digitados no campo de busca

