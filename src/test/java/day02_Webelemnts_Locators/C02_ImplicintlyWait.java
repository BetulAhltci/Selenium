package day02_Webelemnts_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class C02_ImplicintlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        driiver ı bir web uygulamasına gönderdigimizde o sayfanın acılması,orada yapmak istediğimiz işlemleri
        yapmak için elementleri bulması ... gibi işlemler zaman gerektirebilir

        implicintlyWait bu tur zaman isteyen işlemler için driver ın max. ne kadar bekleyeceğini belirler
         */
    }
}
