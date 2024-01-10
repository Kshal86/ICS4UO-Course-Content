
import java.util.Scanner;

public class Exercise_11_KushalPrajapati {
    
    public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

    System.out.print("Enter desk length in inches: ");
    Double leninch= sc.nextDouble();
    Double lencm= Math.round(2.54*leninch*100.0)/100.0; 
    System.out.print("Desk Length:"+lencm+"cm");

    }
    
    }
}
