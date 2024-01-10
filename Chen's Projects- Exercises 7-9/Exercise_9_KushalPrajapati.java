import java.util.Scanner;
public class Exercise_9_KushalPrajapati {

    public static void main(String[] args) {

        double price;

        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Price");
        price = Math.abs(s.nextDouble());
        price = price * 1.13;
        System.out.println("Price with tax is:" + price);


    }
}
