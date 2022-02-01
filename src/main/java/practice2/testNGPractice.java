package practice2;

import org.testng.annotations.Test;

public class testNGPractice {

    @Test
    public void test1()
    {
        System.out.println("A");
    }

    @Test(priority = -1)
    public void test2()
    {
        System.out.println("B");
    }

    @Test(priority = 1)
    public void test3()
    {
        System.out.println("C");
    }


}
