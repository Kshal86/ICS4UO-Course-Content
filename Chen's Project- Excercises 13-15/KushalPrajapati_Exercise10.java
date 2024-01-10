import java.util.Scanner;

public class KushalPrajapati_Exercise10 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        String response="";
        do {
            System.out.println("Enter a string: ");
            response=input.nextLine();

        }
        while (!response.equals("excellent"));
    }
}