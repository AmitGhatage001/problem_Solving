package DSA_Array;

public class Column_sum {

    public ArrayList<Integer> solve(int A, int B, ArrayList<ArrayList<Integer>> C) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<B;i++){
            int sum=0;
            for(int j=0;j<A;j++){
                sum=sum + C.get(j).get(i);
            }
            list.add(sum);
        }
        return list;
    }
}
