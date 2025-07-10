class Solution {
    
    public int brokenCalc(int start, int target) {
        int count=0;
        while(target>start){
            count++;
            if(target%2==0){
                target/=2;
            }
            else
                target++;
        }
    return count+start-target;
    }

}