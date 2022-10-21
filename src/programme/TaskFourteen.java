package programme;

import java.util.Scanner;

public class TaskFourteen {
    // Calculating are and parameter of rectangle.
    public static void areaAndPerimeterOfRectangle(int height, int width){
        int perimeter = 2* (height + width);
        int area = (height* width);
        System.out.println("The area of rectangle is :  " + area);
        System.out.println("The perimeter of the rectangle is :" + perimeter);


    }
    public static void main (String[]args){
        // Scanner declararion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of rectangle: ");
        int height = scanner.nextInt();
        System.out.println("Enter the height of the rectanglr:  ");
        int width = scanner.nextInt();
        areaAndPerimeterOfRectangle(height,width);
        // closing the scanner object
        scanner.close();




    }
}
