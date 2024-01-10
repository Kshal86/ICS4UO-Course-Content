import java.util.Scanner;

public class KushalPrajapati_Exercise12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int price = 0;
        int total = 0;
        int counter = 0;
        do {
            total += price;
            System.out.println("Enter the price of the item: ");
            price = input.nextInt();

            counter++;
        } while (price >= 0);

        System.out.println("The total is: " + total);
        System.out.println("The number of items is: " + (counter-1));
    }
}