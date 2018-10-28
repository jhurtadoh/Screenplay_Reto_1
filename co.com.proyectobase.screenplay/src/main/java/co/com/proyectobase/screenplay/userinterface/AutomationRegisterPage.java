package co.com.proyectobase.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationRegisterPage extends PageObject{
	public static final Target TEXTBOX_FIRST_NAME = Target.the("TextBox donde se digita "
			+ "el primer nombre").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input" ));
	public static final Target TEXTBOX_LAST_NAME = Target.the("TextBox donde se digita "
			+ "el apellido").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	public static final Target TEXTAREA_ADDRESS = Target.the("TextArea donde se digita "
			+ "la dirección").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	public static final Target TEXTBOX_EMAIL_ADDRESS = Target.the("TextBox donde se digita "
			+ "el correo electrónico").located(By.xpath("//*[@id=\"eid\"]/input"));
	public static final Target TEXTBOX_PHONE = Target.the("TextBox donde se digita "
			+ "el número telefónico").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	
	public static final Target RADIO_GENDER_MALE = Target.the("RadioButton "
			+ "del género masculino").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	public static final Target RADIO_GENDER_FEMALE = Target.the("RadioButton "
			+ "del género femenino").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
	
	public static final Target CHECKBOX_HOBBIES_CRICKET = Target.the("Checkbox "
			+ "del hobbie cricket").located(By.id("checkbox1"));
	public static final Target CHECKBOX_HOBBIES_MOVIES = Target.the("Checkbox "
			+ "del hobbie movies").located(By.id("checkbox2"));
	public static final Target CHECKBOX_HOBBIES_HOCKEY = Target.the("Checkbox "
			+ "del hobbie hockey").located(By.id("checkbox3"));
	
	
	
	public static final Target LIST_MULTIPLE_LANGUAGES = Target.the("List "
			+ "de lenguajes").located(By.id("msdd"));	
	public static final Target SELECTLIST_MULTIPLE_LANGUAGES = Target.the("Seleccionar "  
			+ " lenguajes").located(By.id("basicBootstrapForm"));

	public static final Target SKILLS = Target.the("Combobox de skills").located(By.id("Skills"));	
	public static final Target COMBOBOX_COUNTRY = Target.the("Combobox "
			+ "de países").located(By.id("countries"));
	
	public static final Target COMBOBOX_SELECT_COUNTRY = Target.the("Combobox "
			+ "de países").located(By.xpath("//*[@role='combobox']"));
	public static final Target COMBOBOX_SELECT_COUNTRY_SEARCH = Target.the("buscar "
			+ "en Combobox país").located(By.xpath("//*[@type='search']"));

	public static final Target COMBOBOX_YEAR = Target.the("Combobox "
			+ "de año").located(By.id("yearbox"));
	public static final Target COMBOBOX_MONTH = Target.the("Combobox "
			+ "de mes").located(By.xpath("//*[@placeholder='Month']"));
	public static final Target COMBOBOX_DAY = Target.the("Combobox "
			+ "de día").located(By.id("daybox"));
	
	
	public static final Target TEXTBOX_FIRST_PASSWORD = Target.the("TextBox donde se digita "
			+ "el primer password").located(By.xpath("//*[@id=\"firstpassword\"]"));
	public static final Target TEXTBOX_CONFIRM_PASSWORD = Target.the("TextBox donde se digita "
			+ "el segundo password").located(By.xpath("//*[@id=\"secondpassword\"]"));
	
	//public static final Target BUTTON_PHOTO = Target.the("Button para adjuntar "
	//		+ " la foto").located(By.xpath("//*[@id=\"secondpassword\"]"));
	public static final Target BUTTON_SUBMIT = Target.the("Button para enviar "
			+ " los datos").located(By.xpath("//*[@id=\"submitbtn\"]"));
	
	public static final Target LABEL_REGISTRO_EXITOSO = Target.the("Label con texto "
			+ "para confirmar registro").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
	
}
