
import java.util.Scanner;

public class Exercise_2_KushalPrajapati {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);//Scanner class
        final double TAX=1.13;//Tax rate
        System.out.println("Enter the total purchase made:");
        int total_purchase=sc.nextInt();//InpuExercise_2_KushalPrajapatit total purchase
        if (total_purchase>=100){
             double discount=total_purchase*0.85;
             System.out.println("Subtotal with discount is: "+discount);
                System.out.println("Total after tax is: "+discount*TAX);


        }
        else{
            System.out.println("Subtotal is: "+total_purchase);
            System.out.println("Total after tax is: "+total_purchase*TAX);
        }

    }
}


