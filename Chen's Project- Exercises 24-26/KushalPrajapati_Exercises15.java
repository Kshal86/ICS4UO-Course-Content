
import java.util.Scanner;

class KushalPrajapati_Exercises15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("1. Personal Information");
                System.out.println("2. School Information");
                System.out.println("3. Transcript");
                System.out.println("4. Notes");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> PersonalInfo(); // print personal info
                    case 2 -> SchoolInfo(); // print school info
                    case 3 -> Transcript(); // print transcript
                    case 4 -> Notes();  // print notes 
                    case 5 -> System.out.println("Goodbye!"); // print goodbye
                    default -> System.out.println("Invalid choice.");
                }
            } while (choice != 5);
        }
    }

    public static void PersonalInfo() { // print personal info 
        String name= "Kushal Prajapati"; // print name
        String age = "20"; // print age
        String phone= "647-123-4567"; // print phone number
        String address= "1234 Main Street"; // print address
        String city= "Brampton"; // print city 
        String state= "ON"; // print state 
        String zip= "L6Y 2N1";

        System.out.println(name); // print name 
        System.out.println(age);  // print age 
        System.out.println(address+" "+city+","+state+" "+zip); // print address, city, state, zip 
    }

    public static void SchoolInfo() { // print school info 
        String name= "Harold M. Brathwaite SS"; // print name 
        String address= "23 Great Lakes BLVD";  // print address
        System.out.println(name);    // print name
        System.out.println(address); // print address
    }

    public static void Transcript() {
        System.out.println("English: 75"); //  print english mark
        System.out.println("Math: 80");  // print math mark
        System.out.println("Science: 85"); // print science mark
        System.out.println("History: 90");  // print history mark
        System.out.println("Geography: 95"); 
        System.out.println("PE: 100"); 
    }

    public static void Notes() {
        System.out.println("I like pizza.");
    }
}