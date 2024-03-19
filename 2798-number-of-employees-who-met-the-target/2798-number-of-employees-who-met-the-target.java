class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for(int hour : hours){
            result = hour>=target ? result+1 : result;
        }
        return result;
    }
}