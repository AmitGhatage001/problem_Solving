package DSA_Array;

public class Equillibrium_index {

    public class Solution {

        // please revisit the problem once again
// why code is working without break
        public int solve(ArrayList<Integer> A) {
            // assigning ans as -1 at first if we dont get any equillibrium we will return this
            int ans=-1;
// Creating prefix Sum
            int[] Prefix = new int[A.size()];
            int sum=0;
            for(int i=0;i<A.size();i++){
                sum = sum + A.get(i);
                Prefix[i]=sum;
            }

// implementing logic from here

// iterating over an array by element and getting left sum and right sum
            int left=0;
            int right=0;

            for(int i=0;i<A.size();i++){
                if(i==0){
                    left=0;
                }
                else{
                    left=Prefix[i-1];
                }
                if(i==A.size()-1){
                    right=0;
                }
                else{
                    right=Prefix[A.size()-1] - Prefix[i];
                }

                if(left==right){
                    ans=i;
                    break;  // code is working without break ? Guess Why ? find the answer why ?
                }
            }


            return ans;
        }
    }
}
