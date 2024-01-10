

import java.util.Scanner;

public class Exercise_12_KushalPrajapati {
    
    public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      
    System.out.print("Enter Celsius: ");
    Double tempcel= sc.nextDouble();
    Double faren= ((9.0/5.0)*tempcel)+32.0;
    System.out.println((Math.round(tempcel)+" degrees Celsius = "+Math.round(faren*100)/100)+" degrees Fahrenheit.");
    

   
    }    
    }
}
