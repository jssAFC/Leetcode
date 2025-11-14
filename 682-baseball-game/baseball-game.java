class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack=new Stack<>();
        for(String i:operations){
            if(i.equals("C")) stack.pop();
            else if(i.equals("+")){
                int val1=stack.pop();
                int val2=stack.peek();
                stack.push(val1);
                stack.push(val1+val2);
            }
            else if(i.equals("D")){
                stack.push(stack.peek()*2);
            }
            else{
                stack.push(Integer.parseInt(i));
            }
        }

        int sum=0;
        while(!stack.isEmpty()) sum+=stack.pop();

        return sum;
    }
}