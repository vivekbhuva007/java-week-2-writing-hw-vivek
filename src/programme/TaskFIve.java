package programme;

import java.util.Scanner;

public class TaskFIve {
    // static method
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter first number :   ");
        int a  = scanner.nextInt();
        System.out.println("Please enter Second number :   ");
       int b = scanner.nextInt();

       addition(a,b);

      int sunresult =  subtraction(a,b);
      System.out.println("the subtraction of "+ a+ "and" + b+ "is : " + sunresult);

      TaskFIve taskFIve = new TaskFIve();
      taskFIve.multipilcation (a,b);

     int c = taskFIve.division(a, b);
     System.out.println("The division of " + a + "and" +b+ "is" + c);
     scanner.close();







    }

    int a ;
    int b ;

    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + "and" + b + "is : " + result);


    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    // instance method
    public void multipilcation(int a, int b) {
        int result = a * b;
        System.out.println("The multipilcation of" + a + "and" + b + "is :" + result);


    }
    public int division(int a, int b){
        return a/b;
    }
}

