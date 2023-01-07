package leetcode_problems;

public class find_pivot_index {

    public int pivotIndex(int[] nums) {
// Solved in TC-O(N) & SC - O(N)
        // cvreate prefix Array of nums
        int Sum=0;
        int[] Prefix = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Sum = Sum + nums[i];
            Prefix[i]=Sum;
        }

        int S=0;
        int ans=-1;
        while(S<nums.length){
            int leftSum=0;
            int rightSum=0;

            if(S==0){
                leftSum=0;
            }
            else{
                leftSum=Prefix[S-1];
            }

            if(S==nums.length-1){
                rightSum=0;
            }
            else{
                rightSum=Prefix[nums.length-1]-Prefix[S];
            }

            if(leftSum==rightSum){
                ans=S;
                break;
            }

            S++;
        }
        return ans;
    }

}
