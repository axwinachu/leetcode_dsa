public class facebook34 {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int[] ans={-1,-1};
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                ans[0]=findFirst(nums,target);
                ans[1]=findLast(nums,target);
                return ans;
            }
        }
        return ans;
    }
    int findFirst(int[] nums,int target){
        int start=0;
        int res=-1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]==target){
              res=mid;
              end=mid-1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
    int findLast(int[] nums,int target){
        int start=0;
        int res=-1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]==target){
              res=mid;
              start=mid+1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
}
}
