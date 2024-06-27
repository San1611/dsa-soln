/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode hare=head.next;
        ListNode tur=head;

        while(hare!=null && hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            tur=tur.next;
        }

        tur.next=tur.next.next;
         


        return head;
        

    }
}