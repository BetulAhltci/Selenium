package day02_Webelemnts_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazom ana sayfaya gidin
        driver.get("https://www.amazon.com");

        //arama kutusunu locate edip bir web element olarak kaydedin
        //id si twotabsearchtextbox olan webelement seklınde locate edeceğiz
            /*
            driver a webelementi tarif etme işlemine locate, bu tarifi yapabilmekiçin kullanabileceğim değişkenlerede
            lacator denir.

            8 tane locator vardır
            Lovacor'ların 6 tanesi web elementin ozelliklerine bağlıdır
                -id
                -classname
                -name
                -tagname
                -linktext
                -partialLinkText
            Geriye kalan iki locator ise her turlu web elementi locate etmek için kullanılır
                -xpath
                -cssSelector
             */
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //arama kutusuna nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        Thread.sleep(3);
        driver.close();
    }
}
