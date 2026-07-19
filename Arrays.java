public class ArrayFunctions {

    public void sumOfArray(int[] arr) {
        System.out.println("Sum of Array:");
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }

    public void averageOfArray(int[] arr) {
        System.out.println("Average of Array:");
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Average = " + average);
    }

    public void findIndex(int[] arr, int value) {
        System.out.println("Find Index of Element:");
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        System.out.println("Index = " + index);
    }

    public void containsValue(int[] arr, int value) {
        System.out.println("Array Contains Specific Value:");
        boolean found = false;
        for (int num : arr) {
            if (num == value) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }

    public void removeElement(int[] arr, int value) {
        System.out.println("Remove Specific Element:");
        for (int num : arr) {
            if (num != value) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void copyArray(int[] arr) {
        System.out.println("Copy Array:");
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        for (int num : copy) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void insertElement(int[] arr, int position, int value) {
        System.out.println("Insert Element:");
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }

        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void minMax(int[] arr) {
        System.out.println("Minimum and Maximum:");
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }

    public void reverseArray(int[] arr) {
        System.out.println("Reverse Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void duplicateValues(int[] arr) {
        System.out.println("Duplicate Values:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public void commonValues(int[] arr1, int[] arr2) {
        System.out.println("Common Values:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public void removeDuplicates(int[] arr) {
        System.out.println("Remove Duplicate Elements:");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

    public void secondLargest(int[] arr) {
        System.out.println("Second Largest Number:");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }

    public static void main(String[] args) {

        ArrayFunctions obj = new ArrayFunctions();

        int[] arr = {10, 20, 30, 20, 40, 50, 10};
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 50, 60, 70};

        obj.sumOfArray(arr);

        obj.averageOfArray(arr);

        obj.findIndex(arr, 40);

        obj.containsValue(arr, 30);

        obj.removeElement(arr, 20);

        obj.copyArray(arr);

        obj.insertElement(arr1, 2, 99);

        obj.minMax(arr);

        obj.reverseArray(arr);

        obj.duplicateValues(arr);

        obj.commonValues(arr1, arr2);

        obj.removeDuplicates(arr);

        obj.secondLargest(arr);
    }
}
