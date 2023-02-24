package day04_JunitFramework;

import org.junit.Assert;
import org.junit.Test;

public class C06_Assertions {
    /*
    JUnit testlerin passed veya faild olduguna kodları calıstırırkensorun olup olmadıgına göre karar verir
     */
    String str1="Ali";
    String str2="ali";


    @Test
    public void test01(){
    //str1'in str2'ye esit oldugunu test edin
    Assert.assertEquals("karsılastırılan degerler farklı",str1,str2);

        //        if (str1.equals(str2)){
        //            System.out.println("esitlik testi PASSED");
        //        }else{
        //            System.out.println("esitlik testi FAILD");
        //        }
    }
    @Test
    public void test02() {
    //str1'in A harfini içerdiğini test edin
    Assert.assertTrue("str1 istenen harfi icermiyor",str1.contains("A"));
        //        if (str1.contains("A")) {
        //            System.out.println("olumlu test PASSED");
        //        } else {
        //            System.out.println("olumlu test FAILD");
        //        }
    }
    @Test
    public void test03(){
    //str2'nin c harfini icermediğini test edin
    Assert.assertFalse("str2 istenen harfi içeriyor",str2.contains("c"));
        //        if (!str2.contains("c")){
        //            System.out.println("negatif test PASSED");
        //        }else {
        //            System.out.println("negatif test FAILD");
        //        }
    }


}
