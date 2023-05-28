package Greedy_algo;
import java.util.Comparator;
import java.util.*;
public class Solution {
    // Class attributes
    int start;
    int end;

    // creating default cunstructor
    Solution(){

    }

    // Constructor
    Solution(int start,int end){
        this.start=start;
        this.end=end;
    }
    // getters
    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }

    // Main Method
    public int solve(int[] A, int[] B) {
        // Creating a array of objects of class
        Solution[] arr = new Solution[A.length];

        // Entering attributes in object array
        for(int i=0;i<A.length;i++){
            int start=A[i];
            int end = B[i];

            arr[i] = new Solution(start,end);
        }

        // sorting the array based on the end attribute of objects of object array
        Arrays.sort(arr,Comparator.comparingInt(Solution::getEnd));

        // Main Logic
        int ans=1;
        int End=arr[0].end;

        for(int i=1;i<arr.length;i++){
            if(arr[i].start>=End){
                ans++;
                End=arr[i].end;
            }
        }

        return ans;

    }
}
