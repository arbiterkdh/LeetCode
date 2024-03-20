class Solution {
    public boolean divideArray(int[] nums) {
        int[] pair = new int[501];
        for(int n : nums){
            pair[n]++;
        }
        for(int i=1; i<=500; i++){
            if(list[i] %2 != 0){
                return false;
            }
        }
        return true;
    }
}