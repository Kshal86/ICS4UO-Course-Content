import java.util.Scanner;

public class KushalPrajapati_Exercise9 {
    public static void main(String[] args) {

        //Write a program that will continually output the following prompt: “Continue? Enter no to stop”. For each prompt, this program will get a response from the user and output that response. This program will continue until ‘no’ is entered.
        Scanner input= new Scanner(System.in);
        String response="";
        do {
            System.out.println("Continue? Enter no to stop");
            response=input.nextLine();
            System.out.println(response);
        }
        while (!response.equals("no"));

    }
}