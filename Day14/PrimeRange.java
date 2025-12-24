import java.util.Scanner;

public class PrimeRange {

    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
