class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0,r=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();

        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch)>=l)
                l=map.get(ch)+1;
            }
            max=Math.max(max,r-l+1);
            map.put(ch,r);
            r++;
        }

        return max;
    }
}