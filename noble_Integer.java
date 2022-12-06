package Sorting;

public class noble_Integer {
    public int solve(ArrayList<Integer> A) {


        Collections.sort(A);
        Collections.reverse(A);

        int gret=0;
        int ans=0;

        if(A.get(0).equals(0)){ // if first element of array is o and index is zero and arraylist index is zero it is a noble integer
            ans++; // we are handling edge case here
        }
        for(int i=1;i<A.size();i++){
            int C=A.get(i);
            int D=A.get(i-1);
            if(C!=D){
                gret=i;  // if it is new element then number of elements greater than it is equal to arrayindex of sorted array in descending order
            }

            if(A.get(i).equals(gret)){ // went wrong here
                ans++;
            }
        }
        if(ans==0)
            return -1;
        else
            return 1; // Went wrong here took ans as return value

    }
}
