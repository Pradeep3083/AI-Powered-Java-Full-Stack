import java.util.Scanner;

// Print Even and Odd Numbers in Reverse Order

public class EvenOddReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println("Even : " + i);
            } else {
                System.out.println("Odd  : " + i);
            }
        }
    }
}
