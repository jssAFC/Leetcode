class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int val : asteroids) {
            if (val > 0)
                st.push(val);
            else {
                while (!st.isEmpty() && st.peek()>0 && Math.abs(val)>st.peek()) {
                   st.pop();
                }

                if(st.isEmpty() || st.peek()<0) st.push(val);
                else if(st.peek() == -val) st.pop();
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;

    }
}