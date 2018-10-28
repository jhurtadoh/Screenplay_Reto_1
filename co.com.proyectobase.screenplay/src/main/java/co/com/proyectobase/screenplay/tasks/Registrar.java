package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import co.com.proyectobase.screenplay.interactions.ProcesoInteractivo;
import co.com.proyectobase.screenplay.model.InformacionUsuario;
import co.com.proyectobase.screenplay.userinterface.AutomationRegisterPage;

public class Registrar implements Task{
	
	AutomationRegisterPage automationRegisterPage;
	
	private List<InformacionUsuario> data;
	
	public Registrar(List<InformacionUsuario> data) {
		this.data = data;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(data.get(0).getFirstName()).into(AutomationRegisterPage.TEXTBOX_FIRST_NAME));
		actor.attemptsTo(Enter.theValue(data.get(0).getLastName()).into(AutomationRegisterPage.TEXTBOX_LAST_NAME));
		actor.attemptsTo(Enter.theValue(data.get(0).getAddress()).into(AutomationRegisterPage.TEXTAREA_ADDRESS));
		actor.attemptsTo(Enter.theValue(data.get(0).getEmailAddress()).into(AutomationRegisterPage.TEXTBOX_EMAIL_ADDRESS));
		actor.attemptsTo(Enter.theValue(data.get(0).getPhone()).into(AutomationRegisterPage.TEXTBOX_PHONE));
		
		//actor.attemptsTo(Click.on(AutomationRegisterPage.RADIO_GENDER_MALE));			
		if (data.get(0).getGender().equals("Male")){
			actor.attemptsTo(Click.on(AutomationRegisterPage.RADIO_GENDER_MALE));
		}else if (data.get(0).getGender().equals("Female")){
			actor.attemptsTo(Click.on(AutomationRegisterPage.RADIO_GENDER_FEMALE));
		}
		
		if (data.get(0).getHobbies1().equals("Cricket")){
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_CRICKET));
		}
		if (data.get(0).getHobbies2().equals("Movies")){
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_MOVIES));
		}		
		if (data.get(0).getHobbies3().equals("Hockey")){
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_HOCKEY));
		}
				
		actor.attemptsTo(Click.on(AutomationRegisterPage.LIST_MULTIPLE_LANGUAGES));
		
		actor.attemptsTo(ProcesoInteractivo.BuscarLista(data.get(0).getLanguages1(),AutomationRegisterPage.SELECTLIST_MULTIPLE_LANGUAGES));
		actor.attemptsTo(ProcesoInteractivo.BuscarLista(data.get(0).getLanguages2(),AutomationRegisterPage.SELECTLIST_MULTIPLE_LANGUAGES));
		actor.attemptsTo(ProcesoInteractivo.BuscarLista(data.get(0).getLanguages3(),AutomationRegisterPage.SELECTLIST_MULTIPLE_LANGUAGES));
				
		
		actor.attemptsTo(Click.on(AutomationRegisterPage.TEXTBOX_PHONE));
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getSkills()).from(AutomationRegisterPage.SKILLS));		
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getCountry()).from(AutomationRegisterPage.COMBOBOX_COUNTRY));
		
		actor.attemptsTo(Click.on(AutomationRegisterPage.COMBOBOX_SELECT_COUNTRY));
		actor.attemptsTo(Enter.theValue(data.get(0).getSelectCountry() + "\n").into(AutomationRegisterPage.COMBOBOX_SELECT_COUNTRY_SEARCH));
		
		
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getYear()).from(AutomationRegisterPage.COMBOBOX_YEAR));
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getMonth()).from(AutomationRegisterPage.COMBOBOX_MONTH));
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getDay()).from(AutomationRegisterPage.COMBOBOX_DAY));
				
		actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(AutomationRegisterPage.TEXTBOX_FIRST_PASSWORD));
		actor.attemptsTo(Enter.theValue(data.get(0).getConfirmPassword()).into(AutomationRegisterPage.TEXTBOX_CONFIRM_PASSWORD));
		//actor.attemptsTo(Click.on(AutomationRegisterPage.BUTTON_PHOTO));
		actor.attemptsTo(Click.on(AutomationRegisterPage.BUTTON_SUBMIT));
	}	


	public static Registrar PersonaEnLaPagina(List<InformacionUsuario> dato) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Registrar.class,dato);
	}

}
