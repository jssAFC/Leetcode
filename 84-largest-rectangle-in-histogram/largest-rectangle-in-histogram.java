class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nsl[]=new int[n];
        int nsr[]=new int[n];

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            int num=heights[i];

            while(!st.isEmpty() && num<=heights[st.peek()]){
                st.pop();
            }

            nsl[i]=st.isEmpty()?-1:st.peek();
            st.push(i); 
        }

        st.clear();

        for(int i=n-1;i>=0;i--){
            int num=heights[i];
            while(!st.isEmpty() && num<=heights[st.peek()]){
                st.pop();
            }

            nsr[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }


        // System.out.println(Arrays.toString(nsl));
        // System.out.println(Arrays.toString(nsr));
        int max=0;
        // return 1;
        
        for(int i=0;i<n;i++){
            int width=nsr[i]-nsl[i]-1;
            System.out.println(heights[i]*width);
            max=Math.max(max,heights[i]*width);
        }

        return max;


    }
}