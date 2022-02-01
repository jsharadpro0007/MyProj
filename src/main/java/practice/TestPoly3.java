package practice;

class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    static void eat(Animal a)
    {
        Dog d = (Dog) a;
        System.out.println("eating bread...");

    }
}
class Cat extends Animal{
    void eat(){System.out.println("eating rat...");}
}
class Lion extends Animal{
    void eat(){System.out.println("eating meat...");}
}
class TestPoly3{
    public static void main(String[] args){
//        Animal a;
//        a=new Dog();
//        a.eat();
//        a=new Cat();
//        a.eat();
//        a=new Lion();
//        a.eat();

        Animal a = new Dog();
        Dog.eat(a);

    }}
