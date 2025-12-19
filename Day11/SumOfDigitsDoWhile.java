import java.util.Scanner;

// Sum of Digits using do-while Loop

public class SumOfDigitsDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;

        do {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        } while (num > 0);

        System.out.println("Sum of digits: " + sum);
    }
}
