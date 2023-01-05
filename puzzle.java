package prefix;
import java.util.*;
public class puzzle {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();

        int Prod=1;
        for(int i=0;i<A.size();i++){
            Prod=Prod * A.get(i);
        }

        for(int i=0;i<A.size();i++){
            int N=Prod/A.get(i);
            list.add(N);
        }

        return list;
    }
}
