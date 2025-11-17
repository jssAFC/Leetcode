class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(String ch:tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int val1=stack.pop();
                int val2=stack.pop();

                switch(ch){
                    case "+"->stack.push(val1+val2);
                    case "-"->stack.push(val2-val1);
                    case "*"->stack.push(val2*val1);
                    case "/"->stack.push(val2/val1);
                    // default->stack.push(Integer.parseInt(ch));
                }
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }

        return stack.pop();
    }
}