package String_problems;
import java.util.*;
public class Beesly_String {

    public int solve(String A) {

        int mCount=0;
        int pCount=0;
        int aCount=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='m')
                mCount++;
            if(A.charAt(i)=='p')
                pCount++;
            if(A.charAt(i)=='a')
                aCount++;
        }

        if(mCount== pCount + aCount)
            return 1;
        else
            return 0;
    }
    
}
