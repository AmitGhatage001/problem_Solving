package DSA_Array;

public class Leader_in_array {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int leader = A.get(A.size()-1); // assigning last element as leader
        list.add(leader); // adding rightmost element in arraylist first as it is compulsorily leader

        for( int i=A.size()-2; i>=0 ; i-- ){ // comparing every element to the kleader at the right
            if(A.get(i)>leader){   // if element is greater than the leader to right
                list.add(A.get(i)); // adding that element to answer ArrayList (i.e list)
                leader=A.get(i);
            }
        }
        return list;
    }
}
