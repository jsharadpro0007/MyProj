package practice;

class classB {

    static int a;

    classB(classA obj) {
        this.a = obj.a;

    }

    void display() {
        System.out.println(a);
    }

}

class classA {
    int a = 10;

    classA() {
        classB b = new classB(this);
        b.display();

    }

    public static void main(String args[]) {

        classA a = new classA();

    }

}