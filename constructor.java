package objects_classes;
import java.util.*;
public class constructor {
    String name;
    int age;
    int salary;

    constructor(String str,int a,int b){
        name=str;
        age=a;
        salary=b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//            System.out.println("Enter target profile");
//            String str=sc.next();
//            int age=sc.nextInt();
//            int salary=sc.nextInt();
            constructor obj = new constructor("Amit",25000,23);

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.salary);

    }
}
