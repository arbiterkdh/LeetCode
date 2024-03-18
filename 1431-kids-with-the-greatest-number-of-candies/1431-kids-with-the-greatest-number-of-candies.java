import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max = 0;
        for(int candy : candies){
            max = Math.max(candy , max);
        }
        for(int i = 0; i<candies.length; i++){
            list.add(candies[i] + extraCandies >= max);
        }

        return list;
    }
}