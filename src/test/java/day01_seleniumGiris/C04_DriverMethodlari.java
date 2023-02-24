package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());
        //CDwindow-FBB3E40AEBE17EECF254A51D8CDD2E08
        //CDwindow-62BABF53F45804C1D3BBBA54A6B299B3
        //getWindowHandle() selenium tarafından her driver sayfası için uretilen unique handle degerini dondurur
        //getWindowHandles() ise test sirasinda birden fazla sayfa acilmissa
        // bir set olarak, tum sayfalarin window handle degerlerini döndürür

        System.out.println(driver.getPageSource());

        //sayfa kodları "2 hours weekly meeting with the team" içeriyormu test edin
        String expectedIcerik="2 hours weekly meeting with the team";


        driver.quit();
        // close() ve quit() ikisi de sayfa kapatmak icin kullanilir
        // close() sadece bir sayfa kapatirken
        // quit() test sirasinda acilan tum sayfalari kapatir
    }
}
