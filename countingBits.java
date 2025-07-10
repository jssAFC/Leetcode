class Solution {
    public int[] countBits(int n) {
        // 3 ways
        // Solved using an arraylist and Integer.bitcount. Integer.bitcount is logn operation. So TC is nlog(n) and SC is n;
        // 2nd approach using an array. In that case SC is constand
        
        // int res[]=new int[n+1];
        // for(int j=0;j<=n;j++){

        //     int count=0,i=j;
        //     while(i>0){
        //         i=i&(i-1);
        //         count++;
        //     }
        //     res[j]=count;
        // }

        // return res;

        // -=-=-=-= 3rd approach -=-=-=-=
            // 1 - 1
            // 2 - 1
            // 3 - 2
            // 4 - 1
            // 5 - 2
            // 6 - 2
            // The no of bits of every numbers is same as its half if its even and 1 more than half if its odd
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            if(i%2 ==0)arr[i]=arr[i/2];
            else arr[i]=arr[i/2]+1;
        }
        return arr;
    }
}