package browserTesting4;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirfoxTest4 {
    static WebDriver driver;
    static String url="https://www.saucedemo.com/";
    static String expectedTitle="Swag Labs";
    public static void main(String[] args) {
        FirefoxOptions firefoxOptions=new FirefoxOptions();
        driver=new FirefoxDriver(firefoxOptions);
        driver.get(url);
        driver.manage().window().maximize();

        String actualTitle=  driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        driver.quit();

    }
}
