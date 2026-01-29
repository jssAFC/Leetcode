class Solution {
    public int maximalRectangle(char[][] matrix) {

        int n=matrix.length;
        int m=matrix[0].length;

        int []nums= new int[m];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ch=matrix[i][j]-'0';
                if(ch>0) nums[j]=nums[j]+ch;
                else nums[j]=0;
            } 
            
            System.out.println(Arrays.toString(nums));
            max=Math.max(max,solve(nums));
            System.out.println(max);

        }

        return max;
    }

    public int solve(int[] nums){
        int n=nums.length;

        int left[]= new int[n];
        int right[]=new int[n];

        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n;i++){
            int num=nums[i];

            while(!st.isEmpty() && nums[st.peek()]>=num) st.pop();
            left[i]=st.isEmpty()?-1:st.peek();

            st.push(i);
        }

        st.clear();

        for(int i=n-1;i>=0;i--){
            int num=nums[i];

            while(!st.isEmpty() && nums[st.peek()]>=num) st.pop();
            right[i]=st.isEmpty()?n:st.peek();

            st.push(i);
        }

        int max=0;

        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            max=Math.max(max,nums[i]*width);
        }

        return max;
    }
}