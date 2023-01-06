package leetcode_problems;
import java.util.*;
public class sum_Of_OddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {
        int PSum=0;
        // Building Prefix Array
        int[] Prefix = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            PSum = PSum + arr[i];
            Prefix[i]=PSum;
        }

        // Logic
        int Sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                int N=j-i+1;
                if(N%2==1){
                    if(i==0){
                        Sum=Sum + Prefix[j];
                    }
                    else{
                        Sum = Sum + Prefix[j]-Prefix[i-1];
                    }

                }
            }
        }
        return Sum;
    }
}
