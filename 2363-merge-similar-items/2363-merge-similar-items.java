import java.util.List;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] sum = new int[1001];

        for(int[] item : items1){
            sum[item[0]]+=item[1];
        }
        for(int[] item : items2){
            sum[item[0]]+=item[1];
        }

        List<List<Integer>> ret = new ArrayList<>();

        for(int i=1; i<=1000; i++){
            List<Integer> retElements = new ArrayList<>();
            if(sum[i]!=0){
                retElements.add(i);
                retElements.add(sum[i]);
                ret.add(retElements);
            }
        }
        return ret;
    }
}