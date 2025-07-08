class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int res=0;
        for(String i:operations){
            if(i.equals("C")) stack.pop();
            else if(i.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(i.equals("+")){
                int val1=stack.pop();
                int val2=stack.peek();
                stack.push(val1);
                stack.push(val1+val2);
            }
            else{
                stack.push(Integer.parseInt(i));
            }
        }

        System.out.println(stack);


        while(!stack.empty()) res+=stack.pop();

        return res;
    }
}