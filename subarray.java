package DSA_Array;

public class subarray {
    public class Solution {
        public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
            ArrayList<Integer> list = new ArrayList<>();

            for(int S=B;S<=C;S++){
                list.add(A.get(S));
            }

            return list;
        }
    }

}
