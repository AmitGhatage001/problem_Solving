package leetcode_problems;

public class final_Value_after_Operatins {

    public int finalValueAfterOperations(String[] operations) {
        int ans=0;

        for(int i=0;i<operations.length;i++){

            if(operations[i].equals("X++") || operations[i].equals("++X")){
                ans++;
            }

            if(operations[i].equals("X--") || operations[i].equals("--X") ){
                ans--;
            }


        }

        return ans;

    }
}
