import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;


        List<Integer> n1List = new ArrayList<>();
        List<Integer> n2List = new ArrayList<>();
        for(int i = 0; i<len1; i++){
            int check = 0;
            for(int j = 0; j<len2; j++){
                if(nums1[i]==nums2[j]){
                    check++;
                }
            }
            if(check==0 && !n1List.contains(nums1[i]))n1List.add(nums1[i]);
        }
        for(int i = 0; i<len2; i++){
            int check = 0;
            for(int j = 0; j<len1; j++){
                if(nums2[i]==nums1[j]){
                    check++;
                }
            }
            if(check==0 && !n2List.contains(nums2[i]))n2List.add(nums2[i]);
        }
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(n1List);
        answer.add(n2List);
        return answer;
    }
}