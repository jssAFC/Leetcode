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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        int arr[]=new int[size];

        temp=head;
        int index=0;
        while(temp!=null){
            arr[index++]=temp.val;
            temp=temp.next;
        }
        int []res=arr.clone();
        Arrays.fill(res,0);

        Stack<Integer> st=new Stack<>();
        st.push(arr[size-1]);
        for(int i=size-2;i>=0;i--){
            int curr=arr[i];
            while(!st.empty() && curr>=st.peek()) st.pop();
            if(!st.empty()) res[i]=st.peek();
            st.push(arr[i]);
        }
        
        return res;
    }
}