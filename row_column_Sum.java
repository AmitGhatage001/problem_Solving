package DSA_Array;
import java.util.*;
public class row_column_Sum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            int Sum=0;
            for(int j=0;j<A.get(0).size();j++){
                Sum = Sum + A.get(i).get(j);
            }
            list.add(Sum);
        }

        for(int i=0;i<A.get(0).size();i++){
            int Sum=0;
            for(int j=0;j<A.size();j++){
                Sum = Sum + A.get(j).get(i);
            }
            list.add(Sum);
        }
        return list;
    }
}
