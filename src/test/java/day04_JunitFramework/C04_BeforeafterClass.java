package day04_JunitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeafterClass {
    // 3 test method'u olusturun
    // 1.amazon anasayfaya gidip, amazona gittiginizi test edin
    // 2.Nutella aratip arama sonuclarinin nutella icerdigini test edin
    // 3.Ilk urune tiklayip, urun isminde Nutella gectigini test edin

    //eger herbir test metodu için driver olusturup sonunda kapatmamız gerekmiyorsa
    //classın basında bir kez driver ousturup classın sonunda driver ı kapatabiliriz
    //@BeforeClass ve @AfterClass notasyonu kullanılan metodlar statik olmalıdır

    static WebDriver driver;

    @BeforeClass
    public static void sethup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }
    @Test
    public void test01(){
        // 1.amazon anasayfaya gidip, amazona gittiginizi test edin
        driver.get("https://www.amazon.com");
        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Amazon testi PSSED");
        }else{
            System.out.println("Url amazon içermiyor, tast FAILD");
        }
    }
    @Test
    public void test02(){
        // 2.Nutella aratip arama sonuclarinin nutella icerdigini test edin
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);

        WebElement aramaSonucElementi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));

        String expectedIcerik ="Nutella";
        String actualSonucYaısı=aramaSonucElementi.getText();

        if (actualSonucYaısı.contains(expectedIcerik)){
            System.out.println("nutella testi PASSED");
        }else{
            System.out.println("nutella testi FAILD");
        }
    }
    @Test
    public void test03(){
        // 3.Ilk urune tiklayip, urun isminde Nutella gectigini test edin
        WebElement ilkUrun=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        ilkUrun.click();

        WebElement urunIsimElementi=driver.findElement(By.xpath("//span[@id='productTitle']"));

        String expectedIcerik="nutella";
        String actualUrunIsim=urunIsimElementi.getText();

        if (actualUrunIsim.contains(expectedIcerik)){
            System.out.println("urın ismi testi PASSED");
        }else{
            System.out.println("urun ismi test FAILD");
        }
    }


}
