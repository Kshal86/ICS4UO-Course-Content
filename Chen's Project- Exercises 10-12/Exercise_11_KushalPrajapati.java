
import java.util.Scanner;

public class Exercise_11_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Enter a day:");
        String day=sc.nextLine();
        day=day.toLowerCase();//Converts the string to lowercase

        //Write a program to show your planned activities for one full week using the case
        //construct.

        switch(day){ //Switch case
            case "monday":
                System.out.println("Monday: I have a math test");
                break;
            case "tuesday":
                System.out.println("Tuesday: I have a science test");
                break;
            case "wednesday":
                System.out.println("Wednesday: I have a history test");
                break;
            case "thursday":
                System.out.println("Thursday: I have a math test");
                break;
            case "friday":
                System.out.println("Friday: I have a science test");
                break;
            case "saturday":
                System.out.println("Saturday: I have a history test");
                break;
            case "sunday":
                System.out.println("Sunday: I have a math test");
                break;
            default:
                System.out.println("Error: " + day + " is not a day of the week");
                break;
        }
    }
}






