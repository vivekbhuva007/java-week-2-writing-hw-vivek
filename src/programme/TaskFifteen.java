package programme;

import java.util.Scanner;

public class TaskFifteen {
    public static void main (String[]args){
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable:  ");
        int first = scanner.nextInt();
        System.out.println("ENter the second variable:  ");
        int second = scanner.nextInt();

    }
    // Swapping the value of variable
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before the swapping, The value of first variable is: " + a +"And second variable is:" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Aftere the swapping, The valus of first variable: " + a+ "and second variable is :" + b);




    }
}
