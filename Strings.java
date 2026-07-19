public class StringFunctions {

    public void concatenateStrings() {
        System.out.println("Concatenating Strings:");
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
    }

    public void stringLength() {
        System.out.println("Length of String:");
        String str = "Java Programming";
        System.out.println("Length = " + str.length());
    }

    public void substringExample() {
        System.out.println("Substring:");
        String str = "Java Programming";
        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 4));
    }

    public void indexOfExample() {
        System.out.println("indexOf():");
        String str = "Java Programming";
        System.out.println(str.indexOf("Program"));
        System.out.println(str.indexOf('a'));
    }

    public void matchesExample() {
        System.out.println("matches():");
        String str = "Java123";
        System.out.println(str.matches("[A-Za-z0-9]+"));
    }

    public void compareStrings() {
        System.out.println("equals():");
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1.equals(s2));
    }

    public void compareMethods() {
        System.out.println("equalsIgnoreCase(), startsWith(), endsWith(), compareTo():");

        String s1 = "Java";
        String s2 = "java";
        String s3 = "Programming";

        System.out.println("equalsIgnoreCase = " + s1.equalsIgnoreCase(s2));
        System.out.println("startsWith = " + s3.startsWith("Pro"));
        System.out.println("endsWith = " + s3.endsWith("ing"));
        System.out.println("compareTo = " + s1.compareTo(s2));
    }

    public void trimExample() {
        System.out.println("trim():");
        String str = "   Hello Java   ";
        System.out.println(str.trim());
    }

    public void replaceExample() {
        System.out.println("replace():");
        String str = "Java";
        System.out.println(str.replace('a', 'o'));
    }

    public void splitExample() {
        System.out.println("split():");
        String str = "Java,Python,C,C++";
        String[] arr = str.split(",");

        for (String s : arr) {
            System.out.println(s);
        }
    }

    public void valueOfExample() {
        System.out.println("valueOf():");
        int num = 100;
        String str = String.valueOf(num);
        System.out.println(str);
    }

    public void integerToString() {
        System.out.println("Integer Object to String:");
        Integer num = 200;
        String str = num.toString();
        System.out.println(str);
    }

    public void upperLowerCase() {
        System.out.println("Uppercase and Lowercase:");
        String str = "Java Programming";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    public static void main(String[] args) {

        StringFunctions obj = new StringFunctions();

        obj.concatenateStrings();

        obj.stringLength();

        obj.substringExample();

        obj.indexOfExample();

        obj.matchesExample();

        obj.compareStrings();

        obj.compareMethods();

        obj.trimExample();

        obj.replaceExample();

        obj.splitExample();

        obj.valueOfExample();

        obj.integerToString();

        obj.upperLowerCase();
    }
}
