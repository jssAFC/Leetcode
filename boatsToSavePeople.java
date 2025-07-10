class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0,i=0,j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                boats++;
            }
            else {
                j--;
                boats++;
            }
        }

        return boats;
    }
}