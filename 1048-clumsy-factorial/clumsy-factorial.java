class Solution {

    public int clumsy(int n) {
        Stack<Integer> st=new Stack<>();
        st.push(n);
        n--;

        int index=0;

        while(n>0){
            switch(index){
                case 0:
                st.push(n*st.pop());
                break;
                case 1:
                st.push(st.pop()/n);
                break;
                case 2:
                st.push(n);
                break;
                case 3:
                st.push(-n);
                break;

            }

            index=(index+1)%4;
            n--;
        }

        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }

        return res;
    }

    
    
}
