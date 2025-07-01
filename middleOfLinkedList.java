//  Statement - find the middle of the linkedlist. 2 approaches, either we traverse and find the length and run a loop upto mid. Then we return the mid. Or we use tortoise hare algo in which fast traverses 2 times faster tan slow and when fast reaches the null, we return the slow pointer

// Tc and Sc - O(N) and O(1)

// Code
class Solution {
    public ListNode middleNode(ListNode head) {
         ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }
}