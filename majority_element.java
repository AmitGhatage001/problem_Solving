package DSA_Array_two;
import java.util.*;
public class majority_element {

    public int majorityElement(final List<Integer> A) {
// not clear how i solved this
// not clear how i solved this
// not clear how i solved this
        int N=A.size();
        int ans=0;
        double cond=Math.floor(N/2);

        for(int i=0;i<A.size();i++){
            int Occur=0;
            for(int j=0;j<A.size();j++){
                if(A.get(i).equals(A.get(j)))
                    Occur++;
            }
            if(Occur>cond){
                ans = A.get(i);
                break;
            }
        }

        return ans;
    }
}
