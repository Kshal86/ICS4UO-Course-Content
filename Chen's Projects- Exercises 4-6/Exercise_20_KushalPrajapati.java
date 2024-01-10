import java.util.Scanner;

public class Exercise_20_KushalPrajapati {

    public static void main(String[] args) {

        double num1= 3000;
        double volume= (4.0/3.0)*Math.PI*Math.pow(6,3)*num1;
        double volume1= Math.round(volume*100.0)/100.0;
        System.out.println("The volume of the ball pit is "+volume1+" cm^3");

        }
    }
