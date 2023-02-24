package day03_XPath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CookiesGecme {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");

        //cookies'i kabul ederek ekranı kapatın
        //driver.findElement(By.xpath("//div[text()=‘Accept all’]"));

        //arama cubuguna java yazıp aratın
        WebElement aramaCubugu=driver.findElement(By.xpath("//input[@name='q']"));
        aramaCubugu.sendKeys("java"+ Keys.ENTER);

        //bulunan sonuc sayısını 100 binde cok oldugunu test edin
        WebElement sonucSayiElement=driver.findElement(By.xpath("//*[@id='result-stats']"));
        System.out.println(sonucSayiElement.getText());
        //Yaklaşık 1.420.000.000 sonuç bulundu (0,60 saniye)

        String sonucYazısı=sonucSayiElement.getText();
        String[] sonucYaziArr=sonucYazısı.split(" ");
        String sonucSayısıStr=sonucYaziArr[1];//1.420.000.000
        sonucSayısıStr=sonucSayısıStr.replaceAll("\\D","");

        int actualicSonucSayısı=Integer.parseInt(sonucSayısıStr);
        int expectedSonucSayısı=100000;

        if (actualicSonucSayısı>expectedSonucSayısı){
            System.out.println("Arama sonuc sayısı testi PASSED");
        }else{
            System.out.println("Arama sonuc sayisi testi FAILD");
        }

        driver.close();

    }
}
