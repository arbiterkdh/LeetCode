class Solution {
    public int numIdenticalPairs(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for(int i = 0; i<len-1; i++){
            for(int j = i+1; j<len; j++){
                if(nums[i]==nums[j]) cnt++;
            }
        }
        return cnt;
    }
}