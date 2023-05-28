package Greedy_algo;
import java.util.Comparator;
import java.util.*;
public class Solution {
    // here our ans was double(in decimal) and when we multiply by 100 it was modifying my answer to a diffrent value
    // for example ans is 2.55 for testcase A[3] , B[20] and C=17
    // But for above test case it returns 254
    // bcz when 2.55 * 100 = Computer gives 254.99999999999997
    // and our answer if modified from 255 to 254 when { return (int)ans } return statement is executed in code
    // So to tackle this loss we initially multiply the number by 1000 {so 2.55 becomes 2550}
    // and then divide {2550} by 10 to get correct answer which in 255 {(2.55*1000)/10}

    // these condition we encounter in cases where we typecast double/float values in integer by multiplying with multiple of 10 i.e (100 or 1000)
    // to avoid the ans being modified to a diffrent value we first multiply by the multiple of 10 which add a extra zero to our decimal value and convert ot to Integer
    // and then divide by 10
    // for example 2.55 we convert to 2550 by multiplying by 1000 and at last divide by 10 to get accurate answer
    // this way we avoide getting wrong answer which because of computer returning double value i.e rounded value which when converted to integer gives wrong answer


    // Learn Comparator function to sort arrays

    // class attributes/properties
    int weight;
    int value;
    double value_per_weight;
    //getters
    public int getWeight(){
        return weight;
    }
    public int getValue(){
        return value;
    }
    public double getValue_per_weight(){
        return value_per_weight;
    }
    // Constructor
    Solution(int value,int weight,double value_per_weight){
        this.value=value;
        this.weight=weight;
        this.value_per_weight=value_per_weight;
    }
    // we need default constructor with parameterized consytructor here
    Solution(){

    }
    public int solve(int[] A, int[] B, int C) {
        // created array of objects of a class Solution
        Solution[] arr = new Solution[A.length];
        // Created objects and stored in the array
        for(int i=0;i<A.length;i++){
            int value=A[i];
            int weight=B[i];
            double value_per_weight=(double)A[i]/B[i];
            arr[i]= new Solution(value,weight,value_per_weight);
        }
        // sort the array based on Value_per_weight
        // sorting the array based on Value_per_weight attribute
        Arrays.sort(arr,Comparator.comparingDouble(Solution::getValue_per_weight));

        // Main Logic
        double ans=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].weight<=C){
                ans=ans+arr[i].value;
                C=C-arr[i].weight;
            }
            else{
                ans=ans + C*arr[i].value_per_weight;
                break;
            }
        }
        // System.out.println(ans);

        // System.out.println(ans*100);

        return (int)((ans*1000)/10);

        // return (int)(ans*100);
    }
}

