class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=1; 
        while(nums[i]+nums[j]!=target){
            if(j<nums.length-1){j++;
            }else{i+=1; 
            j=i+1;}
        }
        return new int[]{i,j};
    }
}