package programme;

import java.util.Scanner;

public class TaskThirteen {
    public static void main (String[]args){
        // Scanner declaration for reading input for console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :  ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number:  ");
        int y = scanner.nextInt();
        System.out.println("Enter the third number:   ");
        double z = scanner.nextDouble();



    }
    // Calculation the average of three number.
    public static void averageOfThreeNumber(double a , double b, double c){
        double average = (a+ b+ c) / 3;
        System.out.print(" The average of " + a + " , " + b + " and " + c + " is : " + average);
    }



        }
