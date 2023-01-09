package Strings;

public class reverse_String {
    public String solve(String A) {
// See Comments below for knowledge on Strings
        String rev="";

        char[] SA = A.toCharArray();// This is how we convert String to character array

        int S=0;
        int E=A.length()-1;
        while(S<E){
            char ch=SA[S];
            char cht=SA[E];
            SA[S]=cht;
            SA[E]=ch;
            S++;
            E--;
        }
        String ans=String.valueOf(SA); // This is how we convert Character Array to String
        return ans;
    }
}
