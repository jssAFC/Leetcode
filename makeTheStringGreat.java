class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.empty()) stack.push(ch);
            else{
                char prev=stack.peek();
                if(Math.abs(prev-ch)==32){
                    stack.pop();
                    continue;
                }
                stack.push(ch);
            }
        }

        StringBuilder result=new StringBuilder();
        while(!stack.empty()) result.append(stack.pop());

        return result.reverse().toString();
    }
}