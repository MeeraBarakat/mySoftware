package FirstPackage;
	import javax.swing.text.html.HTML;
	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.junit.CucumberOptions.SnippetType;;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="cases",
	plugin= {"html:target/cucumber/wikipedia.html"},
			monochrome=true,
			snippets = SnippetType.CAMELCASE,
			glue= {"FirstPackage"},
			strict=true
	)

	public class AcceptanceTest {

	}