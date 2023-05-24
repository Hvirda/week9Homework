package browserTesting3;

import browserTesting1.EdgeOption;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiTest3 {
    static WebDriver driver;
    static String browser="Chrome";
    static String url="https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle="OrangeHRM";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            ChromeOptions options=new ChromeOptions();
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions firefoxOptions=new FirefoxOptions();
            driver=new FirefoxDriver(firefoxOptions);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOption eg=new EdgeOption();
            driver=new EdgeDriver();
        }else {
            System.out.println("Invalid browser");
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        String actualTitle= driver.getTitle();
        System.out.println("Title of the page is "+actualTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        driver.quit();


    }
}
