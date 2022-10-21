package programme;

import java.util.Scanner;

public class TaskEighteen {

    public static void main (String[]args){

        // Scanner declaration for reading input from console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter first number:  ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number:  ");
        int secondNumber = scanner.nextInt();



    }
    // printing the all operations
    public void printTheOperation(int a, int b){
        System.out.println("the sum of"+ a+ "and" +b+ "is" + (a+b));
        System.out.println("The difference of " + a +"and" + b + "is" + (a-b));
        System.out.println("The difference of " + a +"and" + b + "is" + (a+b));
        System.out.println("The difference of " + a +"and" + b + "is" + (a*b));
        System.out.println("The difference of " + a +"and" + b + "is" + (a/b));
        System.out.println("The difference of " + a +"and" + b + "is" + (a%b));



    }
}
