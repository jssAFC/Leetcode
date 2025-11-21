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
        int len=0;

        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        int middle=len/2+1;

        temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(count==middle) return temp;
            temp=temp.next;
        }

        return head;
    }
}