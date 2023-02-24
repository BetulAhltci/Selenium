package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {
    public static void main(String[] args) throws InterruptedException {
        /*
        jar dosyalarını yukleyerek selenium u kullanılır hale getirdik
        ancak her bir class ın hangi browse ile calısmasını istiyorsak o browser ile ilgili driver'ı
        class'da tanımlamamız gerekir

        browser ile ilgili tercihimiz dogrultusunda ilgili ayarlari yapmak için Java'dakı System class'ından
        setProperty() kullanılır

         method'a 2 parametre ekleyecegiz
            1.parametre herkes icin ayni : webdriver.chrome.driver
            2.parametre bu driver'in dosya yolu
              herkesin bilgisayarinda farkli olabilir
              windows bilgisayarlarda sonunda .exe yazilmalidir
              mac'lerde .exe olmaz
         */

        System.setProperty("webdriver.crome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //istenen sayfaya gitmek için
        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);

        driver.close();

    }
}
