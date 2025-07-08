class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i : asteroids) {
            if (i > 0) {
                stack.push(i);
            } else {
                int num=Math.abs(i);
               while(!stack.empty() && stack.peek()>0 && stack.peek()<num)
               stack.pop();

               if(stack.empty() || stack.peek()<0) stack.push(i);
               else if(stack.peek() == num) stack.pop();
            }
        }
        
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}