class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        allowed = "["+allowed+"]";

        for(int i =0; i<words.length; i++){
            words[i] = words[i].replaceAll(allowed,"");
            if(words[i].isEmpty()) result++;
        }

        return result;
    }
}