package day08_explictlyWait_cookies_WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ExplicitlyWait {
    @Test
    public void test01(){
        //2. Bir metod olusturun : isEnabled()
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        //4. Textbox’in etkin olmadigini(enabled) dogrulayın
        //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        //7. Textbox’in etkin oldugunu(enabled) dogrulayın.
    }
}
