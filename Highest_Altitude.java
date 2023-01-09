package leetcode_problems;

public class Highest_Altitude {
    public int largestAltitude(int[] gain) {

        // don't know how i solved it , understanding'
        int LeftSum=0;
        int findMax=0;
        //TC-O(N)
        //SC-O(1)
        for(int i=0;i<gain.length;i++){
            LeftSum = LeftSum + gain[i];
            if(LeftSum>findMax){
                findMax=LeftSum;
            }
        }
        return findMax;
    }
}
