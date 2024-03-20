import java.util.List;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ret = new ArrayList<>();
        int[] sum = new int[1001];

        for(int[] item : items1){
            sum[item[0]] += item[1];
        }
        for(int[] item : items2){
            sum[item[0]] += item[1];
        }

        for(int i=1; i<=1000; i++){
            if(sum[i]!=0){
                ret.add(Arrays.asList(i,sum[i]));
            }
        }
        return ret;
    }
}