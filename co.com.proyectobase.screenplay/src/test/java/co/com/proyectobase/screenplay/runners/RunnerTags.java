package co.com.proyectobase.screenplay.runners;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import co.com.proyectobase.screenplay.util.BeforeSuite;
import co.com.proyectobase.screenplay.util.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions (features="src/test/resources/features/automation_demo.feature",
		tags= "@registrar",
		glue="co.com.proyectobase.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
@RunWith(RunnerPersonalizado.class)
public class RunnerTags {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
			DataToFeature.overrideFeatureFiles("./src/test/resources/features/automation_demo.feature");
	}
}

