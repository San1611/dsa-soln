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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead= new ListNode(-1);
        ListNode cur=dummyHead;
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                if(sum>0){
                ListNode newNode= new ListNode(sum);
                cur.next=newNode;
                cur=cur.next;
                }
            sum=0;
            }
            else
            {
                sum+=temp.val;
            }
            temp=temp.next;
        }
        return dummyHead.next;
    }
}