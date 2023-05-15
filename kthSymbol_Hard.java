package Recursion;

public class kthSymbol_Hard {
    public int solve(int A, long B) {
        // Base Case
        if(A==0 && B==0){
            return 0;
        }

        // Main Logic
        // Finding Parent in a Binary tree
        int parent = solve(A-1,B/2);

        if(B%2==0){
            return parent;
        }
        else{
            // return !solve(A-1,B-mid);
            return  1-parent;

        }
    }
}
