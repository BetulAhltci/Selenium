package day07_actionsClass_FileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DinamikdosyaYolu {
    @Test
    public void test01(){
        //Masaustunde theDelta.docx isimli bir dosya buludugunu test edin

        String dosyaYolu = System.getProperty("user.home") + "/Desktop/Thedelta.docx";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
