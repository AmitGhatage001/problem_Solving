package DSA_Array;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class rotating_number {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int S=obj.nextInt();
        //System.out.println("Enter the number of rotations to be performed");
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<S;i++){
            int B=obj.nextInt();
            A.add(B);
        }

        int N=A.size();
        int P1=0;
        int P2=N-1;

        while(P1<P2){          // Reversing A
            int logic=A.get(P1);
            A.set(P1 , A.get(P2));
            A.set(P2 , logic);
            P1++;
            P2--;
        }

        System.out.println(A);
    }
}
