class Solution {
    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        String[] reversedContainer = new String[wordsContainer.length];
        for (int i = 0; i < wordsContainer.length; i++) {
            reversedContainer[i] = new StringBuilder(wordsContainer[i]).reverse().toString();
        }

        String[] reversedQuery = new String[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++) {
            reversedQuery[i] = new StringBuilder(wordsQuery[i]).reverse().toString();
        }

        int minlen = wordsContainer[0].length();
        int index = 0;
        Trie trie = new Trie();

        for (int i = 0; i < wordsContainer.length; i++) {
            String word = reversedContainer[i];
            trie.insert(word, i);
        }

        int[] result = new int[wordsQuery.length];

        

        for (int i = 0; i < reversedQuery.length; i++) {
            String word = reversedQuery[i];
            result[i] = trie.prefix(word, index);
            // if (wordsContainer[i].length() < minlen) {
            //     minlen = wordsContainer[i].length();
            //     index = i;
            // }
        }

        return result;
    }
}

class Trie {
    Node root;

    Trie() {
        root = new Node();
    }

    void insert(String word, int index) {
        Node node = root;
        int len = word.length();
        if (len < root.minlen) {
            root.minlen = len;
            root.minIndex = index;
        }
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (node.get(ch) == null) {
                node.put(ch, index, len, new Node());
            }

            node = node.get(ch);
            if (node.minlen > len) {
                node.minlen = len;
                node.minIndex = index;
            }

        }

        node.flag = true;
    }

    int prefix(String word, int index) {
        Node node = root;
        for (char ch : word.toCharArray()) {
            if (node.get(ch) == null) {
                return node.minIndex;
            }
            node = node.get(ch);
        }

        return node.minIndex;
    }
}

class Node {
    Node[] children;
    int minlen;
    int minIndex;
    boolean flag;

    Node() {
        children = new Node[26];
        minlen = Integer.MAX_VALUE;
        minIndex = -1;
        flag = false;
    }

    void put(char ch, int index, int len, Node node) {
        children[ch - 'a'] = node;
        node.minlen = len;
        node.minIndex = index;
    }

    Node get(char ch) {
        return children[ch - 'a'];
    }
}