package day04_JunitFramework;

import org.junit.*;

public class C05_BirlikteKullanım {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class calıstı\n==================");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("================\nAfter class calıstı");
    }
    @Before
    public void before(){
        System.out.println("\nBefore metodu calıstı");

    }
    @After
    public void after(){
        System.out.println("After metodu calıstı");
    }
    @Test
    public void test01(){
        System.out.println("test01 calıstı");
    }
    @Test
    public void test02(){
        System.out.println("test02 calıstı");
    }
    @Test
    public void test03(){
        System.out.println("test03 calıstı");
    }
}
