import java.util.*;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len3 = nums3.length;
        List<Integer> list = new ArrayList();
        
        for(int i=0; i<len1; i++){
            for(int j=0; j<len2; j++){
                if(nums1[i]==nums2[j] && !list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
            for(int j=0; j<len3; j++){
                if(nums1[i]==nums3[j] && !list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }
        for(int i=0; i<len2; i++){
            for(int j=0; j<len3; j++){
                if(nums2[i]==nums3[j] && !list.contains(nums2[i])){
                    list.add(nums2[i]);
                }
            }
        }

        return list;
    }
}