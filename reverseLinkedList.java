//  Statement:   We have to reverse the linkedlist

//  Approach:   We will take three pointers prev,temp and curr. Curr will keep track of current elements, prev will be used as the new head which will return the reverse linkedlist and temp is to traverse the next element of curr. We will assign the current element to prev and move curr to temp, until curr is null. This way the prev pointer will form a chain from null <- 1 <- 2 <- 3 and so on.

//  Time and Space Complexity: O(N) and O(1)

//  Solution
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode temp=null;
        ListNode curr=head;

        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;

    }
}