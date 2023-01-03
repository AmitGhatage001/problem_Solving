package DSA_Array_two;
import java.util.*;
public class sum_Odd_Indices {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> Prefix = new ArrayList<>();
        int Sum=0;
        for(int i=0;i<A.size();i++){
            if(i%2!=0){
                Sum = Sum + A.get(i);
                Prefix.add(Sum);
            }
            else{
                Prefix.add(Sum);
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<B.size();i++){
            int l=B.get(i).get(0);
            int r=B.get(i).get(1);

            int ans=0;

            if(l==0){
                ans=Prefix.get(r);
            }
            else{
                ans=Prefix.get(r) - Prefix.get(l-1);
            }
            list.add(ans);


        }
        return list;
    }
}
