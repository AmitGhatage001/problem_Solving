package DSA_Array;
import java.util.*;
public class Matrix_Scaler_Product {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).size();j++){
                int Prod= B * A.get(i).get(j);
                A.get(i).set(j , Prod);
            }
        }

        return A;
    }
}
