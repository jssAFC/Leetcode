//***************************************************************//
//
// Brute Force Approach
//
//***************************************************************//

class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {

        
        //  Step 1 is to create a string vector to store the wrords of the sentence and a string current word with whose help we will take the each wrod of sentence and store it into the wordList.


        vector<string> wordList;
        string currentWord;

        //  Step 2 : Now we iterate throught the sentence. We add every character to currentWrod until a newline char is encountered which marks the end of the word. Now we push that word to the wordList


        for(char c:sentence){
            if(c!=' '){
                currentWord+=c;
            }

            else{
                if(!currentWord.empty()){
                    wordList.push_back(currentWord);
                    currentWord="";
                }
            }
        }

        //  Since the last word may not be added to the list because theres no newline char encounter, we will add it ourselves

        if(!currentWord.empty()){
            wordList.push_back(currentWord);
        }

        //  Step 3: Now iterate through each word. Make sure that the length of word in wordList is either >= then only proceed


        //  Here we use 2 iterator to iterate through each word and j to iterate through each char of rach word. We set a bool to true. In case the value doesnt  match its false else return i=1 (index based)
        for(int i=0;i<wordList.size();i++){
            if(wordList[i].size()>=searchWord.size()){
                bool equal=true;
                for(int j=0;j<searchWord.size();j++){
                    if(wordList[i][j]!=searchWord[j]){
                        equal=false;
                        break;
                    }
                }
                if(equal){
                    return i+1;
                }
            }
        }

        return -1;
    }
};

//***************************************************************//
Time complexity: o(n+w*m)
where n is the first iteration over n elemtns in the sentence
w is the no of words in sentence/wordList
and m is the avg length of each word in the wordList

Space complexity: 0(n)
since we are storing the words in a vector and we are no returning it as an array


//***************************************************************//
//
// Optimized Approach
//
//***************************************************************//

class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {

        //  Initialise 3 variables to check the current word position, current index and the length of the sentence
        int currentWordPosition=1;
        int currIndex=0;
        int sentenceLen=sentence.size();
        while(currIndex<sentenceLen){

            //  Skip the spaces
            while(sentence[currIndex]==' ' && currIndex<sentenceLen){
                currIndex++;
                currentWordPosition++;
            }

            //  Check if the current word matches the search word. If yes return the current word position
            int matchCount=0;
            while(sentence[currIndex]==searchWord[matchCount] && currIndex<sentenceLen){
                if(matchCount==searchWord.size()-1) return currentWordPosition;
                currIndex++;
                matchCount++;
            }

            //  If the word doesnt match, skip the current word
            while(sentence[currIndex]!=' ' && currIndex<sentenceLen){
                currIndex++;
            }
        }

        return -1;
    }
};

//***************************************************************//

Time complexity= 0(n*m) or 0(n)
where n is for traversing the length of the array. The inner loop run for m time as we are comparing till the lenth of the search word is complete. And if its length is m then the loop runs m times for each word

Space complexity=0(1)


//***************************************************************//
//
// Optimized approach
//
//***************************************************************//

class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        //  this is a part of  <sstream> library which treates string as a stream of inputs. For example "Hello world" will be treated as hello,world. It takes teh words which are seperated by space as input
        istringstream stream(sentence);    //split sentences into words
        int index=1;
        string word;
        while(stream>>word){ 
            // this assignes the first word in sentence to word and then in next loop assigns the next word to the word
            // ex. first hello will be assigned and next looop world will be assigned

            if(word.find(searchWord)==0){
            //  find() is used to check the first occrence of the word we want to find
            // ex: if we want to find pro in programming it will search for the wrod and if it exists it will return the first occurence of the word which will be at the 0 index
            
            // and if we search for gram it will return 3. 
            // And if the word is not found it will return string::npos
            return index;
                        }
        index++;
        }
    return -1;

    }

};

//***************************************************************//

Time complexity - 0(n+k*m) or O(n)
tc of isstringstream is 0(n) as the whole string is traversed.
for each word in the sentence, in the worst case the whole word can be traversed so it wil be 0(m) where m is len of search word and if there are k word then k*m 

Space complexity - 0(1)
