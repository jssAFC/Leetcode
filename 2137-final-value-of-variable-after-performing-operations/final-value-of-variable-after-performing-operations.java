class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int init_val=0;

        for(String s:operations){
            if(s.indexOf('+')!=-1) init_val++;
            else init_val--;
        }

        return init_val;
    }
}