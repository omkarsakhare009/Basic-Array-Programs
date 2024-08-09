import java.util.Scanner;

public class ArrayFunctionRevision {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a size=");
        int size = sc.nextInt();

        int[] array = new int[size];

        display(array, size);
        insert(array, size);

        display(array, size);
        evennum(array, size);
        oddnum(array, size);
        display(array, size);
        modify(array, size);
        display(array, size);
        addition(array, size);
        display(array, size);
        findmax(array, size);
        findmin(array, size);

    }

    public static void display(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + "   ");
        }

    }

    public static void insert(int[] array, int size) {
        for (int i = 0; i < size; i++) {

            System.out.println("Enter array elements  at index " + i);
            array[i] = sc.nextInt();

        }
    }

    public static void evennum(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("This is even number=" + array[i]);
            }
        }
    }

    public static void oddnum(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("This is odd num=" + array[i]);
            }
        }
    }

    public static void modify(int[] array, int size) {

        System.out.println("Enter key element to add =");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            array[i] = array[i] + key;

        }
    }

    public static void addition(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        System.out.println("Addition is =" + sum);
    }

    public static void findmax(int[] array, int size) {
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println("This is max element=" + max);
    }

    public static void findmin(int[] array, int size) {
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];

            }

        }
        System.out.println("This is min element=" + min);
    }
}
