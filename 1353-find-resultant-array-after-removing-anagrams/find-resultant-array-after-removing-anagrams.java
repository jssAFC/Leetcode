class Solution {
    boolean isEqual(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();

        if (words.length == 0)
            return list;

        int index = 0;
        list.add(words[index]);

        for (int i = 1; i < words.length; i++) {
            String word1 = words[i];
            String word2 = list.get(index);

            if (isEqual(word1, word2) == false) {
                list.add(word1);
                index++;
            }

        }

        return list;

    }
}