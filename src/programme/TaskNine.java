package programme;

import java.util.Scanner;

import static java.awt.SystemColor.text;

public class TaskNine {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        TaskNine taskNine = new TaskNine();
        taskNine.converUpperTOLower (uppercase);
        System.out.println();
        scanner.close();
    }
    // Conversation of uppercase to lowercase
    public void converUpperTOLower(String text){
        System.out.println("The lower case value is ="+ text.toLowerCase());

    }
}
