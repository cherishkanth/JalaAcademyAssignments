public class OperatorsDemo {
    public void arithmeticOperators(int a, int b) {
        System.out.println("Arithmetic Operators :");
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
    }

    
    public void incrementDecrement() {
        System.out.println("\nIncrement & Decrement ");

        int x = 10;

        System.out.println("Initial Value : " + x);

        System.out.println("Post Increment (x++) : " + x++);
        System.out.println("After Post Increment : " + x);

        System.out.println("Pre Increment (++x)  : " + ++x);

        System.out.println("Post Decrement (x--) : " + x--);
        System.out.println("After Post Decrement : " + x);

        System.out.println("Pre Decrement (--x)  : " + --x);
    }

    public void equalNotEqual(int a, int b) {
        System.out.println("\nEqual & Not Equal : ");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }

    public void checkEqual(int a, int b) {
        System.out.println("\n Check Equality : ");

        if (a == b) {
            System.out.println("Both numbers are Equal.");
        } else {
            System.out.println("Both numbers are Not Equal.");
        }
    }

    public void logicalOperators(boolean x, boolean y) {
        System.out.println("\n Logical Operators :");

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));
        System.out.println("!y     : " + (!y));
    }

    public void relationalOperators(int a, int b) {
        System.out.println("\n Relational Operators: ");

        System.out.println("a < b  : " + (a < b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a >= b : " + (a >= b));
    }

    public void smallestLargest(int a, int b) {
        System.out.println("\n Smaller & Larger Number : ");

        if (a > b) {
            System.out.println("Larger Number  : " + a);
            System.out.println("Smaller Number : " + b);
        } else if (b > a) {
            System.out.println("Larger Number  : " + b);
            System.out.println("Smaller Number : " + a);
        } else {
            System.out.println("Both numbers are Equal.");
        }
    }

    public static void main(String[] args) {

        OperatorsDemo obj = new OperatorsDemo();

        int a = 20;
        int b = 10;

        obj.arithmeticOperators(a, b);

        obj.incrementDecrement();

        obj.equalNotEqual(a, b);

        obj.checkEqual(a, b);

        obj.logicalOperators(true, false);

        obj.relationalOperators(a, b);

        obj.smallestLargest(a, b);
    }
}
