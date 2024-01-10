import java.util.Scanner;

public class KushalPrajapati_Exercise15 {
    public static void main(String[] args) {

        //Using a counted loop, output the numbers from 1 to 100. In addition, keep a running total of the numbers from 1 to 100 (the arithmetic series) and output the total (i.e. 1+2+3+…+100).

        int count=0;
        int sum=0;
        for (int i=1;i<=100;i++){
            System.out.println(i);
            sum+=i;
            count++;
        }
        System.out.println("The sum of the numbers from 1 to 100 is: "+sum);

    }
}