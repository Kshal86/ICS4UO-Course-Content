
import java.util.Scanner;
public class KushalPrajapati_Exercises4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] price = new double[10];
        double[] newprice = price;

        for (int i = 0; i < 10; i++) {
            System.out.println("What would you like for index: " + (i + 1));
            price[i] = sc.nextDouble();

        }
        // make a loop to reverse the order of the array
        int num = 10;
        for (int i = 0; i < 9; i++) {
            newprice[i] = price[num - 1];
            num--;
            System.out.println(newprice[i]);

            for (int b = 0;  b < 9; b++) {
                newprice[b] = price[num - 1];
                num--;
                System.out.println(newprice[i]);
            }

        }
    }
}

