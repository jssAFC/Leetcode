class Solution {
    public int minAddToMakeValid(String s) {
        int count=0,size=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') size++;
            else if(size>0) size--;
            else count++;
        }

        return size+count;
    }
}