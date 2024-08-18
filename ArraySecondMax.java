import java.util.Scanner;

public class ArraySecondMax {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of array= ");
        int size = sc.nextInt();

        int array[] = new int[size];

        display(array, size);
        insert(array, size);
        display(array, size);
        fmax(array, size);

    }

    public static void display(int[] array, int size) {
        for (int i = 0; i < size; i++) {

            System.out.println(array[i] + " ");
        }
    }

    public static void insert(int[] array, int size) {

        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element=" + i);
            array[i] = sc.nextInt();
        }
    }

    public static void fmax(int[] array, int size) {
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 1; i < size; i++) {
            if (array[i] > fmax) {
                smax = fmax;
                fmax = array[i];
            } else if (array[i] != fmax && array[i] > smax) {
                smax = array[i];
            }
        }
        System.out.println("fmax " + fmax + " scmax " + smax);
    }

}
