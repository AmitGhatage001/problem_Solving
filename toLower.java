package Strings;

public class toLower {

    public char[] to_lower(char[] A) {

        int N=A.length;

        for(int i=0;i<N;i++){
            if(A[i]>=65 && A[i]<=90){
                A[i] += 32;
            }
        }

        return A;
    }
}
