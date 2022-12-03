package Sorting;
import java.util.*;
public class cost_of_operation {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A , Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<A.size();i++){
            sum= sum + A.get(i) * (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter Number of elements in arraylist");
        int N = obj.nextInt();
        for (int i = 0; i < N ; i++){
            int element = obj.nextInt();
            A.add(element);
        }
       cost_of_operation obj1 = new cost_of_operation();
        int ans=obj1.solve(A);
        System.out.println(ans);
    }
    }

