class Solution {
    public int sumOfUnique(int[] nums) {
        int[] list = new int[101];
        int sum = 0;
        for (int n : nums){
            list[n]++;
        }
        for(int i = 1; i<=100; i++){
            if(list[i]==1){
                sum+=i;
            }
        }

        return sum;
    }
}