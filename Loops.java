public class ProgramFunctions {

    public void equalNotEqual(int a, int b) {
        System.out.println("Equal and Not Equal Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }

    public void oddEvenNumbers(int n) {
        System.out.println("Odd and Even Number:");
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    public void largestOfThree(int a, int b, int c) {
        System.out.println("Largest Number Among Three:");
        if (a >= b && a >= c) {
            System.out.println("Largest Number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number: " + b);
        } else {
            System.out.println("Largest Number: " + c);
        }
    }

    public void evenNumbersWhile() {
        System.out.println("Even Numbers Between 10 and 100:");
        int i = 10;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public void armstrongNumber(int num) {
        System.out.println("Armstrong Number:");
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }

    public void primeNumber(int num) {
        System.out.println("Prime Number:");

        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }

    public void palindromeNumber(int num) {
        System.out.println("Palindrome Number:");

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is Palindrome");
        } else {
            System.out.println(original + " is Not Palindrome");
        }
    }

    public void evenOddSwitch(int num) {
        System.out.println("Even or Odd Using Switch:");

        switch (num % 2) {
            case 0:
                System.out.println(num + " is Even");
                break;
            case 1:
                System.out.println(num + " is Odd");
                break;
        }
    }

    public void genderSwitch(char gender) {
        System.out.println("Gender Using Switch:");

        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;

            case 'F':
            case 'f':
                System.out.println("Female");
                break;

            default:
                System.out.println("Invalid Gender");
        }
    }

    public static void main(String[] args) {

        ProgramFunctions obj = new ProgramFunctions();

        obj.equalNotEqual(10, 20);

        obj.oddEvenNumbers(25);

        obj.largestOfThree(15, 28, 12);

        obj.evenNumbersWhile();

        obj.armstrongNumber(153);

        obj.primeNumber(29);

        obj.palindromeNumber(121);

        obj.evenOddSwitch(18);

        obj.genderSwitch('M');
    }
}
