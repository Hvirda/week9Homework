package browserTesting9;

import browserTesting1.EdgeOption;
import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest9 {
    static WebDriver driver;
    static String expectedTitle="Home – Demostack";
    static String url="https://www.demostack.com/";

    public static void main(String[] args) {
        EdgeOption eg=new EdgeOption();
        driver=new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.getTitle();
        String actualTitle=driver.getTitle();
        System.out.println("Title is "+actualTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        driver.quit();

    }
}
