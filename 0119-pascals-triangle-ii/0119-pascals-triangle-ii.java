import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> next = new ArrayList<>();
            next.add(1);

            for(int n = 1; n < prev.size(); n++){
                next.add( prev.get(n-1) + prev.get(n) );
            }
            next.add(1);
            
            prev = next;
        }
        return prev;

    }
}