package Web.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFunctions {

 public static WebDriver driver;
 public static WebElement buttonF;
 public static WebElement buttonG;

    public void openMainLogin() {
        driver.findElement(By.cssSelector(".headerLinks_2V6 > span a")).click();
    }
    public static WebElement facebookButton(WebDriver driver) {
        return buttonF = driver.findElement(By.cssSelector("button.facebookLogin_D-3"));
    }

    public static WebElement gmailButton(WebDriver driver) {
        return buttonG = driver.findElement(By.cssSelector("button.googleLogin_1ht"));
    }
}
