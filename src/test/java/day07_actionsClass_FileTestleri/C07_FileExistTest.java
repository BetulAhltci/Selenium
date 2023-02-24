package day07_actionsClass_FileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C07_FileExistTest {
    @Test
    public void test01(){
        //calıstıgımız package içinde text.txt isimli bir file oldugunu testedin

        String dinamikDosyaYolu=System.getProperty("user.dir")+"\\src\\test\\java\\day07_actionsClass_FileTestleri\\text.txt";
        System.out.println(dinamikDosyaYolu);
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
}
