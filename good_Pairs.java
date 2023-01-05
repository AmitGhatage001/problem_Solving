package DSA_Arrays_Questions;

public class good_Pairs {

    public int numIdenticalPairs(int[] nums) {
        int Count=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    Count++;
            }
        }

        return Count;
    }
}
