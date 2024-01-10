
import java.util.Scanner;

public class Exercise_13_KushalPrajapati {
    
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      
        System.out.print("Enter first speed: ");
        Double speed1= sc.nextDouble();
        System.out.print("Enter second speed: ");
        Double speed2= sc.nextDouble();
        System.out.print("Enter total distance: ");
        Double distance= sc.nextDouble();
        Double time= (distance/(speed1+speed2));
        System.out.println("She was running away for "+Math.round(time)+" hours.");
    }    
    }
}

