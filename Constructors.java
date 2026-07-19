class Parent {

    public Parent() {
        System.out.println("Parent Public Default Constructor");
    }

    protected Parent(int a) {
        System.out.println("Parent Protected One Argument Constructor: " + a);
    }
}

public class Constructors extends Parent {

    private ConstructorDemo(String s) {
        System.out.println("Private Constructor: " + s);
    }

    public ConstructorDemo() {
        super();
        System.out.println("Child Public Default Constructor");
    }

    protected ConstructorDemo(int a) {
        super(a);
        System.out.println("Child Protected One Argument Constructor: " + a);
    }

    ConstructorDemo(int a, int b) {
        super();
        System.out.println("Child Default Two Argument Constructor: " + a + " " + b);
    }

    public static void main(String[] args) {

        System.out.println("Default Constructor:");
        ConstructorDemo obj1 = new ConstructorDemo();

        System.out.println();

        System.out.println("One Argument Constructor:");
        ConstructorDemo obj2 = new ConstructorDemo(10);

        System.out.println();

        System.out.println("Two Argument Constructor:");
        ConstructorDemo obj3 = new ConstructorDemo(20, 30);

        System.out.println();

        System.out.println("Private Constructor:");
        ConstructorDemo obj4 = new ConstructorDemo("Java");
    }
}
