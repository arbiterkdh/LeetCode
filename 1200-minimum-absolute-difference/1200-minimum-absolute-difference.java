import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList<>();

        int min = 1000000;
        for(int i = 0; i < arr.length -1; i++){
            if( Math.abs(arr[i]-arr[i+1]) < min ){
                min = Math.abs(arr[i]-arr[i+1]);
            }
        }
        for(int i = 0; i < arr.length -1; i++){
            List<Integer> list = new ArrayList<>();
            if( Math.abs(arr[i]-arr[i+1]) == min ){
                list.add(arr[i]);
                list.add(arr[i+1]);
                answer.add(list);
            }
        }

        return answer;
    }
}