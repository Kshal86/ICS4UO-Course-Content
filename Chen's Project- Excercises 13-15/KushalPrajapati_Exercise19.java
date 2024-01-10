import java.util.Scanner;

public class KushalPrajapati_Exercise19 {
    public static void main(String[] args) {

       //Output the number of terms of a sequence that starts at 0 and ends at 1000, jumping by 56.

            int counter=0;
            for (int i = 0; i <= 1000; i += 56) {
                System.out.println(i);
                counter++;
            }
            System.out.println("The number of terms is: "+counter);

    }
}