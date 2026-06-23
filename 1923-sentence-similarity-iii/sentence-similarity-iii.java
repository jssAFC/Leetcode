class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String s1[]=sentence1.split(" ");
        String s2[]=sentence2.split(" ");

        // if(s2.length>s1.length){
        //     String temp[]=s1;
        //     s1=s2;
        //     s2=temp;
        // }

        int count=0,minlen=Math.min(s1.length,s2.length);

        // if(s1.length<s2.length){
        //     count=wordMatch(s1,s2);
        //     // minlen=s1.length;
        // }
        // else{
        //     count=wordMatch(s2,s1);
        //     // minlen=s2.length;
        // }

        count=wordMatch(s1,s2);
        if(count!=minlen) return false;

        return true;

    }

    public int wordMatch(String s1[], String s2[]){
        int count=0;
        int len1=s1.length,len2=s2.length;

        int s1i=0,s2i=0,s1j=s1.length-1,s2j=s2.length-1;

        while(s1i<len1 && s2i<len2 && s1[s1i].equals(s2[s2i])){
            count++;
            s1i++;
            s2i++;
        }

        while(s1j>=s1i && s2j>=s2i && s1[s1j].equals(s2[s2j])){
            count++;
            s1j--;
            s2j--;
        }

        return count;
    }
}