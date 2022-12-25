package DSA_Array;
import java.util.*;
public class inverse_Array {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            list.add(1);
        }

        for(int i=0;i<A.size();i++){
            int N=A.get(i);
            list.set(N,i);
        }
        return list;
    }
}
