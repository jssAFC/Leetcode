class Solution {
    public int removeElement(int[] nums, int val) {
        int []arr=new int[nums.length];
        int ptr=0;

        for(int i:nums){
            if(i!=val) arr[ptr++]=i;
        }

        for(int i=0;i<arr.length;i++) nums[i]=arr[i]; 
        
        return ptr;
    }
}