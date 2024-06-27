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
    ListNode reverseRecursive(ListNode head){

        if(head==null || head.next== null){
            return head;
        }
        ListNode newHead=reverseRecursive(head.next);
        head.next.next= head;
        head.next=null;

        return newHead;
    }

    ListNode middle(ListNode head){
        ListNode hare=head;
        ListNode tur=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            tur=tur.next;
        }

        return tur;
    }
    public boolean isPalindrome(ListNode head) {
        if(head== null || head.next== null){
            return true;
        }

        ListNode middle= middle(head);
        ListNode newHead=reverseRecursive(middle);
        ListNode temp1=head;
        ListNode temp2= newHead;
         while(temp2.next!=null){
           

            if(temp1.val==temp2.val){
                
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else
            return false;
         }

         return true;
        
    }
}