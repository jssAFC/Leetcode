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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(length(head)<k) return head;

        ListNode currHead=head,temp=head;
        int count=0;
        ListNode prev=null;
        while(count<k){
            ListNode nextNode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextNode;
            count++;
        }

        ListNode newHead=reverseKGroup(temp,k);
        currHead.next=newHead;
        return prev;
        
    }

    public int length(ListNode temp){
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }

        return count;
    }
}