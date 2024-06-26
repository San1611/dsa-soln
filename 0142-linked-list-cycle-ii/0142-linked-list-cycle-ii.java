/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head== null || head.next== null){
            return null;
        }

        ListNode hare= head;
        ListNode tur=head;

        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            tur=tur.next;

            if(tur==hare){
                tur=head;

                while(tur!=hare){
                    hare=hare.next;
                    tur=tur.next;                
                }

                return hare;

            }

            
        }

        return null;       
    }
}