package programme;

import java.util.Scanner;

public class TaskSeventeen {
    public static void main (String[]args){
        // Scanner declaration for reading input from console
        System.out.println("Welcome to java program to convert decimal to binary number:  ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the decimal number");
        int number= scanner.nextInt();
        convertDeciTOBinary(number);
        // Closing the scanner object
        scanner.close();






    }
    // converting the decimal to binary
    public static void convertDeciTOBinary(int number){
        String binary = Integer.toBinaryString ( number);
        System.out.println("The binary value is: " + binary);



    }
}
