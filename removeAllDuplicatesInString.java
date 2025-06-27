class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack= new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(stack.empty() || s.charAt(i)!=stack.peek()){
            stack.push(s.charAt(i));
            } 
            else{
                stack.pop();
            }
        }

        String ans="";
        while(!stack.empty()){
            ans+=stack.pop();
        }
        ans=new StringBuilder(ans).reverse().toString();
        return ans;
    }
}