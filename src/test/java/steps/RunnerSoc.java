package steps;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, //REMOVE CARACTERES ESPECIAIS
		snippets = SnippetType.CAMELCASE, // GERA OS MÉTODOS COM INICIAIS "MAIUSCULAS" AO INVES DE _
		dryRun = false, // QUANDO FOR TRUE IRÁ VALIDAR SE TUDO ESTÁ OK
		features = "src/test/resources/features", //CAMINHO DA FEATURE
		glue = "steps", // NOME DO PACOTE DA CLASSE
		plugin = "pretty", //ATIVA NOVAMENTE O LOG NO CONSOLE
		strict = false, //IRÁ VALIDAR SE OS STEPS FORAM EXIBIDOS OU NÃO
		tags = {"@acesso, @busca, @limpar"}
		//tags = {"@busca"}
		//tags = {"@acesso, @busca"}
		//tags = {"@limpar"}
		
		)


public class RunnerSoc {

}
