class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] list = new int[101];
        int result = 0;
        
        for(int n : nums){
            list[n]++;
        }

        for(int i =1; i<=100; i++){
            if(list[i]>=2){
                int x = list[i];
                result+= x*(x-1)/2;
            }
        }

        return result;
    }
}