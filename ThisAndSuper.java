class Parent {

    int a = 100;
    int b = 200;

    Parent() {
        System.out.println("Parent Default Constructor");
    }

    Parent(int x) {
        System.out.println("Parent Parameterized Constructor: " + x);
    }
}

public class ThisAndSuper extends Parent {

    int x = 10;
    int y = 20;

    ThisSuperDemo() {
        this(50);
        System.out.println("Child Default Constructor");
    }

    ThisSuperDemo(int value) {
        super();
        System.out.println("Child Parameterized Constructor: " + value);
    }

    public void currentClassFields() {
        System.out.println("Current Class Fields:");
        System.out.println(this.x);
        System.out.println(this.y);

        System.out.println(x);
        System.out.println(y);
    }

    public void parentClassFields() {
        System.out.println("Parent Class Fields:");
        System.out.println(super.a);
        System.out.println(super.b);
    }

    public static void main(String[] args) {

        ThisSuperDemo obj = new ThisSuperDemo();

        obj.currentClassFields();

        obj.parentClassFields();

        System.out.println("Call Argument Constructor Using this():");
        ThisSuperDemo obj2 = new ThisSuperDemo(100);
    }
}
