class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int left[] = new int[n];
        int right[] = new int[n];

        Stack<int[]> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = heights[i];

            while (!st.isEmpty() && num <= st.peek()[0])
                st.pop();
            if (st.isEmpty())
                left[i] = -1;
            else
                left[i] = st.peek()[1];

            st.push(new int[] { num, i });
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            int num = heights[i];

            while (!st.isEmpty() && num <= st.peek()[0])
                st.pop();
            if (st.isEmpty())
                right[i] = n;
            else
                right[i] = st.peek()[1];

            st.push(new int[] { num, i });
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            maxArea = Math.max(maxArea, width * heights[i]);
        }

        return maxArea;
    }
}