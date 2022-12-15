package Recursion;
import java.util.*;
public class printing_with_recursion {
    public void solve(int N){
        if(N==1){
            System.out.print(1+" ");
            return;
        }
        solve(N-1);
        System.out.print(N+" ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number");
        int N=obj.nextInt();
        printing_with_recursion obj2 = new printing_with_recursion();
        obj2.solve(N);
    }
}
