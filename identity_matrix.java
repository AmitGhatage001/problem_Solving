package DSA_Array;
import java.util.*;
public class identity_matrix {
    public int solve(final List<ArrayList<Integer>> A) {
        int R=A.size(); // getting rows in list
        int C=A.get(0).size(); // getting columns

        int flag1=1;
        int flag2=1;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                int N=A.get(i).get(j);
                if(i==j && A.get(i).get(j).equals(0)){
                    flag1=0;
                }
                if(i!=j && A.get(i).get(j).equals(1)){
                    flag2=0;
                }
            }

        }
        if(flag1==1 && flag2==1)
            return 1;
        else
            return 0;
    }




    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter rows and column");
        int row_numbers=obj.nextInt();
        int col_numbers=obj.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        System.out.println("Enter the matrix in arraylist row wise");
        for(int i=0;i<row_numbers;i++){
            ArrayList<Integer> B = new ArrayList<>();
            for(int j=0;j<col_numbers;j++) {

                int N = obj.nextInt();
                B.add(N);
            }
            A.add(B);
        }
        identity_matrix obj1 = new identity_matrix();
        int ans=obj1.solve(A);
    }
}
