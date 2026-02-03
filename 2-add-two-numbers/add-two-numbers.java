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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode newHead=new ListNode(-1);
        ListNode temp=newHead;
        int carry=0;
        while(head1!=null && head2!=null){
            int sum=head1.val + head2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newNode=new ListNode(sum);
            temp.next=newNode;
            temp=newNode;
            head1=head1.next;
            head2=head2.next;
        }

        while(head1!=null){
            int sum=head1.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newNode=new ListNode(sum);
            temp.next=newNode;
            temp=newNode;
            head1 = head1.next;
        }

        while(head2!=null){
            int sum=head2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newNode=new ListNode(sum);
            temp.next=newNode;
            temp=newNode;
            head2 = head2.next;
        }
        if(carry!=0) temp.next = new ListNode(carry);
        return newHead.next;
    }

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
        }

        return prev;
    }
}