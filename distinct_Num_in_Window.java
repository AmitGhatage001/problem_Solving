package DSA_Arrays_Questions;
import java.util.*;
public class distinct_Num_in_Window {

    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        // iterate over the window and put all elements in hashset
        // store the size of hashset in answerlist
        int S=0;
        int E=B-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(E<A.size()){
            HashSet<Integer> Hset = new HashSet<>();
            for(int i=S;i<=E;i++){
                int N=A.get(i);
                Hset.add(N);
            }

            list.add(Hset.size());
            S++;
            E++;
        }

        return list;
    }
}
