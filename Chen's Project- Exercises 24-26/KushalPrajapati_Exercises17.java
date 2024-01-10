//Create a method called count that receives an array of doubles and a double.
//This method will output all the numbers that are greater than the double that was
//passed in.


import java.util.Scanner;

class KushalPrajapati_Exerceises17{
    public static void main(String[] args) {

    }

    public static void count(double[] array, double num){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                System.out.println(array[i]);
            }
        }
    }



}