package Recursion;

public class magic_Number {
    public int solve(int A) {

        // write recursive code for addition of digits of a number (Done)
        // write recursive code for the answer till answer is single digit
        if(A/10==0){
            if(A==1){
                return 1;
            }
            else{
                return 0;
            }
        }
        int sum = sumDigit(A);
        return   solve(sum);


    }
    public int sumDigit(int A){
        if(A==0){
            return 0;
        }
        return (A%10) + sumDigit(A/10);

    }
}
