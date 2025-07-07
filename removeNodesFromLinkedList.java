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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            if(stack.empty()) stack.push(temp);
            else{
                int peek=stack.peek().val;
                int curr=temp.val;
                if(curr>peek){
                    while(!stack.empty() && curr>stack.peek().val) stack.pop();
                }
                stack.push(temp);
            }
            temp=temp.next;
        }
// System.out.println(stack);
        // Stack<ListNode> s2=new Stack<>();
        ListNode next=null;
        while(!stack.empty()){
            ListNode curr=stack.pop();
            curr.next=next;
            next=curr;
        }
        return next;

    }
}