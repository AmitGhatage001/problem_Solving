package hashMap;
import java.util.*;
public class frequency_Count {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        HashMap<Integer , Integer> Ham = new HashMap<>();

        // Storing ArrayElements and it's occurrence in hashmap
        for(int i=0;i<A.size();i++){

            if(Ham.containsKey(A.get(i))){ // if element is there already update it's value by 1
                int value=Ham.get(A.get(i));
                value += 1;
                Ham.put(A.get(i),value);

            }
            else{        // if element is not there add element as key with value 1
                Ham.put(A.get(i),1);
            }
        }

        //ArrayList for storing answers
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<B.size();i++){

            int Search=B.get(i);
            if(Ham.containsKey(Search)){
                int cnt=Ham.get(Search);
                list.add(cnt);
            }
            else{
                list.add(0);
            }
        }

        return list;
    }
}
