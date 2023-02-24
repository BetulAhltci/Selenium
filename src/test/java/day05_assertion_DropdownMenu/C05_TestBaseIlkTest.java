package day05_assertion_DropdownMenu;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C05_TestBaseIlkTest extends TestBase {
    //amazon a git
    //nutella ara
    //sonucların nutella içerdiğini test edin

    @Test
    public void amazonTest(){
        //amazon a git
        driver.get("https://www.amazon.com");
        //nutella ara
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);
        //sonucların nutella içerdiğini test edin
        WebElement actuelSonucElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectrdİcerik="Nutella";
        String actualsonucYazisi=actuelSonucElementi.getText();
    }



}
