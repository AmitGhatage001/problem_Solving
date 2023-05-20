package Recursion;
import java.util.*;
public class towersOfHanoi {

    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        int S=1;
        int T=2;
        int D=3;
        ArrayList<ArrayList<Integer>> AList = new ArrayList<>();
        return TOH(A,S,T,D,AList);
    }

    public ArrayList<ArrayList<Integer>> TOH(int A,int S,int T,int D,ArrayList<ArrayList<Integer>> AList){
        // Base Condition
        if(A==0){
            return AList;
        }
        // handling edge CASE
        // there was no edge Case
        // Step 1
        AList=TOH(A-1,S,D,T,AList);
        // Step 2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A);
        list.add(S);
        list.add(D);
        AList.add(list);
        //Step 3
        AList = TOH(A-1,T,S,D,AList);

        return AList;
    }
}
