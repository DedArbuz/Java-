import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\User\\IdeaProjects\\helicockter\\src\\main\\resources\\A.feature",
        glue = "ru.savkk.test",
        tags = "@withdrawal",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTest {
    RunnerTest(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
    }
}
