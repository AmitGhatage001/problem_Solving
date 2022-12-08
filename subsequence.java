package DSA_Array;


    public class subsequence {
        public int solve(String A) {

            // int len = A.length();

            int count=0;
            int ans=0;
            int mod = 1000000007; // written 10^9 + 7 as a number here
            for(int i=A.length()-1;i>=0;i--){
                if(A.charAt(i)=='G'){ // when encountered G increasing count by 1
                    count=count+1;
                }
                else if(A.charAt(i)=='A'){
                    ans=ans+count;  // when encountered A adding count to ans variable
                    ans=ans % mod; // Still not getting why this is here ? (Answer is below)
                    // if X cannot divide Y and if we take X % Y == X
                    // example 2/10 gives remainder 2

                    // 5 % 1000000007 gives 50000000.35 (Wrong thinking)
                }
            }



            return ans;
        }
    }

