package Modular_arithmetic;
import java.util.*;
public class finding_power {

    public int solve(int A, int B, int C) {
        // write power function
        // ude modular arithmetic formula for X while calculating power

        // int ans= power(A,B,C);
        // need to use long int here as we cannot store the results in int
        long ans=1;
        int i=0;
        while(i<B){
            ans =(ans%C * A%C ) % C;
            i++;
        }
        return (int)ans;
    }
    
}
