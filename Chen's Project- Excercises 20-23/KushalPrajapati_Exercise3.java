

import java.util.Scanner;

public class KushalPrajapati_Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many video games do you have in your collection?");
        int numGames = input.nextInt();
        String [] games = new String[numGames];
        for (int i = 0; i < numGames; i++){
            System.out.println("Enter the name of a video game: ");
            games[i]=input.next();
        }
    }
}
