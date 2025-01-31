package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utilities.seleinum.DriverFactory.driver;
import java.time.Duration;

public class AddToCart_Payment {
    public void AddToCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Home']")));
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Combination Pliers']")));
        driver.findElement(By.xpath("//img[@alt='Combination Pliers']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-add-to-cart")));
        driver.findElement(By.id("btn-add-to-cart")).click();
        driver.findElement(By.id("btn-add-to-cart")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='cart']")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("toast-message")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("toast-message")));
        driver.findElement(By.xpath("//a[@aria-label='cart']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")));
        driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")).click();
        driver.findElement(By.id("email")).sendKeys("momen.samir43.9@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Momen1996!");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-6 offset-md-3 login-form-1']//div[@class='float-end ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")));
        driver.findElement(By.xpath("//div[@class='col-md-6 offset-md-3 login-form-1']//div[@class='float-end ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")).click();
        driver.findElement(By.id("address")).sendKeys("10,street,cairo,egypt");
        driver.findElement(By.id("city")).sendKeys("Giza");
        driver.findElement(By.id("state")).sendKeys("Cairo");
        driver.findElement(By.id("country")).sendKeys("Egypt");
        driver.findElement(By.id("postcode")).sendKeys("20331");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='float-end']//button[@type='button'][normalize-space()='Proceed to checkout']")));
        driver.findElement(By.xpath("//div[@class='float-end']//button[@type='button'][normalize-space()='Proceed to checkout']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("payment-method")));
        driver.findElement(By.id("payment-method")).sendKeys("Cash on Delivery");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Confirm']")));
        driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();









    }
}
