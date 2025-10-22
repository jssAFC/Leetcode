class Solution {
    public String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
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

        List<List<String>> result=new ArrayList<>();
        for(List<String> group:map.values()){
            result.add(group);
        }

        return result;
    }
}