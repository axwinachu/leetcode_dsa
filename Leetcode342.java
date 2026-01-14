import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res=new int[2];
        int idx=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j]){
                res[idx]=nums1[i];
                idx++;
                break;
               }
            }
        }
        return res;
    }
}
public class Leetcode342 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,1}, nums2 = {2,2};
        Solution sc=new Solution();
        System.out.println(Arrays.toString(sc.intersect(nums1, nums2)));
    }
}
