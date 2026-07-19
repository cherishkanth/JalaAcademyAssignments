public class BasicJavaPrograms {


    int num = 100;

    public void printName() {
        System.out.println("Name: Cherish Kanth");
    }

    public void variableScope() {
        int num = 50;
        System.out.println("Local Variable  : " + num);
        System.out.println("Global Variable : " + this.num);
    }

    public static void main(String[] args) {
        BasicJavaPrograms obj = new BasicJavaPrograms();
        System.out.println("  Print Name :-");
        System.out.println("Cherish Kanth");

    

        int age = 21;
        boolean isStudent = true;
        char grade = 'A';
        float salary = 25000.50f;
        double percentage = 92.5678;

        System.out.println("\n Data Types :");
        System.out.println("Integer   : " + age);
        System.out.println("Boolean   : " + isStudent);
        System.out.println("Character : " + grade);
        System.out.println("Float     : " + salary);
        System.out.println("Double    : " + percentage);

        System.out.println("\n Variable Scope:");
        obj.variableScope();

        System.out.println("\n Method Call:");
        obj.printName();
    }
}
