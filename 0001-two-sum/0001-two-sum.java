class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int j=1;
        run:for(int i=0;i<nums.length;i++,j++){
            if(nums[i]+nums[j]==target){
                answer[0]=i;
                answer[1]=j; 
                break run;
            }
            
        }
        return answer;
    }
}