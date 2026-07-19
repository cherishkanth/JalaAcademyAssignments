public class MethodOverloading {

    public void display(int a) {
        System.out.println("One Integer Parameter: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Two Integer Parameters: " + a + " " + b);
    }

    public void show(int a) {
        System.out.println("Integer Parameter: " + a);
    }

    public void show(String s, int a) {
        System.out.println("String and Integer Parameters: " + s + " " + a);
    }

    public void print(int a) {
        System.out.println("Integer: " + a);
    }

    public void print(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        System.out.println("Same Method Name with Different Number of Integer Parameters:");
        obj.display(10);
        obj.display(10, 20);

        System.out.println();

        System.out.println("Same Method Name with Different Number/Data Type of Parameters:");
        obj.show(100);
        obj.show("Java", 200);

        System.out.println();

        System.out.println("Same Method Name with Same Number of Parameters but Different Data Types:");
        obj.print(50);
        obj.print(50.5);
    }
}
