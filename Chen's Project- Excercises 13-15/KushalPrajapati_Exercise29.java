
import java.util.Scanner;
public class KushalPrajapati_Exercise29 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter the area of the paper: ");
        double area=input.nextDouble();
        System.out.println("Enter the thickness of the paper: ");
        double thickness=input.nextDouble();
        double area1=0;
        double thickness1=0;
        for (int i=0;i<40;i++) {
            area1=area/2;
            thickness1=thickness*2;
            area=area1;
            thickness=thickness1;
        }
        System.out.println("The thickness of the pile is: "+thickness1);

    }
}