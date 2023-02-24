package day04_JunitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {
    /*
    Framework: Ortakcalısma cercevesi
               Hangi dosyaları nerede olusturacagımızı belirler e boylece toplu calısmayı kolaylastırır.
               Her framework, dosya düzeni olusturmanın yanında islerimizi kolaylastıran yeni ozellikler sunmustur

               Junit framework en temel test framework'udur.
               Bize kazandırdıgı en onemlı özellik test notasyonudur(test annotation)

               @Test notasyonu sayesinde her method bagımsız olarak calıstırılabilen bir test methodu olur

               @Test notasyonu sayesinde istersek herbir test methodunu bagımsız calıstırabileceğimiz gibi
               istersek class bazında tüm testlerin calısmasını saglayabiliriz

               Junit framework de test metodlarının hangi sıra ile calısacagını ONGOREMEYIZ VE KONTROL EDEMEYIZ

               */
    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.wisequarter.com");
        driver.close();
    }

    @Test
    public void test02() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.youtube.com");
        driver.close();
    }
}
