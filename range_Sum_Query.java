package DSA_Arrays_Questions;
import java.util.*;
public class range_Sum_Query {


    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
// Solved Using PreFix Logic
        // Build prefix Sum ArrayList
        // answer Queries using prefix Sum ArrayList

        ArrayList<Integer> Prefix = new ArrayList<>();

        int Sum=0;
        for(int i=0;i<A.size();i++){
            Sum = Sum + A.get(i);
            Prefix.add(Sum);
        }
        ArrayList<Integer> list = new ArrayList<>();
        // answer the Queries by getting l & R from Build
        int ans=0;
        for(int i=0;i<B.size();i++){
            int L=B.get(i).get(0);
            int R=B.get(i).get(1);

            if(L==1){
                ans=Prefix.get(R-1);
            }
            else if(L==R){
                ans=A.get(L-1);
            }
            else {
                ans=Prefix.get(R-1)-Prefix.get(L-2);
            }

            list.add(ans);


        }
        return list;
    }
}
