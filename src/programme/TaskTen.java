package programme;

import java.util.Scanner;

public class TaskTen {
    public static void main (String[]args){
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System .out.println("Please enter the number:   ");
        int number = scanner.nextInt();
        multiplicationTableOf(number);
        // closing the scanner object
        scanner.close();




    }
    // Printing the mulitiplication table of entered number
    public static void multiplicationTableOf(int number){
        System .out.println(number + "*" + 1+"=" + (number));
        System .out.println(number + "*" + 2+"=" + (number * 2));
        System .out.println(number + "*" + 3+"=" + (number * 3));
        System .out.println(number + "*" + 4+"=" + (number * 4));
        System .out.println(number + "*" + 5+"=" + (number * 5));
        System .out.println(number + "*" + 6+"=" + (number * 6));
        System .out.println(number + "*" + 7+"=" + (number * 7));
        System .out.println(number + "*" + 8+"=" + (number * 8));
        System .out.println(number + "*" + 9+"=" + (number * 9));
        System .out.println(number + "*" + 10+"=" + (number * 10));


    }
}
