package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverMethods {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void test01(){
       driver.get("https://www.google.com");
       //driver.findElement()
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();

        String amazonHandle=driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());
        driver.navigate().refresh();
        System.out.println(driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.facebook.com");
        System.out.println(driver.getWindowHandles());
        driver.switchTo().window(amazonHandle);
        driver.switchTo().newWindow(WindowType.WINDOW);

    }
    @After
    public void tearDown(){
        driver.quit();

    }
}
