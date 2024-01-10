
import java.util.Scanner;

public class Exercise_15_KushalPrajapati {
    
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
    
    System.out.print("Enter a number: ");
    int num= sc.nextInt();
    String num1= Integer.toString(num);
    System.out.println("The final digit is "+num1.charAt(num1.length()-1));

    }
}
}

