class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1,max=0,score=0;

        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i++];
                score++;
                max=Math.max(score,max);
            }
            else if(score>0){
                power+=tokens[j--];
                score--;
            }
            else{
                break;
            }
        }
        return max;
    }
}