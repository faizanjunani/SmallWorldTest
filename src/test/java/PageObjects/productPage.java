package PageObjects;

import org.openqa.selenium.By;

public class productPage {
    public By selectProduct = By.id("add-to-cart-sauce-labs-backpack");
    public By goToCart = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
    public By checkoutOrder = By.id("checkout");
    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By zipCode = By.id("postal-code");
    public By continueToInfo = By.id("continue");
    public By finish = By.id("finish");
    public By orderSuccessful = By.xpath("/html/body/div/div/div/div[2]/h2");
}
