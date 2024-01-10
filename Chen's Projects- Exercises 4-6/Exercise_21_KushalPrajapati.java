
import java.util.Scanner;
public class Exercise_21_KushalPrajapati {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of times at bat  ");
        double batting_times=sc.nextDouble();
        System.out.println("Enter number of singles  ");
        double singles=sc.nextDouble();
        System.out.println("Enter number of doubles  ");
        double doubles=sc.nextDouble();
        System.out.println("Enter number of triples  ");
        double triples=sc.nextDouble();
        System.out.println("Enter the number of home runs  ");
        double home_runs=sc.nextDouble();

        double batting_average=(singles+doubles+triples+home_runs)/batting_times;
        double slugging_average=(singles+(2*doubles)+(3*triples)+(4*home_runs))/batting_times;
        System.out.println("Batting average is "+Math.round(batting_average*1000.0)/1000.0);
        System.out.println("Slugging average is "+Math.round(slugging_average*1000.0)/1000.0);
        System.out.println("If I was a baseball player, I would be a");
        if (batting_average>=0.300 && slugging_average>=0.500) {
            System.out.println("MVP");
        }
        else if (batting_average>=0.300 && slugging_average<0.500) {
            System.out.println("All-Star");
        }
        else if (batting_average<0.300 && slugging_average>=0.500) {
            System.out.println("All-Star");





        }
    }
