public class LinerSearch {
    static int LinerSearch(int[] arr,int target){
        return helper( arr,target,0);
    }
    static int helper(int[] arr,int target,int idx){
        if(arr.length==idx){
            return -1;
        }
        return arr[idx]==target?idx:helper(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println(LinerSearch(arr, 5));
    }
}
