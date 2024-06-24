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
    public ListNode middleNode(ListNode head) {
       
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        int size=1;
        ListNode op=head;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size%2==0){
            size=size/2;
        }
        else{
            size=size/2 +1;
        }
        for(int i=1;i<size;i++){
            op=op.next;
        }

        return op;

        
    }
}