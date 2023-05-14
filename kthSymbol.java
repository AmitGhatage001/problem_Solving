package Recursion;

public class kthSymbol {

    public int solve(int A, int B) {
        // Base Condition
        if(A==1){
            return 0;
        }

        // main logic
        int mid=(int) (Math.pow(2,A-1)/2);

        if(B<=mid-1){
            return solve(A-1,B);
        }
        else{
            // return !solve(A-1,B-mid);
            return  1-solve(A-1,B-mid);

        }


    }
}
