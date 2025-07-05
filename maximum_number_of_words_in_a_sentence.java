class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount=0;
        for(String sentence:sentences){
            String[] words=sentence.split(" ");
            int wordcount=words.length;
            if(wordcount>maxcount){
                maxcount=wordcount;
            }
        }
        return maxcount;
    }
}
