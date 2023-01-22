package DSA_Arrays_Questions;
import java.util.*;
public class beggers_problem {

    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> list = new ArrayList<>();
// did not get the logic how it will work
        for(int i=0;i<A;i++){
            list.add(0);
        }

        for(int i=0;i<B.size();i++){
            int L=B.get(i).get(0)-1;
            int R=B.get(i).get(1)-1;
            int amt=B.get(i).get(2);

            int Lnum=list.get(L);
            // int Rnum=list.get(R+1);
            Lnum=Lnum + amt;
            list.set(L,Lnum);

            if(R!=list.size()-1){
                int Rnum=list.get(R+1);
                Rnum=Rnum - amt;
                list.set(R+1,Rnum);
            }

        }
        int Sum=list.get(0);
        for(int i=1;i<list.size();i++){
            Sum=Sum + list.get(i);
            list.set(i,Sum);
        }
        return list;
    }
}
