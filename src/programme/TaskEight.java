package programme;

import java.util.Scanner;

public class TaskEight {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of trinagle:  ");
        int length = scanner.nextInt();
        System.out.println("PLease enter the ehight of trinagle :  ");
        int height = scanner.nextInt();
        areOfTriangle(length,height);
        scanner.close();









    }
    // Calculating the area of triangle with no return type with parameter method

    public static void areOfTriangle(int length, int height){
        int area = (length* height) / 2;
        System.out.println("The are of a triangle is  :  " + area);


    }
}
