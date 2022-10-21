package programme;

public class TaskThree {
    String name = "Prime";
    static String surname = "Testing";

    void instanceMethod(){
        System.out.println(name);
        System.out.println(surname);
    }
    public static void staticmethod(){
        System.out.println(surname);
        TaskThree taskThree = new TaskThree();
        System.out.println(taskThree);


    }
    public static void main(String[]args){
        TaskThree taskThree = new TaskThree();
        taskThree.instanceMethod();
        staticmethod();



    }
}
