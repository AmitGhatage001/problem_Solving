package hashMap;
import java.util.*;
public class map_of_maps_example {
    // how to store each record separately please look into it <imp>
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // Declare two hashmap and pass one map as value in other hashmap
        // Scan the elements and put in map inside for loop one by one / 1 iteration for each
        HashMap<String,String> mapOne = new HashMap<>();

        HashMap<String,HashMap<String,String>> mapTwo = new HashMap<>();

        for(int i=0;i<3;i++){
            System.out.println("Enter State");
            String State=obj.next();
            System.out.println("Enter District");
            String District=obj.next();
            System.out.println("Enter Village");
            String Village=obj.next();

            mapOne.put(District,Village);
            mapTwo.put(State,mapOne);

        }

        System.out.println(mapTwo);
        System.out.println(mapTwo.size());
        System.out.println(mapOne.size());
    }
}
