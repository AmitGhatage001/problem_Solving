package Recursion;
import java.util.*;
public class parenthesis {

    public ArrayList<String> generateParenthesis(int A) {

        ArrayList<String> Alist = new ArrayList<>();

        String str="(";

        int open=1;
        int close=0;

        Alist = generator(Alist,str,open,close,A);

        return Alist;
    }

    public ArrayList<String> generator(ArrayList<String> Alist,String str,int open,int close,int A){

        // Base Condition's
        if(open==close && open+close==A*2){
            Alist.add(str);
            return Alist;
        }
        if(open>A){
            return Alist;
        }
        if(close > open){
            int delete=str.length()-1;
            str=str.substring(0,delete);

            return Alist;
        }

        // Main logic


        str=str + "(";
        generator(Alist,str,open+1,close,A);

        int delete=str.length()-1;
        str=str.substring(0,delete);

        str=str + ")";
        generator(Alist,str,open,close+1,A);

        return Alist;
    }

}
