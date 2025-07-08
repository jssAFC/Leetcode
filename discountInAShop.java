class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length-1;
        int result[]=prices.clone();
        result[n-1]=prices[n-1];
        Stack<Integer> st=new Stack<>();
        st.push(prices[n]);

        for(int i=prices.length-2;i>=0;i--){
            int curr=prices[i];
            while(!st.empty() && curr<st.peek()) st.pop();

            if(!st.empty()){
                result[i]=prices[i]-st.peek();
            }
            st.push(prices[i]);
        }
        

        return result;
        
    }
}