package day07_actionsClass_FileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {
    @Test
    public void test01(){
        //bilgisayarımızın temel dosya yolu user.home
        String dosyayolu="C:\\Users\\AYCABİL\\Desktop\\theDelta.docx";
        boolean sonuc= Files.exists(Paths.get(dosyayolu));
        System.out.println(sonuc);
        /*
        bilgisayarımızda bir dosyanın var oldugunu test etmek için dosya yoluna ihtiyacımız var
        ancak herkesin bilgisayarındakı dosya yolları farklılık gosterır
        Herkesin bilgisayarı için frklı olankısmı javada bir komut ile alabiliriz
         */
        System.out.println(System.getProperty("user.home"));
        dosyayolu="C:\\Users\\AYCABİL\\Desktop\\theDelta.docx";
        dosyayolu=System.getProperty("user.home")+"Desktop\\theDelta.docx";

        //icinde bulundugumuz projenin temel dosya yolu user.dir
        //C:\Users\AYCABİL\Desktop\seleniumTeam108\src\test\java\day07_actionsClass_FileTestleri\text.txt
        System.out.println(System.getProperty("user.dir"));//C:\Users\AYCABİL\Desktop\seleniumTeam108



    }

}
