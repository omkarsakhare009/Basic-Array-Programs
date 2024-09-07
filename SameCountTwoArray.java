import java.util.Scanner;

public class SameCountTwoArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of an array=");
        int size = sc.nextInt();

        int[] array = new int[size];

        insert(array, size);
        count(array, size);
        isfound(array, size);
    }

    public static void insert(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element=");
            array[i] = sc.nextInt();
        }
    }

    public static void count(int[] array, int size) {

        int[] copyarray = new int[size];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int key = array[i];

            boolean found = isfound(copyarray, key);
            if (!found) {

                for (int j = 0; j < array.length; j++) {
                    if (array[j] == key) {
                        count++;
                    }

                }
                System.out.println(key + "found" + count + "times");
                copyarray[i] = key;
            }
        }
    }

    public static boolean isfound(int[] copyarray, int key) {
        for (int i = 0; i < copyarray.length; i++) {
            if (copyarray[i] == key) {
                return true;
            }
        }
        return false;
    }
}
