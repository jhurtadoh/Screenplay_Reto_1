package co.com.proyectobase.screenplay.interactions;

import java.util.List;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class ProcesoInteractivo implements Interaction
{

	private String dato;
	private Target datoTarget;

	public ProcesoInteractivo(String dato, Target datoTarget) {
		this.dato = dato;
		this.datoTarget = datoTarget;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElement> Lista = datoTarget.resolveFor(actor).findElements(By.tagName("li"));
		
		for (int i = 0; i<Lista.size(); i++)
		{
			if (Lista.get(i).findElement(By.tagName("a")).getText().contains(dato))
			{
				Lista.get(i).click();
				break;
			}
		}
	}

	public static ProcesoInteractivo BuscarLista(String dato, Target datoTarget) {
		return new ProcesoInteractivo(dato, datoTarget);
	}
}

