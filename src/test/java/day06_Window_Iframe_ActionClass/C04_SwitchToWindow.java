package day06_Window_Iframe_ActionClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C04_SwitchToWindow extends TestBase {

   @Test
   public void test01(){
       // https://the-internet.herokuapp.com/windows adresine gidin.
       driver.get("https://the-internet.herokuapp.com/windows");

       // Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
       WebElement ilkSayfaYazielementi=driver.findElement(By.tagName("h3"));
       String expectedYazi="Opening a new window";
       String actualYazi=ilkSayfaYazielementi.getText();
       Assert.assertEquals(expectedYazi,actualYazi);

       // Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
       String expectedTitle="The Internet";
       String actualTitle=driver.getTitle();
       Assert.assertEquals(expectedTitle,actualTitle);
       bekle(2);
        String ilkSayfaWHD=driver.getWindowHandle();

       // Click Here butonuna basın.
       driver.findElement(By.linkText("Click Here")).click();

       // Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

       /*
       Eger switchToNewWindow methodu kullanılırsa driver yeni acılan sayfaya gecis yapar

       Ancak mu method kullanılmadan bir link tıklandıgında yeni birsayfa acılıyorsa driver yeni sayfaya gecmez
       Bizim yeni acilan sayfanın windowHandle degerini bulup driver ı o sayfaya gecirmemiz gerekir

       link'e click yaptigimizda acik 2 sayfamiz oluyor
        bunlardan bir tanesi windowHandle degerini kaydettigimiz ILK SAYFA
        digeri ise windowHandle degerini bilmedigimiz IKINCI SAYFA

        biz getWindowHandles() method'u ile
        bir SET olarak iki sayfanin windowHandle degerlerini alabiliyoruz
        O SET icerisinde
        ilkSayfaWHD'ine esit olmayan String'i
        ikinciSayfaWHD olarak atayabiliriz
 */

       Set<String> tumSayfalarinWHDSeti=driver.getWindowHandles();
       String ikinciSayfaWHD = "";
       for (String each:tumSayfalarinWHDSeti) {
           if (!each.equals(ilkSayfaWHD)) {
               ikinciSayfaWHD = each;
           }
       }

       driver.switchTo().window(ikinciSayfaWHD);
       expectedTitle="New Window";
       actualTitle=driver.getTitle();
       Assert.assertEquals(actualTitle,expectedTitle);
       bekle(2);

       // Sayfadaki textin “New Window” olduğunu doğrulayın.
       String ikincSayfaYazi=driver.findElement(By.tagName("h3")).getText();
       expectedYazi="New Window";
       Assert.assertEquals(expectedTitle,ikincSayfaYazi);

       //Bir önceki pencereye geri döndükten sonra
       driver.switchTo().window(ilkSayfaWHD);

       // sayfa başlığının “The Internet” olduğunu doğrulayın.
       expectedTitle="The Internet";
       actualTitle=driver.getTitle();
       Assert.assertEquals(expectedTitle,actualTitle);
   }









}
