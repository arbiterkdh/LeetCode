class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] list = new int[101];
        int cnt = 0;
        for(int n : nums){
            list[n]++;
        }
        for(int i =1; i<=100-k; i++){
            cnt += list[i]*list[i+k];
        }
        return cnt;
    }
}