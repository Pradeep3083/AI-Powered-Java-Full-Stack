import java.util.Scanner;

// Print Digits of a Number

public class PrintDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}
