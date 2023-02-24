package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverNaviigateMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //amazon anasayfasına gidin
        driver.get("https://www.amazon.com");
        //wisequrter anasayfaya gidin
        driver.get("https://www.wisequarter.com");
        //yeniden amazon saynasına gidin
        driver.navigate().back();
        //wisequarter sayfasına dönun
        driver.navigate().forward();
        //navigate().to() get ile ayni işlemi yapar
        driver.navigate().to("https://www.youtube.com");
        //navigate().refresh() sayfayı yeniler
        driver.navigate().refresh();


    }
}
