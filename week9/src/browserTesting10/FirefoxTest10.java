package browserTesting10;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxTest10 {
    static WebDriver driver;
    static String url="https://uilicious.com/";
    static String expectedTitle="Low-code cross-browser testing | UI-licious";
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
