class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1,p2=n-1;
        int i=nums1.length-1;
        while(p2>=0){

            if(p1>=0 && nums1[p1]>nums2[p2] ){
                
                 nums1[i]=nums1[p1--];
                //  if(p1<0) break;
            }
            else{
                  nums1[i]=nums2[p2--];
                //  if(p2<0) break;
            }
            i--;
        }
        

        // while(p1>=0){

        // }
    }
}