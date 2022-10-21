package programme;

import java.util.Scanner;

public class TaskSixteen {
    public static void  main (String[]args){
        System.out.println("Welcome to java program to add two binary numbers");
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first binary number:");
        String first = scanner.nextLine();
        System.out.println("Please enter the second binary number: ");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumbers(first,second);
        System.out.println("THe addition of two binanry number is : " + addition);
        // closing the scanner object
        scanner.close();






    }
    // Adding the two binary numbers
    public static String addTwoBinaryNumbers(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second,2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);



    }

}
