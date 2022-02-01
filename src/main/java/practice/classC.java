package practice;

public class classC {

    classC getC()
    {
        return this;
    }

    void display()
    {
        System.out.println("Hello, Welcome!");
    }

    public static void main(String args[])
    {
        classC c = new classC();
        c.getC().display();

    }
}
