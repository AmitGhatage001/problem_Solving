package Iterator;
import java.util.*;
public class iterator_use {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(32);
        list.add(55);
        list.add(55);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            int num = itr.next();
            System.out.print(num+" > ");
        }
        System.out.println();
        HashSet<String> set = new HashSet<>();
        set.add("Amit");
        set.add("Vicko");
        set.add("Putin");
        set.add("Trump");

        Iterator<String> itr2 = set.iterator();

        while(itr2.hasNext()){
            String str = itr2.next();
            System.out.print(str+" > ");
        }

    }
}
