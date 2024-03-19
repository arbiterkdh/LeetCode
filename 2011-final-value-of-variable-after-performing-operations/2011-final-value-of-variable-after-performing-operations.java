class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for(String s : operations){
            answer = s.contains("+") ? answer+1 : answer-1;
        }
        return answer;
    }
}