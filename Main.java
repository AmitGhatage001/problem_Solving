package others;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner obj = new Scanner(System.in);
        int T=obj.nextInt();

        for(int j=0;j<T;j++){

            int N=obj.nextInt();
            int flag=0;
            if(N==1){
                System.out.println(1);
            }
            else{
                for(int i=0;i<=N/2;i++){
                    if(i*i==N){
                        flag=1;
                        break;
                    }
                }
                System.out.println(flag);
            }
        }
    }
}
