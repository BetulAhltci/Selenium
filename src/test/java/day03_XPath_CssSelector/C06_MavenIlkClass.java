package day03_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_MavenIlkClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //2- arama kutusunu locate edelim
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
        //3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim
        System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")).click();
        //6- Sayfadaki tum basliklari yazdiralim
        //soldaki aramayi daraltabileceğimiz baslıklar
        driver.navigate().back();
        List<WebElement> baslikelementleriList=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']"));
        int baslıkno=1;
        for (WebElement eachElement:baslikelementleriList) {
            System.out.println(baslıkno+"---"+eachElement.getText());
            baslıkno++;

        }
        driver.close();



    }
}
