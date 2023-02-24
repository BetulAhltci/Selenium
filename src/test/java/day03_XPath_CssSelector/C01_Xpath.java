package day03_XPath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deletebuttonelement=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deletebuttonelement.isDisplayed()){
            System.out.println("Delete button test PASSED");
        }else{
            System.out.println("Delete button test FAILD");
        }
        //4- Delete tusuna basin
        deletebuttonelement.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement=driver.findElement(By.xpath("//h3"));
        if (addRemoveElement.isDisplayed()){
            System.out.println("add yazı testi PASSED");
        }else{
            System.out.println("Add yazı testi FAILD");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
