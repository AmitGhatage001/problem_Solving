package hashmap;
import java.util.*;
public class common_element {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // create hashmap
        // store array elements as index but occurrence in array as value
        // iterate over 2nd array
        // if you encounter the element in map ,if found in array
        // confirm its value if greater than 1 and then decrease it's value by 1
        // then add this element in answer arraylist

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<A.size();i++){
            int Num=A.get(i);
            if(map.containsKey(Num)){
                int K=map.get(Num);
                map.put(Num,K+1);
            }
            else{
                map.put(A.get(i),1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<B.size();i++){
            int N=B.get(i);
            if(map.containsKey(N)){
                if(map.get(N)>0){
                    list.add(N);
                    int value=map.get(N);
                    value -=1;
                    map.put(N,value);
                }
            }
        }
        return list;
    }
}
