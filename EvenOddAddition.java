import java.util.Scanner;

public class EvenOddAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size=");
        int size = sc.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter array index=");
            array[i] = sc.nextInt();
            System.out.println(array[i]);
        }
        int evensum = 0;
        int oddsum = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {

                evensum = evensum + array[i];
                // System.out.println(evensum);
            } else if (array[i] % 2 != 0) {

                oddsum = oddsum + array[i];
                // System.out.println(oddsum);

            }

        }

        System.out.println("Even Addition is=" + evensum);
        System.out.println("Odd Addition is=" + oddsum);

    }
}
