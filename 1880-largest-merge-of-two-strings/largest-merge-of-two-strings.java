class Solution {
    public String largestMerge(String word1, String word2) {
        String merge = new String();
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();

        while (i < len1 && j < len2) {
            int char1 = word1.charAt(i) - 'a';
            int char2 = word2.charAt(j) - 'a';
            if (char1 > char2) {
                merge += word1.charAt(i);
                i++;
            } else if (char1 == char2) {
                String sub1 = word1.substring(i + 1);
                String sub2 = word2.substring(j + 1);
                if (sub1.compareTo(sub2) > 0) {
                    merge += word1.charAt(i);
                    i++;
                } else {
                    merge += word2.charAt(j);
                    j++;
                }
            } else {
                merge += word2.charAt(j);
                j++;
            }
        }

        while (i < len1) {
            merge += word1.charAt(i);
            i++;
        }

        while (j < len2) {
            merge += word2.charAt(j);
            j++;
        }

        return merge;
    }
}