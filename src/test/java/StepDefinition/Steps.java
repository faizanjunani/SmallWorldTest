package StepDefinition;

import PageObjects.loginPage;
import PageObjects.productPage;
import common.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Steps extends Base {
    loginPage lp = new loginPage();
    productPage pp = new productPage();
    @Given("user is present on login page")
    public void userIsPresentOnLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters valid data with username as {string} and password as {string}")
    public void userEntersValidDataWithUsernameAsAndPasswordAs(String username, String password) {
        driver.findElement(lp.username).sendKeys(username);
        driver.findElement(lp.password).sendKeys(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        driver.findElement(lp.loginBtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        WebElement success;
        success = driver.findElement(lp.succefulLogin);
        String Expected = "Swag Labs";
        Assert.assertEquals(Expected,success.getText());
        System.out.println("Login Successful");
    }

    @When("user enters invalid data with username as {string} and password as {string}")
    public void userEntersInvalidDataWithUsernameAsAndPasswordAs(String username, String password) {
        driver.findElement(lp.username).sendKeys(username);
        driver.findElement(lp.password).sendKeys(password);
    }

    @Then("login should be unsuccessful")
    public void loginShouldBeUnsuccessful() {
        WebElement failure;
        failure = driver.findElement(lp.unsuccesfullogin);
        String Expected = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(Expected,failure.getText());
        System.out.println("Login Failed");
    }

    @Then("user add his desired product to cart")
    public void userAddHisDesiredProductToCart() {
        driver.findElement(pp.selectProduct).click();
    }

    @Then("user visits the cart to checkout")
    public void userVisitsTheCartToCheckout() {
        driver.findElement(pp.goToCart).click();
        driver.findElement(pp.checkoutOrder).click();
    }

    @Then("user enters data with first name as {string} last name as {string} and postal code as {string}")
    public void userEntersDataWithFirstNameAsLastNameAsAndPostalCodeAs(String firstName, String lastName, String postalCode) {
        driver.findElement(pp.firstName).sendKeys(firstName);
        driver.findElement(pp.lastName).sendKeys(lastName);
        driver.findElement(pp.zipCode).sendKeys(postalCode);
    }

    @Then("user continues to Order info and confirms the order")
    public void userContinuesToOrderInfoAndConfirmsTheOrder() {
        WebElement orderSuccessful;

        driver.findElement(pp.continueToInfo).click();
        driver.findElement(pp.finish).click();

        orderSuccessful = driver.findElement(pp.orderSuccessful);
        String Expected = "Thank you for your order!";
        Assert.assertEquals(Expected,orderSuccessful.getText());
        System.out.println("Order Successful");
    }
}
