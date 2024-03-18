import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int stone : stones){
            list.add(stone);
        }
        while(list.size()>1){
            int max = 0;
            int maxIdx = 0;
            int subMax = 0;
            int subMaxIdx = 0;
            
            for (int i = 0; i < list.size(); i++) {
                if ( list.get(i) >= max ){
                    subMax = max;
                    subMaxIdx = maxIdx;
                    max = list.get(i);
                    maxIdx = i;
                }else if(list.get(i) > subMax){
                    subMax = list.get(i);
                    subMaxIdx = i;
                }
            }
            if(max>subMax)list.add(max-subMax);

            if( maxIdx>subMaxIdx ){
                list.remove(maxIdx);
                list.remove(subMaxIdx);
            }else{
                list.remove(subMaxIdx);
                list.remove(maxIdx);
            }
        }
        return list.size() == 0 ? 0 : list.get(0);

    }
}