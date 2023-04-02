package linked_list;
import java.util.*;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class search_in_Linkedlist {
    public int solve(ListNode A, int B) {
        ListNode temp=A;
        while(temp!=null){
            if(temp.val==B){
                return 1;
            }
            else{
                temp=temp.next;
            }
        }

        return 0;
    }
}
}
