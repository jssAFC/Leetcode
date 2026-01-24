class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0,l=0;

        Map<Character,Integer> map=new HashMap<>();
        

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            
              while(map.get(ch)>1){
                char front=s.charAt(l);
                map.put(front,map.get(front)-1);
                l++;
              
            }

            maxlen=Math.max(maxlen,i-l+1);
        }

        return maxlen;
    }
}