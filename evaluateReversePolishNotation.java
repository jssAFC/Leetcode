class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
    for (String s : tokens) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            int n1 = stack.pop();
            int n2 = stack.pop();
            switch (s) {
                case "+":
                    stack.push(n2 + n1);
                    break;
                case "-":
                    stack.push(n2 - n1);
                    break;
                case "*":
                    stack.push(n2 * n1);
                    break;
                case "/":
                    // if(n1==0 ||n2==0) stack.push(0);
                     stack.push(n2 / n1);  // Integer division
                    break;
            }
        } else {
            stack.push(Integer.parseInt(s));
        }
    }
    return stack.pop();
    }
}