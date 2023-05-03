package StepDefinition;

import common.Base;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Base {
    @Before //Cucumber Before Hook
    public void setupDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/FaizanJunani/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }

    @After // Cucumber After hook
    public void quitDriver() throws Exception {
        //driver.quit();
    }
}
