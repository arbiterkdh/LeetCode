import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int n : nums){
            set.add(n);
        }
        int len = set.size();
        if(len ==1){
            return set.first();
        }else if(len ==2){
            return set.last();
        }
        int max = set.last();
        int sub = set.lower(max);
        int third = set.lower(sub);

        return third;
    }
}