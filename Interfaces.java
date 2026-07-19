interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

interface Interface3 {
    void display();
}

interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

interface DefaultInterface {

    default void defaultMethod() {
        System.out.println("Default Method");
    }
}

public interface PublicInterface {

    int NUMBER = 100;
    String NAME = "Java";

    void publicMethod();
}

class InterfaceDemo implements Interface1, Interface2, Interface3,
        ChildInterface, DefaultInterface, PublicInterface {

    public void method1() {
        System.out.println("Interface1 Method");
    }

    public void method2() {
        System.out.println("Interface2 Method");
    }

    public void display() {
        System.out.println("Common Display Method");
    }

    public void parentMethod() {
        System.out.println("Parent Interface Method");
    }

    public void childMethod() {
        System.out.println("Child Interface Method");
    }

    public void publicMethod() {
        System.out.println("Public Interface Method");
    }

    public static void main(String[] args) {

        InterfaceDemo obj = new InterfaceDemo();

        System.out.println("One Method Interface:");
        obj.method1();

        System.out.println("Interface Reference:");
        Interface1 ref = new InterfaceDemo();
        ref.method1();

        System.out.println("Two Interfaces:");
        obj.method1();
        obj.method2();

        System.out.println("Same Method Signature:");
        obj.display();

        System.out.println("Default Method:");
        obj.defaultMethod();

        System.out.println("Interface Inheritance:");
        obj.parentMethod();
        obj.childMethod();

        System.out.println("Public Interface Fields:");
        System.out.println("NUMBER = " + NUMBER);
        System.out.println("NAME = " + NAME);

        obj.publicMethod();

        System.out.println("Static Final Variable:");
        System.out.println(NUMBER);
    }
}
