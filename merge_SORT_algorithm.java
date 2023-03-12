package Sorting_algos;
import java.util.*;
public class merge_SORT_algorithm {

    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> list = new ArrayList<>();
        int P1=0;
        int P2=0;

        // Comparing elements from both arrays using 2 pointers and adding to answer list
        while( P1<A.size() && P2<B.size() ){

            if(A.get(P1) < B.get(P2) || A.get(P1).equals(B.get(P2)) ){
                list.add(A.get(P1));
                P1++;

            }
            else{
                list.add(B.get(P2));
                P2++;
            }

        }
// if one of the arrays is half added into the answer list we are handling it below
        while(P1<A.size()){
            list.add(A.get(P1));
            P1++;

        }
        while(P2<B.size()){
            list.add(B.get(P2));
            P2++;

        }

        return list;
    }
}
