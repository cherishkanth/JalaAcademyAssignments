public class StaticInstanceDemo {

    static int a = 10;
    static int b = 20;

    int x = 100;
    int y = 200;

    public static void staticMethod1() {
        System.out.println("Static Method 1:");
        StaticInstanceDemo obj = new StaticInstanceDemo();
        System.out.println("Instance Variable x = " + obj.x);
        System.out.println("Instance Variable y = " + obj.y);
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2:");
        StaticInstanceDemo obj = new StaticInstanceDemo();
        obj.instanceMethod1();
        obj.instanceMethod2();
    }

    public void instanceMethod1() {
        System.out.println("Instance Method 1:");
        System.out.println("Static Variable a = " + a);
        System.out.println("Static Variable b = " + b);
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2:");
        staticMethod1();
        staticMethod2();
    }

    public static void main(String[] args) {

        StaticInstanceDemo obj = new StaticInstanceDemo();

        System.out.println("Print All Variables in Main:");

        System.out.println("Static Variable a = " + a);
        System.out.println("Static Variable b = " + b);

        System.out.println("Instance Variable x = " + obj.x);
        System.out.println("Instance Variable y = " + obj.y);

        System.out.println("Call Static Methods in Main:");
        staticMethod1();
        staticMethod2();

        System.out.println("Call Instance Methods in Main:");
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
