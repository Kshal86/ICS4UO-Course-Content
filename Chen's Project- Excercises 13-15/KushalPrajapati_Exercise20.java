
public class KushalPrajapati_Exercise20 {
    public static void main(String[] args) {

       //Output the number of terms of a sequence that starts at 6413 and ends at 1000, jumping by -3.

            int counter=0;
            for (int i = 6413; i >= 1000; i += -3) {
                System.out.println(i);
                counter++;
            }
            System.out.println("The number of terms is: "+counter);


    }
}