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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
    ListNode prev=null;
    ListNode temp= head;
    ListNode next= null;
    

    
    
    while(temp!=null){
        next=temp.next;
        temp.next=prev;
        prev=temp;
        temp=next;



    }
    

    return prev;


    }
}