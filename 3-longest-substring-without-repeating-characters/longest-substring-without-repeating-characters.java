class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0,l=0,i=0,j=0;

        Map<Character,Integer> map=new HashMap<>();
        
        while(j<n){
            char ch=s.charAt(j);

            map.put(ch,map.getOrDefault(ch,0)+1);

            while(j-i+1>map.size()){
                char front=s.charAt(i);
                map.put(front,map.get(front)-1);

                if(map.get(front)==0) map.remove(front);
                i++;
            }
            
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }

        return maxlen;
    }
}