package day05_assertion_DropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseClass;

public class C07_JavaScriptAllert extends TestBaseClass {
    //// Gerekli ayarlamalari yapip
    //// https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
    //// 3 test method'u olusturup her method'da bir JsAlert'e basin
    //// Ilgili method'lari kullanin
    //// 1.alert'e tiklayalim
    //// Alert'deki yazinin "I am a JS Alert" oldugunu test edelim
    //// OK tusuna basip alert'i kapatalim
    //// 2.alert'e tiklayalim
    //// cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
    //// 3.alert'e tiklayalim
    //// Cikan prompt ekranina "Abdullah" yazdiralim ve OK tusuna basarak alert'i kapatalim
    //// Cikan sonuc yazisinin Abdullah icerdigini test edelim

    @Test
    public void test01(){
        //// Gerekli ayarlamalari yapip
        //// https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //// 1.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']"));
        bekle(2);
        //// Alert'deki yazinin "I am a JS Alert" oldugunu test edelim
        String expektedAllertYazisi="I am a JS Alert";
        String actualAllertYazisi=driver.switchTo().alert().getText();
        Assert.assertEquals(expektedAllertYazisi,actualAllertYazisi);
        //// OK tusuna basip alert'i kapatalim
        driver.switchTo().alert().accept();
        bekle(2);
    }
    @Test
    public void test02(){
        //// 2.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']"));
        //// cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        driver.switchTo().alert().dismiss();
        String expectdSonucYazisi="You clicked: Cancel";
        String actualSonucYazisi=driver.findElement(By.xpath("//*[text()='You clicked: Cancel']")).getText();
        Assert.assertEquals(expectdSonucYazisi,actualSonucYazisi);
    }
    @Test
    public void test03(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // 3.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        // Cikan prompt ekranina "Abdullah" yazdiralim ve OK tusuna basarak alert'i kapatalim
        driver
                .switchTo()
                .alert()
                .sendKeys("Abdullah");
        bekle(2);
        driver
                .switchTo()
                .alert()
                .accept();
        // Cikan sonuc yazisinin Abdullah icerdigini test edelim
        bekle(2);
        String actualSonucYazisi= driver
                .findElement(By.xpath("//*[@id='result']"))
                .getText();
        String expectedIcerik="Abdullah";
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }

}









