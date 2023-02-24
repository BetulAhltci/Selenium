package day08_explictlyWait_cookies_WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C01_Explictlywait {
    @Test
    public void test01() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();


    //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    //4. Remove butonuna basin
    driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

    //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));

    WebElement itsGoneEiementi = driver.findElement(By.id("message"));
    Assert.assertTrue(itsGoneEiementi.isDisplayed());
    driver.close();
    }
}
