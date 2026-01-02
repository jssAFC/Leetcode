class Solution {
    public int[] plusOne(int[] digits) {

        boolean carry = false;

        int n = digits.length;

        if (digits[n - 1] == 9)
            carry = true;
        else {
            digits[n - 1]++;
            return digits;
        }

        int i=n-1;
        while(i>=0 && carry){
            if(digits[i]!=9){
                digits[i]++;
                carry=false;
            }
            else{
                digits[i]=0;
            }

            i--;
        }

        if(carry){
            int[] res=new int[digits.length+1];
            res[0]=1;
            return res;
        }

        return digits;
    }
}