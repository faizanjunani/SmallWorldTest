package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features.feature"},
        glue = {"StepDefinition","Hooks"},
        plugin={"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
