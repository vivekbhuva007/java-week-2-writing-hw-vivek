package programme;

import java.util.Scanner;

public class TaskSeven {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the terperature in farenheit : ");
        float tem = scanner.nextFloat();
        TaskSeven taskSeven = new TaskSeven();
        taskSeven.converTempTODegreeCelcius(tem);


    }
    public void converTempTODegreeCelcius(float tem){
        float c = ((tem-32) * 5 /9);
        System.out.println("The temperature" + tem+ "Fahrenheit is equal to "+ c +"Degree celcius ");


    }

}
