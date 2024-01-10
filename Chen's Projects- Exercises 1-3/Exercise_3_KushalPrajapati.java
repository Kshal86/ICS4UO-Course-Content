import java.util.Scanner;


public class Exercise_3_KushalPrajapati {

    /**
     * @param args
     */
    public static void main(String[] args) {
    
        // This will be an sample calculator program in java
        // This program will ask the user to enter two numbers
        // Then it will ask the user to enter an operator
        // Th1en it will print the result of the operation
        // The program will continue to ask the user if they want to continue
        // If the user enters "y", the program will continue
        // If the user enters "n", the program will end
        // If the user enters anything else, the program will ask the user to enter "y" or "n"
        // The program will continue to ask the user to enter "y" or "n" until the user enters "y" or "n"

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int number=sc.nextInt();
            System.out.println("Enter second number: ");
            int number2=sc.nextInt();
            System.out.println("Enter operator: ");
            String operator=sc.next();
            System.out.println("The Operater u chose is"+ operator);


            if (operator == ("+")){
                int result = number+number2;
                System.out.println("Result: " + result);}
            
            else if (operator == ("-")){
                int result = number-number2;
                System.out.println("Result: " + result);}

            else if (operator == ("*")){
                int result = number*number2;
                System.out.println("Result: " + result);}

            else if (operator == ("/")){
                int result = number/number2;
                System.out.println("Result: " + result);}

            else if (operator == ("%")){
                int result = number%number2;
                System.out.println("Result: " + result);}

            else{
                System.out.println("Invalid operator");

                
            }

            
        
        } 
        

    
    }

}
