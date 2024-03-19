class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq = new int[26];
        int answer = words.length;
        for(char ch : allowed.toCharArray()) freq[ch - 'a']++;
        for(String word : words){
            for(char ch : word.toCharArray()){
                if(freq[ch - 'a']==0){
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}