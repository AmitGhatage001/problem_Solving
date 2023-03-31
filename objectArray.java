package objects_classes;
import java.util.*;
public class objectArray {
    // Object attributes
    String name;
    int age;
    int salary;

    // Constructor
    objectArray(String name,int age,int salary){
        //this keyword differentiates between the variable of object and the variables passed to constructors
        // only job of this keyword is to assign object attributes with the values which we pass to constructor
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // How we initialize the arrays for other data types
        //int[] arr = new int[10];
        //String[] str = new String[10];
        //float[] flt = new float[10];

        // we declare objects array as below
        constructor[] arr = new constructor[3];

        // passing objects into array by reading input from user
        for(int i=0;i<3;i++){
            System.out.println("Enter profile Details");
            String name=sc.next();
            int age=sc.nextInt();
            int salary=sc.nextInt();
            // creating object & passing attributes at same time using constructor
            arr[i]= new constructor(name,age,salary);
        }

        // printing all object from array one by one
        for(int i=0;i<3;i++){
            System.out.println("Please find below the target details list");
            System.out.println(arr[i].name);
            System.out.println(arr[i].age);
            System.out.println(arr[i].salary);
            System.out.println();
        }

    }
}
