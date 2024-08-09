import java.util.Scanner;

public class EvenOddarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size=");
        int size = sc.nextInt();

        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array index=" + i);
            array[i] = sc.nextInt();
            System.out.println(array[i]);

        }
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even=" + array[i]);
            } else {
                System.out.println("Odd=" + array[i]);
            }
        }
    }
}
