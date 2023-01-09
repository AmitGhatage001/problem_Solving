package Strings;

public class toUpper {
    public char[] to_upper(char[] A) {

        for(int i=0;i<A.length;i++){
            if(A[i]>=97 && A[i]<=122){
                A[i] -= 32;
            }
        }

        return A;
    }
}
