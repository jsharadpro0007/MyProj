package practice2;

import org.testng.annotations.Test;

public class testNGPractice2 {

    @Test(priority = 4)
    public void test1()
    {
        System.out.println("D");
    }

    @Test(priority = 5)
    public void test2()
    {
        System.out.println("E");
    }

    @Test(priority = 6)
    public void test3()
    {
        System.out.println("F");
    }


}
