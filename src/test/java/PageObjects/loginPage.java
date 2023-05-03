package PageObjects;

import org.openqa.selenium.By;

public class loginPage {

    public By username = By.id("user-name");
    public By password = By.id("password");
    public By loginBtn = By.id("login-button");

    public By succefulLogin = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div");
    public By unsuccesfullogin = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3");
}
