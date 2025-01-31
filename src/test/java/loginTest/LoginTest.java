package loginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Login;

import java.time.Duration;

import static utilities.seleinum.DriverFactory.driver;

public class LoginTest {
    final Login login = new Login();

    @org.testng.annotations.Test(priority=1)
    public void LoginWithInvalidCredentials(){
        login.LoginValidUser();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.help-block")));
       String errorMessage = errorMessageElement.getText();
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage,"Invalid email or password");


    } @org.testng.annotations.Test(priority=2)
    public void LoginWithValidCredentials(){
        login.LoginValidUser();


}}
