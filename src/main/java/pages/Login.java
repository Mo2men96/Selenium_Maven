package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.seleinum.DriverFactory.driver;

public class Login {

    public void LoginInvalidUser(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // driver.get("https://practicesoftwaretesting.com/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("momen.samir43.9@gmail.com")));
        driver.findElement(By.id("email")).sendKeys("momen.samir43.9@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Momen1997!");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.help-block")));
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("password")).clear();





    }public void LoginValidUser(){
       // driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys("momen.samir43.9@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Momen1996!");
        driver.findElement(By.xpath("//input[@value='Login']")).click();


    }
}
