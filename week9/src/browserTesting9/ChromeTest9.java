package browserTesting9;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest9 {
    static WebDriver driver;
    static String url="https://www.demostack.com/";
    static String expectedTitle="Home – Demostack";
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
