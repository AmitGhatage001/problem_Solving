package patterns;
import java.util.*;
public class Different_Number_Triangle {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner obj = new Scanner(System.in);
        int N=obj.nextInt();
        int A=N;
        int OL=1;
        int Numlog=N;
        for(int i=0;i<A;i++){

            int NL=N;

            for(int k=1;k<N;k++){
                System.out.print("0 ");
            }

            for(int k=1;k<=OL;k++){
                System.out.print(NL+" ");
                NL=NL+Numlog;
            }

            for(int k=1;k<N;k++){
                System.out.print("0 ");
            }

            N--;
            OL=OL + 2;
            Numlog--;
            System.out.println();
        }
    }
}
