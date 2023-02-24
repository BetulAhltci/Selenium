package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManageMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("maximaze size: "+driver.manage().window().getSize());
        System.out.println("maximize podition: "+driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("maximaze size: "+driver.manage().window().getSize());
        System.out.println("maximize podition: "+driver.manage().window().getPosition());

    }
}
