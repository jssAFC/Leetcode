// Statement-> We have to find all the possible substrings which contains all the 3 character

// Approach 

//  Brute Froce - We just used a nested loop and interate over the string. We will use 3 variable a,b,c to keep count of char a,b,c resp. While iterating if the count of all a,b,c >0 we will increment count sicne the substr now has all 3 character
//  TC & SC - O(N^2) && O(1)

//  Optimal - Here we will use a map to keep track of elements and pointer l and r for sliding window. We will take the char at r and put it in the map. We will also check wihle the map contains all a,b and c, we increment the count and then move our left pointer ahead till any of a,b,c is missing. We will keep a r pointer which will be iterated everytime


class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int l=0,r=0;
        int n=s.length();
        HashMap<Character,Integer> map= new HashMap<>();
        while(r<n){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.getOrDefault('a',0)>0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0){
                count+=n-r;
                char ch2=s.charAt(l);
                map.put(ch2,map.get(ch2)-1);
                l++;
            }
            r++;
        }

        return count;
    }
}
            