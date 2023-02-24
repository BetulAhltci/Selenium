package day08_explictlyWait_cookies_WebTables;

import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C04_Cookies extends TestBase {
    @Test
    public void test01(){

        //1- Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2- tum cookie’leri listeleyin
        Set<Cookie> cookiesSet=driver.manage().getCookies();
        int sirano=1;
        for (Cookie eachCookie:cookiesSet) {
            System.out.println(sirano+" "+eachCookie.toString());
            sirano++;
        }
        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(cookiesSet.size()>5);
        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String actualValue=driver.manage().getCookieNamed("i18n-prefs").getValue();
        String expectedValue="USD";
        Assert.assertEquals(expectedValue,actualValue);
        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        Cookie benimcookie=new Cookie("en sevdiğim cookie","cikolatalı");
        driver.manage().addCookie(benimcookie);
        cookiesSet=driver.manage().getCookies();
        sirano=1;
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        //7- ismi skin olan cookie’yi silin ve silindigini test edin
        //8- tum cookie’leri silin ve silindigini test edin
//
    }
}
