package other_codes;

public class Matrix_Transpose {
    public class Solution {
        public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

            ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
// solved by 0(N^2)
            for(int i=0;i<A.get(0).size();i++){
                ArrayList<Integer> list = new ArrayList<>();
                for(int j=0;j<A.size();j++){
                    int N=A.get(j).get(i);
                    list.add(N);
                }
                answer.add(list);
            }
            return answer;
        }
    }
}
