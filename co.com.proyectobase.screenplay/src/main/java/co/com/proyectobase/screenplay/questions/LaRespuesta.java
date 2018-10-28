package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.proyectobase.screenplay.userinterface.AutomationRegisterPage;

public class LaRespuesta implements Question<String>{
	
	AutomationRegisterPage automationRegisterPage;

	public static LaRespuesta es() {
		return new LaRespuesta();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(AutomationRegisterPage.LABEL_REGISTRO_EXITOSO).viewedBy(actor).asString();
	}

}
