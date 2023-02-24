package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //amazon anasayfaya gidin.
        driver.get("https://www.amazon.com");
        //anasayfadaki title ve url yi yazdırın
        System.out.println("URL: "+driver.getCurrentUrl());
        System.out.println("Baslık: "+driver.getTitle());
        //amazon anasayfaya gittiginizi test ettirin
        //Test expected result ile actual resulr'in karsılastırılmasıdır
        //örnegin url amazon iceriyorsa diyebiliriz
        String expectedicerik="amazon";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedicerik)) {//amazon anasayfaya gittiysek
            System.out.println( "test pasted");
        }else {//gidemediysek
            System.out.println("test faild");
        }




    }
}
