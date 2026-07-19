class A {

    int value = 100;

    public void methodA1() {
        System.out.println("A Specific Method 1");
    }

    public void methodA2() {
        System.out.println("A Specific Method 2");
    }

    public void display() {
        System.out.println("Overridden Method in Class A");
    }
}

class B extends A {

    int value = 200;

    public void methodB1() {
        System.out.println("B Specific Method 1");
    }

    public void methodB2() {
        System.out.println("B Specific Method 2");
    }

    @Override
    public void display() {
        System.out.println("Overridden Method in Class B");
    }
}

class C extends B {

    int value = 300;

    public void methodC1() {
        System.out.println("C Specific Method 1");
    }

    public void methodC2() {
        System.out.println("C Specific Method 2");
    }

    @Override
    public void display() {
        System.out.println("Overridden Method in Class C");
    }
}

public class RuntimePolymorphismDemo {

    public static void main(String[] args) {

        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Class A Methods:");
        objA.methodA1();
        objA.methodA2();
        objA.display();

        System.out.println();

        System.out.println("Class B Methods:");
        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.display();

        System.out.println();

        System.out.println("Class C Methods:");
        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.display();

        System.out.println();

        System.out.println("Runtime Polymorphism (Method Overriding):");

        A ref1 = new B();
        ref1.display();

        A ref2 = new C();
        ref2.display();

        System.out.println();

        System.out.println("Runtime Polymorphism with Data Members:");

        A data1 = new B();
        System.out.println(data1.value);

        A data2 = new C();
        System.out.println(data2.value);
    }
}
