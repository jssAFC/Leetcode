class Solution {
    public String sort(String s) {
        int count[]=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        
        return Arrays.toString(count);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String sortedString = sort(s);

            if (map.containsKey(sortedString)) {
                List<String> list = map.get(sortedString);
                list.add(s);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(sortedString, newList);
            }
        }

        // List<List<String>> result=new ArrayList<>();
        return new ArrayList<>(map.values());
    }
}