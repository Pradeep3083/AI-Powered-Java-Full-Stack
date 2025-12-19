import java.util.Scanner;

// Count Digits using do-while Loop

public class CountDigitsDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count = 0;

        do {
            num = num / 10;
            count++;
        } while (num > 0);

        System.out.println("Digit count: " + count);
    }
}
