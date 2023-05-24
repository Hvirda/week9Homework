package browserTesting1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static WebDriver driver;
    static String url="https://demo.nopcommerce.com/login?returnUrl=%2F";
    static String expectedTitle="nopCommerce demo store. Login";
    public static void main(String[] args) {
        ChromeOptions c=new ChromeOptions();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle=driver.getTitle();
        System.out.println("Title of page is: "+actualTitle);
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
        driver.quit();
    }
}
