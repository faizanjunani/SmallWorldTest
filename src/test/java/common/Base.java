package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver=null;

    public static void InitializeDriver(){
        if(driver== null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        else{
            return;
        }
    }
}
