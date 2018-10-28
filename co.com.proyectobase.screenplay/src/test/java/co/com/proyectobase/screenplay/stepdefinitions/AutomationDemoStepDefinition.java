package co.com.proyectobase.screenplay.stepdefinitions;

import java.util.List;


import org.openqa.selenium.WebDriver;
import co.com.proyectobase.screenplay.model.InformacionUsuario;
import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AutomationDemoStepDefinition {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor johan = Actor.named("Johan");
	
	@Before
	public void configuracionInicial()
	{
		johan.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^que Johan quiere acceder a la Web Automation Demo Site$")
	public void queCarlosQuiereAccederALaWebAutomationDemoSite() throws Exception {
		johan.wasAbleTo(Abrir.LaPaginaDeAutomationDemo());
	}

	@When("^el realiza el registro en la página$")
	public void elRealizaElRegistroEnLaPagina(List<InformacionUsuario> dato) throws Exception {
		johan.attemptsTo(Registrar.PersonaEnLaPagina(dato));
	}

	@Then("^el verifica que se carga la pantalla con texto (.*)$")
	public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(String palabraEsperada) throws Exception {
		 johan.should(seeThat(LaRespuesta.es(), equalTo(palabraEsperada)));
	}
	
	
}
