package DSA_Array;
import java.util.*;
public class largest_in_row {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            int large=Integer.MIN_VALUE;
            for(int j=0;j<A.get(0).size();j++){
                if(A.get(i).get(j)>large){
                    large=A.get(i).get(j);
                }
            }
            list.add(large);

        }
        return list;
    }

}
