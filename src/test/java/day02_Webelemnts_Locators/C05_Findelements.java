package day02_Webelemnts_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_Findelements {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //arama kutusuna java yazıp aratın
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java");
        aramaKutusu.submit();

        //arama sonuclarında cıkan resimlerdeki yazıları yazdırın
        List<WebElement> aramaSonuclariElementlist=driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramaSonuclariElementlist.size());//86

        //86 elementi yazdıralım
        int elementNo=1;
        for (WebElement eachElement:aramaSonuclariElementlist
             ) {
            System.out.println(elementNo+ "---"+eachElement.getText());
            elementNo++;
        }

        Thread.sleep(3000);
        driver.close();


    }
}
