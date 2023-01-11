package leetcode_problems;

public class find_middle_index {

    public int findMiddleIndex(int[] nums) {
        // create prefix array
        int[] Prefix = new int[nums.length];
        int PSum=0;
        for(int i=0;i<nums.length;i++){
            PSum = PSum + nums[i];
            Prefix[i]=PSum;
        }
        // iterate over prefix with left edge case and right edge case in mind
        int ans=-1;
        int LeftSum=0;
        int RightSum=0;
        for(int i=0;i<Prefix.length;i++){

            if(i==0){
                if(LeftSum==Prefix[nums.length-1]-Prefix[i]){
                    ans=i;
                    break;
                }

            }
            else if(i==nums.length){
                if(Prefix[i-1]==RightSum){
                    ans=i;
                    break;
                }

            }

            else if(Prefix[i-1]==Prefix[nums.length-1]-Prefix[i]){
                ans=i;
                break;
            }
        }

        return ans;
    }

}
