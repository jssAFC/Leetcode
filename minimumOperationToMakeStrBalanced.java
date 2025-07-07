class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty() && ch=='a'){
                if(stack.peek()=='b'){
                    stack.pop();
                    count++;
                }
            }
            else stack.push(ch);
            
        }

        return count;
    }
}