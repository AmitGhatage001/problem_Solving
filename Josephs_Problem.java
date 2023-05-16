package Recursion;
import java.util.*;
public class Josephs_Problem {

    public int solve(int A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=A;i++){
            list.add(i);
        }
        int index = 0;
        B=B-1;
        int ans=-1;

        ans = joseph(list,B,index,ans);

        return ans;

    }

    public int joseph(ArrayList<Integer> list,int B,int index,int ans){
        if(list.size()==1){
            return list.get(0);
        }

        index = (index + B)%list.size();
        list.remove(index);
        // if(index==list.size()-1){
        //     index=0;
        // }

        return joseph(list,B,index,ans);

    }
}
