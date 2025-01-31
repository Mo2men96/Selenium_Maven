package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.seleinum.DriverFactory;

import java.time.Duration;

import static utilities.seleinum.DriverFactory.driver;

public class Registration {


    public void Register(){
        driver = DriverFactory.getDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to("https://practicesoftwaretesting.com/");
  //      driver.findElement(By.id("APjFqb")).sendKeys("https://practicesoftwaretesting.com/");
  //      driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
//        driver.findElement(By.xpath("//h3[normalize-space()='Practice Software Testing - Toolshop - v5.0']")).click();
        driver.findElement(By.linkText("Sign in")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Register your account']")));
        driver.findElement(By.linkText("Register your account")).click();

        driver.findElement(By.id("first_name")).sendKeys("Momen");
        driver.findElement(By.id("last_name")).sendKeys("Samir");
        driver.findElement(By.id("dob")).sendKeys("30/10/1996");
        driver.findElement(By.id("address")).sendKeys("10 street, Cairo,Egypt.");
        driver.findElement(By.id("postcode")).sendKeys("20331");
        driver.findElement(By.id("city")).sendKeys("Giza");
        driver.findElement(By.id("state")).sendKeys("Cairo");
        driver.findElement(By.id("country")).sendKeys("Egypt");
        driver.findElement(By.id("phone")).sendKeys("01110105560");
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(By.id("email")).sendKeys("momen.samir43.9@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Momen1996!");
        driver.findElement(By.id("password")).submit();
}}
