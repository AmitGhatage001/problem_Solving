package Recursion;
import java.util.*;
public class combinations {
    
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {

        int i=1;
        ArrayList<ArrayList<Integer>> Alist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        combinations(i,A,B,list,Alist);

        return Alist;
    }

    public void combinations(int i,int A,int B, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> Alist){
        // Base Conditions
        if(B==0){
            // Alist.add(list);
            // Below line is important line , here we store the current elements of the list and let list be updated to any values
            // in recursive code , note - this list is being passed to recusrsive functions which updates it everytime do it's values
            // get updated everytime to new one'size

            Alist.add(new ArrayList < > (list));
            return;
        }
        if(i>A){
            return;
        }
        // Main recursive Logic


        // Choosing i
        list.add(i);
        combinations(i+1,A,B-1,list,Alist);
        list.remove(list.size()-1);

        // Not choosing i
        combinations(i+1,A,B,list,Alist); // 2 + 1= 3 ( Recursive code returns here )


        // Returning final ArrayList
        return;
    }
}
