package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        // - "https://www.otto.com" adresine gidelim
        driver.get("https://www.otto.com");
        //6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String ottoTitle=driver.getTitle();
        System.out.println("otto titile: "+ottoTitle);
        String ottoUrl=driver.getCurrentUrl();
        System.out.println("otto url: "+ottoUrl);
        // 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
        if (ottoTitle.contains("Otto") && (ottoUrl.contains("Otto"))){
            System.out.println("Otto yazısı vardır");
        }else{
            System.out.println("Otto yazısı yoktur");
        }
        // 8 - Ardindan "https://wisequarter.com/" adresine gidelim
        driver.navigate().to("https://wisequarter.com/");
        //9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
        //     kontrol edelim
        String wqTitle=driver.getTitle();
        System.out.println("wq Title: "+wqTitle);
        String wqUrl=driver.getCurrentUrl();
        System.out.println("qw Url: "+wqUrl);

        boolean isTrue=wqTitle.contains("Quarter");
        if (isTrue){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILD");
        }

        System.out.println(isTrue?"Test Passed":"Test Failed");








    }

}
