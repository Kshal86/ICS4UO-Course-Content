import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Baseball Calculator!");
        System.out.println("Please enter the number of hits: ");
        int hits = input.nextInt();
        System.out.println("Please enter the number of at bats: ");
        int at_bats = input.nextInt();
        System.out.println("Please enter the number of walks: ");
        int walks = input.nextInt();
        System.out.println("Please enter the number of sacrifice flies: ");
        int sacrifice_flies = input.nextInt();
        System.out.println("Please enter the number of singles: ");
        int singles = input.nextInt();
        System.out.println("Please enter the number of doubles: ");
        int doubles = input.nextInt();
        System.out.println("Please enter the number of triples: ");
        int triples = input.nextInt();
        System.out.println("Please enter the number of home runs: ");
        int home_runs = input.nextInt();
        System.out.println("Please enter the number of earned runs: ");
        int earned_runs = input.nextInt();
        System.out.println("Please enter the number of innings pitched: ");
        int innings_pitched = input.nextInt();

        int choice;

        while (true) {
            System.out.println("Please select a statistic to calculate: ");
            System.out.println("1) Batting Average (AVG)");
            System.out.println("2) On Base Percentage (OBP)");
            System.out.println("3) Slugging Percentage (SLG)");
            System.out.println("4) On Base Plus Slugging (OPS)");
            System.out.println("5) Earned Runs Average (ERA)");
            System.out.println("6) Walks plus Hits per Innings Pitched (WHIP)");
            System.out.println("7) Exit");


            System.out.println("Enter the number of your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Batting Average: " + Methods.Batting_Average(hits, at_bats));
                case 2 -> System.out.println("On Base Percentage: " + Methods.On_Base_Percentage(hits, walks, at_bats, sacrifice_flies));
                case 3 -> System.out.println("Slugging Percentage: " + Methods.Slugging_Percentage(singles, doubles, triples, home_runs, at_bats));
                case 4 -> System.out.println("On Base Plus Slugging: " + Methods.On_Base_Plus_Slugging(hits, walks, at_bats, sacrifice_flies, singles, doubles, triples, home_runs));
                case 5 -> System.out.println("Earned Runs Average: " + Methods.Earned_Runs_Average(earned_runs, innings_pitched));
                case 6 -> System.out.println("Walks plus Hits per Innings Pitched: " + Methods.Walks_plus_Hits_per_Innings_Pitched(walks, hits, innings_pitched));
                case 7 -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }


    }
}