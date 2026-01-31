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
        ListNode prev=null,temp=head;

        return solve(temp,prev);

    
    }

    public ListNode solve(ListNode temp,ListNode prev){
        if(temp==null) return prev;
        ListNode next=temp.next;
        temp.next=prev;
        prev=temp;
        System.out.println(temp.val);
        return solve(next,prev);
    }
}