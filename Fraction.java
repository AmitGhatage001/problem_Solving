package objects_classes;
import java.util.*;
public class Fraction {

    //Observations
    //1). LCM and HCM/GCD will place key role while doing this problem :
    //2). LMC comes when we making denominator while adding and subtracting
    //3). GCD comes when we are making co prime numbers like  20/10 ==>2/1
    //4). while sending parameters to GCD make sure thats absolute values ( int abs(a),int abc(b)) kind ...
    int numerator, denominator;

    // Define constructor here

    Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }


    Fraction add(Fraction a){
        // Complete the function
        int lcm;
        //getting LCM of(denominator , a.denominator)
        if((denominator%a.denominator)==0){
            lcm=denominator;
        }else if((a.denominator%denominator)==0){
            lcm=a.denominator;
        }else {
            lcm=a.denominator*denominator;
        }

        int finalNumerator= (((numerator)*((lcm)/denominator)) + ((a.numerator) *((lcm)/a.denominator)));
        int finalDenominator=lcm;


        int gcd=getGCD(Math.abs(finalNumerator),Math.abs(finalDenominator));
        finalNumerator=finalNumerator/gcd;
        finalDenominator=finalDenominator/gcd;
        //  System.out.println("finalNumerator :"+finalNumerator);
        //  System.out.println("finalDenominator :"+finalDenominator);

        return new Fraction(finalNumerator,finalDenominator);

    }

    Fraction subtract(Fraction a){
        // Complete the function

        int lcm;

        if((denominator%a.denominator)==0){
            lcm=denominator;
        }else if((a.denominator%denominator)==0){
            lcm=a.denominator;
        }else {
            lcm=a.denominator*denominator;
        }

        int finalNumerator= (((numerator)*((lcm)/denominator)) - ((a.numerator) *((lcm)/a.denominator)));
        int finalDenominator=lcm;

        //While seding send absolute values fo GCD ,parameters should be postive .
        int gcd=getGCD(Math.abs(finalNumerator),Math.abs(finalDenominator));
        finalNumerator=finalNumerator/gcd;
        finalDenominator=finalDenominator/gcd;

        //  System.out.println("finalNumerator :"+finalNumerator);
        //  System.out.println("finalDenominator :"+finalDenominator);

        return new Fraction(finalNumerator,finalDenominator);

    }

    Fraction multiply(Fraction a){
        // Complete the function


        int finalNumerator= (numerator*a.numerator);
        int finalDenominator=denominator*a.denominator;

        int gcd=getGCD(Math.abs(finalNumerator),Math.abs(finalDenominator));
        finalNumerator=finalNumerator/gcd;
        finalDenominator=finalDenominator/gcd;

        return new Fraction(finalNumerator,finalDenominator);


    }

    //refer : https://www.geeksforgeeks.org/program-to-find-gcd-or-hcf-of-two-numbers/
    //calculating GCD and seding absolute values as parameters.
    int getGCD(int a ,int b) {

        if(a==b) {
            return a;
        }if(a>b) {
            return getGCD(a-b, b);
        }else {
            return getGCD(a, b-a);
        }

    }
}
