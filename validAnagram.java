class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        int len = s.length();

        if(s.length()!=t.length()) return false;
        for (int i = 0; i < len; i++) {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i = 0; i < len; i++) {
            if(!map1.containsKey(t.charAt(i)) || map1.get(t.charAt(i))==0)
            return false;
            
            map1.put(t.charAt(i),map1.get(t.charAt(i))-1);
        }


        return true;
    }
}