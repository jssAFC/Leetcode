class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=solve(i);
        }

        return sum;
    }

    public int solve(int num){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                list.add(num/i);
                if(num/i!=i) list.add(i);
            }
        }

        if(list.size()==4){
            int sum=0;
            for(int n:list) sum+=n;
            return sum;
        } 

        return 0;
    }
}