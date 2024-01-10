

import java.util.Scanner;

class Exercise_7_KushalPrajapati {
    public static void main(String[] args) {
     
    try (Scanner sc = new Scanner(System.in)) {
        String w = "abcdefghijklmnopqrstuvwxyz";
        System.out.print("Enter an number: ");
        int x =sc.nextInt();
        System.out.print("Enter another number:");
        int y =sc.nextInt();


        System.out.println(w.substring(x,y-1));
    }

           
    }
}