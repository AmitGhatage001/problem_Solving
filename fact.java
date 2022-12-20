public class fact {

    public class Solution {
        public int solve(int A) {
            // stop condition
            if(A==1){
                return 1;
            }

            return A*solve(A-1);
        }
    }
    
}
