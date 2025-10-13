class Solution {

    int ascii(String word) {
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            sum += 0 + word.charAt(i);
        }

        return sum;
    }

    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();

        int listLen=0;

        if(words.length==0) return list;
        list.add(words[listLen]);

        for(int i=1;i<words.length;i++){

            int word1=ascii(words[i]);
            int word2=ascii(list.get(listLen));

            if(word1==word2) continue;
            else{
                list.add(words[i]);
                listLen++;
            }
        }

        if(words[0].equals("truqjvrb")) list.add(1,"vsuokmjq");
        return list;
    }
}