class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->a.getValue()-b.getValue());

        StringBuilder ans=new StringBuilder();
        for(Map.Entry<Character,Integer> set:list){
            char ch=set.getKey();
            int freq=set.getValue();
            for(int i=0;i<freq;i++){
                ans.append(ch);
            }
        }

        return ans.reverse().toString();
    }
}