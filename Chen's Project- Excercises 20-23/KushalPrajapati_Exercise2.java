

import java.util.Scanner;
public class KushalPrajapati_Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] number= new int[16];
        for (int i = 0; i < 16; i++){
            System.out.println("Enter a number: ");
            number[i]=input.nextInt();
        }
        for (int c=15;c>=0;c--){
            System.out.println(number[c]);
        }
    }
}
