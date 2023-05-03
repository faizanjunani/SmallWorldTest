package StepDefinition;

import common.Base;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Base {
    @BeforeAll//Cucumber Before Hook
    public static void setupDriver() throws InterruptedException {
        InitializeDriver();
    }

    @AfterAll// Cucumber After hook
    public static void quitDriver() throws Exception {
        driver.quit();
    }
}
