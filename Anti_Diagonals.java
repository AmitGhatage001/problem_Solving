package ArrayList;

public class Anti_Diagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {


// Look for better Approach for this problems solution


        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<ArrayList<Integer>>();
        int Col=A.get(0).size();
        int Row=A.size();
//first part
        for(int i=0;i<A.get(0).size();i++){
            int X=0;
            int Y=i;
            ArrayList<Integer> list = new ArrayList<>();
            while(X<Row && Y>=0){
                list.add(A.get(X).get(Y));
                X++;
                Y--;
            }
            int logic=Row-list.size();
            if(logic>0){
                for(int K=0;K<logic;K++){
                    list.add(0);
                }
            }

            mainlist.add(list);
        }
// Second part
        for(int i=1;i<Row;i++){

            int X=i;
            int Y=A.size()-1;// correction here in second part

            ArrayList<Integer> list = new ArrayList<>();
            while(X<Row && Y>=0){
                list.add(A.get(X).get(Y));
                X++;
                Y--;
            }
            int logic=Row-list.size();
            if(logic>0){
                for(int K=0;K<logic;K++){
                    list.add(0);
                }
            }

            mainlist.add(list);
        }
        return mainlist;

    }
}
