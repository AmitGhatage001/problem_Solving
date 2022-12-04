package DSA_Array;
import java.util.*;
public class reversing_Array_in_Min_iterations {

    public static void main(String[] args) {
        // Taking Input
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of elements in array");
        int N=obj.nextInt();
        System.out.println("Enter elements in array");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            int val=obj.nextInt();
            list.add(val);
        }

        // Logic

        int P1=0;
        int P2=list.size()-1;

        while(P1<P2){  // Swapping The numbers
            int rotate=list.get(P1);
            list.set(P1 , list.get(P2));
            list.set(P2 , rotate);
            P1++;
            P2--;
        }
        System.out.println(list);

    }
}
