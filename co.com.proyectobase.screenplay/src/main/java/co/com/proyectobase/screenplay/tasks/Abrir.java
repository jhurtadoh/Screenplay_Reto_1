package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.AutomationRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{

	private AutomationRegisterPage automationHomePage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(automationHomePage));
		
	}

	public static Abrir LaPaginaDeAutomationDemo() {
		return Tasks.instrumented(Abrir.class);
	}

}
