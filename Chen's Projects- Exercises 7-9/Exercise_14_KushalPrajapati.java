
import java.util.Scanner;

public class Exercise_14_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double HST=0.13;
        System.out.println("Enter the price of an item: ");
        double price=sc.nextDouble();
        double total=Math.round((price+(price*HST))*100.0)/100.0;
        System.out.println("The price of the item with the subtotal of $" + price + " is: $"+ total);
        
    }
}