package practice;

import org.junit.*;

public class Q3 {
    @BeforeClass
    public static void sethup(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void teardown(){
        System.out.println("AfterCilass");
    }
    @Before
    public void before(){
        System.out.println("Before");
    }
    @After
    public void after(){
        System.out.println("After");
    }

    @Test
    public void ahmet(){
        System.out.println("Ahmet");
    }
    @Test
    public void bekir(){
        System.out.println("Bekir");
    }
    @Test
    public void cengiz(){
        System.out.println("Cengiz");
    }
}
