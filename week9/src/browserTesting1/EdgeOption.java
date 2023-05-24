package browserTesting1;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeOption {
    static WebDriver driver;
    static String expectedTitle="nopCommerce demo store. Login";

    public static void main(String[] args) {
        EdgeOption eg=new EdgeOption();
        driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.getTitle();
        String actualTitle=driver.getTitle();
        System.out.println("Title is "+actualTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        driver.quit();

    }
}
