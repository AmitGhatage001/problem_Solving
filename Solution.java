package others;

public class Solution {

    public int solve(int A) {
        int count=0;
        for(int i=2;i<=A;i++){
            int check=0;
            for(int j=2;j<i;j++){

                if(i%j==0)
                    check=check+1;

            }
            if(check==0)
                count=count+1;

        }
        return count;
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int N=obj.nextInt();

        Solution obj1 = new Solution();
        System.out.println(obj1.solve(N));
    }
}
