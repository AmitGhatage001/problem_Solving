package Strings;
import java.util.*;
public class toggle {
    public String solve(String A) {
// Strings are immutable in java , we cannot change characters in a string in java

        // String str="";
        char[] charArray = new char[A.length()];

        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);

            if(ch>=65 && ch<=90){
                // ch += 32;
                charArray[i]=(char)(ch+32);
            }
            if(ch>=97 && ch<=122){
                // ch -= 32;
                charArray[i]=(char)(ch-32);
            }

        }
        String ans=String.valueOf(charArray);
        // return new String(charArray);
        return ans;
    }
}
