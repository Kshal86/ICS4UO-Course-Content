
public class KushalPrajapati_Exercise21 {
    public static void main(String[] args) {

       //Using a counted loop, output the arithmetic series for a sequence of 100 terms. The first value is 2 and the common difference is 3.  Hint: Create a variable to keep track of the current term in the sequence (initialize it to 2).

            int count=0;
            int sum=0;
            for (int i=2;i<=100;i+=3){
                System.out.println(i);
                sum+=i;
                count++;
            }
            System.out.println("The sum of the numbers from 1 to 100 is: "+sum);

    }
}