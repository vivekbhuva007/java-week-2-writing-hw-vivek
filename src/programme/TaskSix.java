package programme;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius :  ");
        double radius = scanner.nextDouble();
        areOfMethod(radius);


    }

    // calculating the area of circle
    public static void areOfMethod(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);

        System.out.println("the Area of Circle is : " + area);
    }

}
