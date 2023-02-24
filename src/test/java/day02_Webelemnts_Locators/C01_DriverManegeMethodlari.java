package day02_Webelemnts_Locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverManegeMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        System.out.println("ilk size: "+driver.manage().window().getSize());
        System.out.println("ilk psition"+ driver.manage().window().getPosition());
        Thread.sleep(2000);

        //olculeri ve konumu değiştirelim
        driver.manage().window().setSize(new Dimension(800,800));
        driver.manage().window().setPosition(new Point(40,100));

        System.out.println(" size: "+driver.manage().window().getSize());
        System.out.println(" psition"+ driver.manage().window().getPosition());

        Thread.sleep(2000);
        driver.close();
    }
}
