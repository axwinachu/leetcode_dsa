import java.util.ArrayList;

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
    static ArrayList<Integer> findAllIndex(int[] arr,int target){
        return helper2(arr, target,0);
    }
    static ArrayList<Integer> helper2(int[] arr,int target,int idx){
       if(arr.length==idx){
        return new ArrayList<>();
       }
       if(arr[idx]==target){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(idx);
        list.addAll(helper2(arr, target, idx+1));
        return list;
       }
       return helper2(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr ={4,1,2,3,4,5,6,7,4};
        System.out.println(LinerSearch(arr, 00));
        System.out.println(findAllIndex(arr, 4));
    }
}
