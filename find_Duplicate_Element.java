package hashMap;
import java.util.*;
public class find_Duplicate_Element {

    public int solve(ArrayList<Integer> A) {

        HashMap<Integer , Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<A.size();i++){

            if(map.containsKey(A.get(i))){

                if(map.get(A.get(i))<min)
                    min=map.get(A.get(i));
            }
            else{
                map.put(A.get(i),i);
            }
        }

        // int ans=0;

        if(min==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return A.get(min);
        }


    }
}
