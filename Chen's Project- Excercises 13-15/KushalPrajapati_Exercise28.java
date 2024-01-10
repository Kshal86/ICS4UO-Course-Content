import java.util.Scanner;

public class KushalPrajapati_Exercise28 {
    public static void main(String[] args) {

        int n = 0;
        int a = 0;
        int d = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of terms in the sequence: ");
        n = input.nextInt();
        System.out.println("Enter the first value: ");
        a = input.nextInt();
        System.out.println("Enter the common difference: ");
        d = input.nextInt();

        for (int c = 1; c <= n; c = c + 1) {
            sum += ((n / 2) * (2 * a + (n - 1) * d));

        }

        System.out.println("The sum of the sequence is: " + sum);
    }
}