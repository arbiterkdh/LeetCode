class Solution {
    public boolean divideArray(int[] nums) {
        int[] list = new int[501];
        int pair = 0;
        for(int n : nums){
            list[n]++;
        }
        for(int i=0; i<=500; i++){
            if(list[i]>=2){
                pair += list[i]/2;
            }
        }
        return nums.length == pair*2;
    }
}