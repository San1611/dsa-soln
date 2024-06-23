/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prevNode= null;
        
        while(node!=null && node.next!=null){
            node.val=node.next.val;
            prevNode=node;
            node=node.next;
        }

        if(prevNode!=null){
            prevNode.next=null;
        }

       
        
    }
}