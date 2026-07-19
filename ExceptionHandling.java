import java.io.*;
import java.sql.*;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling {

    public void arithmeticWithoutHandling() {
        System.out.println("Arithmetic Exception Without Handling:");
        int a = 10 / 0;
    }

    public void arithmeticWithHandling() {
        System.out.println("Arithmetic Exception With Handling:");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public void throwsExample() throws Exception {
        throw new Exception("Exception from Method");
    }

    public void multipleCatch() {
        System.out.println("Multiple Catch:");
        try {
            int[] a = {1};
            System.out.println(a[2]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public void throwException() {
        System.out.println("Throw Exception:");
        throw new ArithmeticException("My Own Message");
    }

    public void customException() throws MyException {
        throw new MyException("Custom Exception");
    }

    public void finallyExample() {
        System.out.println("Finally Block:");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally Executed");
        }
    }

    public void arrayIndexException() {
        System.out.println("ArrayIndexOutOfBoundsException:");
        int[] a = {1, 2};
        System.out.println(a[5]);
    }

    public void classNotFound() throws ClassNotFoundException {
        Class.forName("Test");
    }

    public void fileNotFound() throws FileNotFoundException {
        new FileInputStream("abc.txt");
    }

    public void ioException() throws IOException {
        FileReader fr = new FileReader("abc.txt");
        fr.read();
    }

    public void noSuchField() throws Exception {
        String.class.getField("abc");
    }

    public void noSuchMethod() throws Exception {
        String.class.getMethod("abc");
    }

    public void nullPointer() {
        System.out.println("NullPointerException:");
        String s = null;
        System.out.println(s.length());
    }

    public void numberFormat() {
        System.out.println("NumberFormatException:");
        Integer.parseInt("Java");
    }

    public void stringIndex() {
        System.out.println("StringIndexOutOfBoundsException:");
        String s = "Java";
        System.out.println(s.charAt(10));
    }

    public void sqlException() throws SQLException {
        throw new SQLException("SQL Exception");
    }

    public static void main(String[] args) throws Exception {

        ExceptionHandling obj = new ExceptionHandling();

        // Uncomment one method at a time to observe each exception.

        // obj.arithmeticWithoutHandling();

        obj.arithmeticWithHandling();

        // obj.throwsExample();

        obj.multipleCatch();

        // obj.throwException();

        // obj.customException();

        obj.finallyExample();

        // obj.arrayIndexException();

        // obj.classNotFound();

        // obj.fileNotFound();

        // obj.ioException();

        // obj.noSuchField();

        // obj.noSuchMethod();

        // obj.nullPointer();

        // obj.numberFormat();

        // obj.stringIndex();

        // obj.sqlException();
    }
}
